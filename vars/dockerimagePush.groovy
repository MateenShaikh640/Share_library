// def call(String project, String ImageTag, String hubUser){
//     withCredentials([usernamePassword(
//         credentialsId: 'DockerHub', 
//         passwordVariable: 'PASS', 
//         usernameVariable: 'USER')]) {
    
//     sh "docker login -u '$USER' -p '$PASS'"
// }
//         sh "docker image push ${hubUser}/${project}:${ImageTag}"
//         sh "docker image push ${hubUser}/${project}:latest"
// }

 def call(String aws_account_id, String region, String reponame){
sh """
    aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${region}.amazonaws.com
   docker push${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${reponame}:latest
"""
   //docker push 316958124144.dkr.ecr.ap-south-1.amazonaws.com/mateenshaikh01:latest
  //aws ecr get-login-password --region ap-south-1 | docker login --username AWS --password-stdin 316958124144.dkr.ecr.ap-south-1.amazonaws.com
 }