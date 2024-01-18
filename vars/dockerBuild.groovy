// def call(String project, String ImageTag, String hubUser){

//     sh """

//       docker image build -t ${hubUser}:${project} .
//       docker image tag  ${hubUser}:${project} ${hubUser}/${project}:${ImageTag}
//       docker image tag  ${hubUser}:${project} ${hubUser}/${project}:latest 

//     """
// }

 def call(String aws_account_id, String region, String reponame){
sh """
   docker build -t mateenshaikh01 .
   docker tag mateenshaikh01:latest 316958124144.dkr.ecr.ap-south-1.amazonaws.com/mateenshaikh01:latest

"""
  // docker build -t ${reponame} .
  //  docker tag ${reponame}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${reponame}:latest


}