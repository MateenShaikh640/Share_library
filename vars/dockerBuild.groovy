def call(String project, String ImageTag, String hubUser){

    sh """
    
      docker image build -t ${hubUser}:${project} .
      docker image tag -t ${hubUser}:${project} ${hubUser}/${project}:${ImageTag}
      docker image tag -t ${hubUser}:${project} ${hubUser}/${project}:latest 

    """
}