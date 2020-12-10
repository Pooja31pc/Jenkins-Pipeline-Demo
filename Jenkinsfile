node{
  stage ('SCM Checkout'){
  git 'https://github.com/Pooja31pc/Jenkins-Pipeline-Demo'
  }
  stage ('Compile-Package'){
    def mvnHome = tool name: 'maven 3.6.0', type: 'maven'
    bat "${mvnHome}/bin/mvn package"
  }
 }
