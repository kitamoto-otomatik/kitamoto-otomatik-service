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
                        dockerImage = docker.build(registry + "latest")
                        dockerImage.push()
                    }
                }
            }
        }
    }
}
