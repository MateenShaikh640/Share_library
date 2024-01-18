// sh """
//    sh docker rmi ${hubUser}/${project}:${ImageTag}
//     sh docker rmi ${hubUser}/${project}:latest
//    """ 

 def call(String aws_account_id, String region, String reponame){
sh """
   docker rmi ${reponame}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${reponame}:latest

"""
 }