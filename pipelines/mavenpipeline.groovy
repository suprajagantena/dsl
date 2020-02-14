node() {

 stage('Maven build') {
 buildInfo = rtMaven.run pom: 'maven/pom.xml', goals: 'clean package'
 }

}
