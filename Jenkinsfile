pipeline {
    agent any

    environment {
        REPORT_FILE = 'addition-report.html'
    }

    stages {
        stage('Parallel Addition Calculations') {
            parallel {
                stage('Addition 1') {
                    steps {
                        script {
                            def number1 = 10
                            def number2 = 20
                            def sum = number1 + number2
                            echo "The sum of ${number1} and ${number2} is: ${sum}"
                            currentBuild.description = currentBuild.description ? currentBuild.description + "\nAddition 1: ${sum}" : "Addition 1: ${sum}"
                        }
                    }
                }
                stage('Addition 2') {
                    steps {
                        script {
                            def number1 = 30
                            def number2 = 40
                            def sum = number1 + number2
                            echo "The sum of ${number1} and ${number2} is: ${sum}"
                            currentBuild.description = currentBuild.description ? currentBuild.description + "\nAddition 2: ${sum}" : "Addition 2: ${sum}"
                        }
                    }
                }
                stage('Addition 3') {
                    steps {
                        script {
                            def number1 = 50
                            def number2 = 60
                            def sum = number1 + number2
                            echo "The sum of ${number1} and ${number2} is: ${sum}"
                            currentBuild.description = currentBuild.description ? currentBuild.description + "\nAddition 3: ${sum}" : "Addition 3: ${sum}"
                        }
                    }
                }
            }
        }

        stage('Generate Report') {
            steps {
                script {
                    // Create a simple HTML report
                    writeFile(file: REPORT_FILE, text: '''
                        <html>
                        <head><title>Calculation Report</title></head>
                        <body>
                            <h1>Calculation Report</h1>
                            <p>Addition 1: 10 + 20 = 30</p>
                            <p>Addition 2: 30 + 40 = 70</p>
                            <p>Addition 3: 50 + 60 = 110</p>
                        </body>
                        </html>
                    ''')
                    echo 'HTML report generated.'
                }
            }
        }

        stage('Send Email') {
            steps {
                script {
                    // Send email with the HTML report as attachment
                    emailext(
                        to: 'ksakash1699@gmail.com',
                        subject: 'Addition Calculation Report',
                        body: 'Please find the addition calculation report attached.',
                        attachmentsPattern: REPORT_FILE,
                        mimeType: 'text/html'
                    )
                    echo 'Email sent with the report.'
                }
            }
        }
    }

    post {
        always {
            echo 'Cleaning up after pipeline execution.'
        }
    }
}
