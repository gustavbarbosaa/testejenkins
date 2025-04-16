pipeline{
    agent any
    stages{
        stage('build') {
          bat 'mvn clean package -DskipTests'
        }
        stage('test') {
          bat 'mvn test'
        }
        stage('deploy') {
          deploy adapters: [tomcat9(credentialsId: 'tomcat-luciano', path: '', url: 'http://172.16.31.201:9000')], contextPath: 'workshop-pipeline', war: 'target/workshop.war'
        }
    }
}