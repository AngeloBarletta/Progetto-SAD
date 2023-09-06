echo "Installazione iniziale automatica del servizio Randoop" 
echo "------------------------------------------------" 

./generateRandoopProjects.sh 4 &&
cp -r ./T9_repo_test $HOME/ &&
mv $HOME/T9_repo_test $HOME/.T9_repo_test &&
cd ./RandoopManager &&
mvn clean install 

echo "Fine Installazione" 
