// def call(String project, String ImageTag, String hubUser){

//     sh """
      
//       trivy image ${hubUser}/${project}:latest > scan.txt
//       cat scan.txt

//     """
// }
 def call(String aws_account_id, String region, String reponame){
sh """
  trivy image ${reponame}:latest 
  trivy image ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${reponame}:latest  > scan.txt
  cat scan.txt

"""

}