pipelineJob('Test') {
    definition{
        cpsScm {
            scm {
                git('https://github.com/mhaddon/SpringBoot-AirportDemoProject.git', 'tests') {
                    configure { project ->
                        project / builders << 'org.foo.FooBuilder' {
                            userName('a')
                            password('a')
                            credentialsId('ojfsa')
                        }
                    }
                }
            }
        }
    }
    triggers {
        scm('H/15 * * * *')
    }
}
