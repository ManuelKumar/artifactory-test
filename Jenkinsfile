pipeline{
  agent any
  parameters{
    choice(name: 'VERSION', choices:   ['1.0.0','1.0.1','1.0.2'], description: '')
    booleanParam(name: 'executeTests', defaultValue: true, description: '')
  }  
  stages{
    stage ("build") {
      steps {
        echo  'This is build !!!!!! '
      }
    } 
    stage ("test") {
      when{
        expression{
          params.executeTests
        }  
      }  
      steps {
        echo  'This is test !!!!!! '
      }
    }
    stage ("deploy") {
      steps {
        echo  'This is deploy !!!!!! '
        echo  "This is deploy !!!!!! ${VERSION}"
      }
    }     
  }
}
