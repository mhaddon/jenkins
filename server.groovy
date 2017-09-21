pipelineJob('Test') {
    configure { project ->
        project / builders << 'org.foo.FooBuilder' {
            userName('a')
            password('a')
            credentialsId('ojfsa')
        }
    }

    definition{
        cpsScm {
            scm {
                git('https://github.com/mhaddon/SpringBoot-AirportDemoProject.git', 'tests')
            }
        }
    }
    triggers {
        scm('H/15 * * * *')
    }
}
