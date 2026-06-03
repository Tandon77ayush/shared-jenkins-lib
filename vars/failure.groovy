def call(String sub, String to, string msg){
                emailext(
                         subject: '$sub',
                         to: '$to',
                         body: '$msg'
                )
  
}
