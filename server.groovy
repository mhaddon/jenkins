pipelineJob('Test') {
    scm {
        git('https://github.com/mhaddon/SpringBoot-AirportDemoProject.git', 'tests')
    }
    triggers {
        scm('H/15 * * * *')
    }
    steps {
        maven {
            mavenInstallation('myMaven')
            goals('clean')
            goals('compile')
        }
    }
}