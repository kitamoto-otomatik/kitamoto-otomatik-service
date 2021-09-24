pipeline {
    agent any
    stages {
        stage('Build Project') {
            steps {
                bat 'mvn clean verify package'
            }
        }
        stage('Build Image') {
            steps {
                script {
                     def image = docker.build("nikkinicholasromero/kitamoto-otomatik-service-image:latest")
                }
            }
        }
    }
}
