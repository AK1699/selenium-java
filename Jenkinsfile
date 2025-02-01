pipeline {
    agent any
    environment {
        NUMBER1 = 50
        NUMBER2 = 10
    }
    stages {
        stage('Addition') {
            steps {
                script {
                    def sum = (NUMBER1 + NUMBER2)
                    echo "The Added value is ${sum}"
                }
            }
        }
        stage('Subtraction') {
            steps {
                script {
                    def sub = (NUMBER1 - NUMBER2)
                    echo "The Subtracted value is ${sub}"
                }
            }
        }
        stage('Multiplication') {
            steps {
                script {
                    def mul = (NUMBER1 * NUMBER2)
                    echo "The Multiplied value is ${mul}"
                }
            }
        }
        stage('Division') {
            steps {
                script {
                    def divide = (NUMBER1 / NUMBER2)
                    echo "The Divided value is ${divide}"
                }
            }
        }
    }
}
