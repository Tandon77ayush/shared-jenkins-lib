def call(){
       sh 'docker compose down'
       sh "docker compose build --no-cache"
}
