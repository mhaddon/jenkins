job('Test') {
    scm {
        git{
            url('https://github.com/mhaddon/SpringBoot-AirportDemoProject.git')
            branch('tests')
        }
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
        maven {
            mavenInstallation('myMaven')
            goals('clean')
            goals('test')
        }
    }
}