def call() {
    stage('Build') {
      echo "building the application....."
      sh 'mvn clean package -DskipTests'
    }
}
