pipeline {
    agent any

    tools {
        maven 'Maven 3'
    }

    stages {
        stage('Build WAR') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Deploy to Tomcat') {
    steps {
        bat 'copy target\\task-0.0.1-SNAPSHOT.war "C:\\Program Files\\apache-tomcat-9.0.104\\apache-tomcat-9.0.104\\webapps\\task.war"'
    }
}
    }
}
