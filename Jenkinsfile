pipeline {
  agent any
  stages {
    stage('Bees Buzz') {
      steps {
        echo 'Hello'
      }
    }

    stage('Buzz Buzz') {
      steps {
        echo 'You are in'
      }
    }

    stage('Deploy') {
      steps {
        sh 'sleep 5'
        sh 'echo \'Deployed\''
      }
    }

  }
}