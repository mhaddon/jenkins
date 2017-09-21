pipelineJob('Test') {
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
