node {
   // This is to demo github action	
   stage('SCM Checkout'){
    // Clone repo
   git: ' https://github.com/khalilboye/spring-boot-dev.git '
   }
   stage('Compile-Package'){
	   // Build using maven
	checkout([$class: 'GitSCM', branches: [[name: '*/master']], 
		  doGenerateSubmoduleConfigurations: false, 
		  extensions: [[$class: 'PerBuildTag']], 
		  submoduleCfg: [], 
		  userRemoteConfigs: [[url: 'https://github.com/khalilboye/spring-boot-dev.git']]])
   }
   }
