pipeline {
  agent any
  stages {
    stage('Bees Buzz') {
      steps {
        echo 'Hello Bees Buzz!!!'
      }
    }

    stage('Buzz Buzz') {
      steps {
        echo 'You are in'
        bat(script: 'echo \'Hello ${env.NAME}\'', encoding: 'UTF8', returnStdout: true)
      }
    }

    stage('Deploy') {
      steps {
        bat(encoding: 'UTF8', returnStdout: true, script: 'echo \'Deployed\'', label: 'Deployed')
        writeFile(file: 'Results.log', text: 'The application has been deployed successfully', encoding: 'UTF8')
        archiveArtifacts(artifacts: '*.log', fingerprint: true, onlyIfSuccessful: true)
      }
    }

  }
  environment {
    NAME = 'Jenkins'
  }
}