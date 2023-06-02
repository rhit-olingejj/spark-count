import org.apache.spark.api.java.function.FilterFunction;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.SparkSession;
//DataSets from https://github.com/vkmouse/Spark_clustering/blob/master/dataset/
public class Main {
  
  public static void main(String []args) {
    pso p = new pso();
    try {
      p.run();
      Thread.sleep(30000);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }  
}

