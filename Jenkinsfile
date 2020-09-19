node {
   // This is to demo github action	
   def mvn = tool (name: 'maven3', type: 'maven') + '/bin/mvn'
   stage('SCM Checkout'){
    // Clone repo
	git branch: 'master', 
		url: 'https://github.com/khalilboye/spring-boot-dev.git'
   
   }
   	
   stage('Mvn Package'){
	   // Build using maven
	   
	   sh "${mvn} clean package deploy"
   }
}
