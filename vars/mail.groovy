def call(String sub, String to, String msg1, String msg2){
               success{
                       emailext subject: "$sub",
                                     to: "$to",
                                   body: "$msg1"
                       }
               failure{
                       emailext subject: "$sub",
                                     to: "$to",
                                   body: "$msg2"
                      }
                
                               
}
