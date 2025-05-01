pipeline {
    agent any

    stages {
        stage('compile') { //dev
            steps {
                echo "compile the code"
                sh "mvn compile"
            }
        }
        stage('test') { //dev
            steps {
                echo "test the code"
                sh "mvn test"
            }
        }
        stage('package') { //dev
            steps {
                echo "package the code"
                sh "mvn package"
            }
        }
    }
}
