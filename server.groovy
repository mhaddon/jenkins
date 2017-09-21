pipelineJob('Test') {
    definition{
        cpsScm {
            scm {
                git {
                    remote {
                        name('origin')
                        url('https://github.com/mhaddon/SpringBoot-AirportDemoProject.git')
                        credentials('3196088f-7b55-4e23-85a4-40866dfeb543')
                    }
                }
                branch('tests')
            }
        }
    }
    triggers {
        scm('H/15 * * * *')
    }
}
