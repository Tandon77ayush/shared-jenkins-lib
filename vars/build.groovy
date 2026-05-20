def call(String appname){
       sh 'docker compose down'
       sh 'docker build -t ${appname} .'
}
