node{
	stage('SCM CheckOut') {
		git 'https://github.com/ManuelKumar/artifactory-test'
	}
	stage('Compile Package') {
		def mvnHome = tool name:'maven-3', type: 'maven'
		bat "${mvnHome}/bin/mvn package"
	}
	stage('SonarQube Analysis') {
		def mvnHome = tool name:'maven-3', type: 'maven'
		withSonarQubeEnv('sonar-1') {
			bat "${mvnHome}/bin/mvn sonar:sonar"
		}	
	}	
	
}
