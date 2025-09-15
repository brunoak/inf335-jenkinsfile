pipeline {
    agent any

    tools {
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                git branch: 'main', url: 'https://github.com/brunoak/INF335-Jenkinsfile'
                sh "cd meu-app; mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                success {
                    junit '**/trabalho05/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'trabalho05/target/*.jar'
                }
            }
        }
    }
}
