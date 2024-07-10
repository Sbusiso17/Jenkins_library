def call() {
      echo "running validation on maven build"
                sh "mvn clean validate"
  }
