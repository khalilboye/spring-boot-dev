node {
   // This is to demo github action	
   stage('SCM Checkout'){
    // Clone repo
	git  'https://github.com/khalilboye/spring-boot-dev'
   
   }
   	
   stage('Compile-Package'){
	   // Build using maven
	   def mvn = tool (name: 'maven-3', type: 'maven') + '/bin/mvn'
	   sh "${mvn} clean package deploy"
   }
}
