# spark example NDSU

## To submit to local spark in Ubuntu run: 
- ./gradlew build
- spark-submit --conf "spark.driver.extraJavaOptions=--enable-preview" --conf "spark.executor.extraJavaOptions=--enable-preview" --class Main
  build/libs/gradle-simple-2.0.jar build/libs/gradle-simple-2.0-sources.jar

+ To view sparks front end go to http://localhost:4040/ for just on submit

## To build custom master with workers and java 20 and virtual threading
- in spark/conf put custom configuration files at [script](https://drive.google.com/file/d/1T50kw-sa8_icGvCC4OJ47ru6Fd5PvLXA/view?usp=sharing) 
- To start run: 
  + start-master.sh
  + start-worker.sh spark://localhost:7077
- to see master node front end go to [front end](http://localhost:8080/)
- Set up SDKMAN with Java 20 default jdk for ubuntu, then set up gradle 8.1.1 as default gradle version for Ubuntu
- Set Intellej run configurations to Java 20 Ubuntu version with command line parameters --enable-preview
- Set gradle wrapper in gradle-wrapper.properties to be 8.1.1 and set java source to be 20 in build.gradle
- Set up rest of files as in commit and set up project configuration for java 20, preview and gradle 8.1.1
- To submit job run: 
  - ./gradlew build
  - spark-submit --conf "spark.driver.extraJavaOptions=--enable-preview" --conf "spark.executor.extraJavaOptions=--enable-preview" --class Main
    build/libs/gradle-simple-2.0.jar build/libs/gradle-simple-2.0-sources.jar





