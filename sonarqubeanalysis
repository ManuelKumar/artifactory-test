node{
	stage('SCM CheckOut') {
		git 'https://github.com/ManuelKumar/artifactory-test'
	}
	stage('Compile Package') {
		def mvnHome = tool name:'maven-3', type: 'maven'
		sh "${mvnHome}/bin/mvn package"
	}
	stage('SonarQube Analysis') {
		def mvnHome = tool name:'maven-3', type: 'maven'
		withSonarQubeEnv('sonar-1') {
			sh "${mvnHome}/bin/mvn sonar:sonar"
		}	
	}	
	
}
