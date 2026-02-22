package com.i27academy.builds;


class Docker{
    def jenkins
    Docker(jenkins){
        this.jenkins = jenkins
    }
    //Application build
    def buildApp(appName){
    jenkins.sh """
      echo "Build the $appName application"
      mvn clean package -Dskiptests=true

    """
}
}

