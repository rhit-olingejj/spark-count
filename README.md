# spark example NDSU

## To submit to local spark in Ubuntu run: 
- ./gradlew build
- spark-submit --class Main build/libs/gradle-simple-2.0.jar
+ To view sparks front end go to http://localhost:4040/ for just on submit

## To build custom master with workers
- in spark/conf put custom configuration files at [script](https://drive.google.com/file/d/1T50kw-sa8_icGvCC4OJ47ru6Fd5PvLXA/view?usp=sharing) 
- To start run: 
  + start-master.sh
  + start-worker.sh spark://localhost:7077
- to see master node front end go to [front end](http://spark.cs.ndsu.edu:8080/)
- To submit job run: 
  - ./gradlew build
  - spark-submit --class Main build/libs/gradle-simple-2.0.jar --master spark://spark.cs.ndsu.edu:7077

## To switch to java 8
- switch settings of project sdk and gradle sdk to java 8 installed from sdkman configure language level to 8



