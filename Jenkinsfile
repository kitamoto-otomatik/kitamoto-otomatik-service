pipeline {
    environment { 
        registry = "nikkinicholasromero/kitamoto-otomatik-service" 
        registryCredential = 'docker_credentials' 
        dockerImage = '' 
    }
    agent any
    stages {
        stage('Build Project') {
            steps {
                bat 'mvn clean verify package'
            }
        }
        stage('Build and Push Image') {
            steps {
                script {
                    docker.withRegistry( '', registryCredential ) { 
                        dockerImage = docker.build(registry)
                        dockerImage.push()
                    }
                }
            }
        }
        stage('Deploy Application') {
            steps {
                bat 'docker run -d -t -p 127.0.0.1:8080:8080 --name kitamoto-otomatik-service nikkinicholasromero/kitamoto-otomatik-service'
            }
        }
    }
}
