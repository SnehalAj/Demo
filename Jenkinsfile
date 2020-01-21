def mvnHome = tool 'M3'
node {
   
   stage ('Checkout'){
   
   git url: 'https://github.com/SnehalAj/Demo.git'
	}
      
	stage("Build"){
             
             sh "${mvnHome}/bin/mvn -Dmaven.test.failure.ignore clean package"
               step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])
      }
          stage("build & SonarQube analysis") {
            agent any
            steps {
              withSonarQubeEnv('My SonarQube Server') {
                sh 'mvn clean package sonar:sonar'
              }
            }
          }
          
        }
