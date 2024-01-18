sh """
   sh docker rmi ${hubUser}/${project}:${ImageTag}
    sh docker rmi ${hubUser}/${project}:latest
   """ 