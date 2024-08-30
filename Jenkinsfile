pipeline {
    agent any
    tools {
        maven 'Maven 3.8.1'
    }
    stages {
        stage('Checkout Repos') {
            steps {
                // UI Layer Repository
                git url: 'https://github.com/cschmertz/UiLayer', branch: 'main'

                // API Layer Repository
                dir('api-layer') {
                    git url: 'https://github.com/cschmertz/ApiLayer', branch: 'main'
                }

                // Database Layer Repository
                dir('database-layer') {
                    git url: 'https://github.com/cschmertz/DatabaseLayer', branch: 'main'
                }
            }
        }

        stage('Build and Test UI Layer') {
            steps {
                dir('~IdeaProjects/UiLayer') {
                    sh 'mvn clean install'  // This builds and runs tests for the UI layer
                }
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }

        stage('Build and Test API Layer') {
            steps {
                dir('~IdeaProjects/ApiLayer') {
                    sh 'mvn clean install'  // This builds and runs tests for the API layer
                }
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }

        stage('Build and Test Database Layer') {
            steps {
                dir('~IdeaProjects/DatabaseLayer') {
                    sh 'mvn clean install'  // This builds and runs tests for the Database layer
                }
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
    }

    post {
        always {
            // Clean up workspace after build
            cleanWs()
        }
    }
}
