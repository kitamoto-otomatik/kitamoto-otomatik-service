pipeline {
    def image
    agent any
    stages {
        stage('Build Project') {
            steps {
                bat 'mvn clean verify package'
            }
        }
        stage('Build Image') {
            steps {
                image = docker.build("https://hub.docker.com/r/nikkinicholasromero/kitamoto-otomatik-service-image:latest")
            }
        }
        stage('Push Image') {
            steps {
                image.push('latest')
            }
        }
        stage('Application Startup') {
            steps {
                bat 'docker run -d -t -p 127.0.0.1:8080:8080 --name kitamoto-otomatik-service nikkinicholasromero/kitamoto-otomatik-service-image:latest'
            }
        }
    }
}
