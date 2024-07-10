def call() {
   echo "packaging the project into a .war file"
      sh "mvn clean install"
}
