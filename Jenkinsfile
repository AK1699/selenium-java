pipeline {
    agent any
    environment {
        NUMBER1 = '50'
        NUMBER2 = '10'
    }
    stages {
        stage('Sequencial Execution'){
            stage('Addition') {
            steps {
                script {
                    def sum = (NUMBER1.toInteger() + NUMBER2.toInteger())
                    echo "The Added value is ${sum}"
                }
            }
        }
        stage('Subtraction') {
            steps {
                script {
                    def sub = (NUMBER1.toInteger() - NUMBER2.toInteger())
                    echo "The Subtracted value is ${sub}"
                }
            }
        }
        }
        
        stage("Parallel Execution"){
            parallel{
            stage('Multiplication') {
            steps {
                script {
                    def mul = (NUMBER1.toInteger() * NUMBER2.toInteger())
                    echo "The Multiplied value is ${mul}"
                }
            }
        }
        stage('Division') {
            steps {
                script {
                    def divide = (NUMBER1.toInteger() / NUMBER2.toInteger())
                    echo "The Divided value is ${divide}"
                }
            }
        }
            }
        
        }
    }
}
