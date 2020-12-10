node{
  stage ('SCM Checkout'){
  git 'https://github.com/Pooja31pc/Jenkins-Pipeline-Demo'
  }
  stage ('Compile-Package'){
    def mvnHome = tool name: 'maven', type: 'maven'
    bat "${mvnHome}/bin/mvn package"
  }
 }
