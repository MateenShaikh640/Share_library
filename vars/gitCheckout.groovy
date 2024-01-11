def call(Map stageParams){

    checkout([
        $class: 'GitSCM',
        branch: [[name: stageParams.branch]],
        userRemoteConfigs: [[url: stageParams.url]]
    ])
}