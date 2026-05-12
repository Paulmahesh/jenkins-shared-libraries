def call(url, branch) {
  echo "Cloning the code ..."
  git url:"$(url)", "$(branch)"
  echo "code cloning is successfully"
}
