def call(String project, String ImageTag, String hubUser){

    sh """
      
      trivy image ${hubUser}:${project} ${hubUser}/${project}:latest > scan.txt
      cat scan.txt

    """
}