node {
   // This is to demo github action	
   stage('SCM Checkout'){
    // Clone repo
   git: ' https://github.com/khalilboye/spring-boot-dev.git '
   }
   stage('Compile-Package'){
	   // Build using maven
	   def MvnHome = tool name: 'maven-3', type: 'maven'
     sh "${MvnHome}/bin/mvn pakage"
   }
   }
