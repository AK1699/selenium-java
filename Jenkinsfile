node {
    stage('Checkout') {
        echo 'checkout'
    }

    stage('Build') {
        echo "Building the project..."
    }

    stage('Test') {
        echo "Running tests..."
        // try {
        //     sh 'mvn test'
        // } catch (Exception e) {
        //     currentBuild.result = 'FAILURE'
        //     throw e
        // }
    }

    stage('Deploy') {
        if (currentBuild.result == 'SUCCESS') {
            echo "Deploying to production..."
            // sh './deploy.sh'
        } else {
            echo "Build failed, skipping deployment."
        }
    }
}
