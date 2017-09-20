job('Test') {
    scm {
        git('git@github.com:mhaddon/jenkins.git')
    }
    triggers {
        scm('H/15 * * * *')
    }
    steps {
        maven {
            mavenInstallation('myMaven')
            goals('clean')
            goals('package')
        }
    }
}