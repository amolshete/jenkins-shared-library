def call() {
    stage('Test') {
      echo "testing the application....."
      sh 'mvn test'
    }
}
