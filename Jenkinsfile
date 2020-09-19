node {
   // This is to demo github action	
   stage('SCM Checkout'){
    // Clone repo
	git branch: 'master', 
		url: 'https://github.com/khalilboye/spring-boot-dev.git'
   
   }
   	
   stage('Compile-Package'){
	   // Build using maven
	   def mvn = tool (name: 'maven3', type: 'maven') + '/bin/mvn'
	   sh "${mvn} clean package deploy"
   }
}
