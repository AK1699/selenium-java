pipeline{
    agent any 
environment{
    NUMBER1 = '50'
    NUMBER2 = '10'
}
    stages{
       stage('Addition'){
        steps{
            def sum = NUMBER1 +  NUMBER2
            echo "The Added value is ${sum}"
        }
       }
        stage('Subtraction'){
            def sub = NUMBER1 -  NUMBER2
            echo "The subtracted value is ${sub}"
       }
        stage('Multiplication'){
            def mul = NUMBER1 *  NUMBER2
            echo "The Multiplied value is ${mul}"
       } 
        stage('Division'){
            def divide = NUMBER1 /  NUMBER2
            echo "The Divided value is ${divide}"
       }
    }
}