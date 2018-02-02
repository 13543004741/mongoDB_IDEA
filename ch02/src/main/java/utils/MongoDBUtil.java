package utils;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoDBUtil {

    public static void main(String[] args) {
        //创建集合
       /* try {
            MongoClient mongoClient = new MongoClient("localhost",27017);
            MongoDatabase mongoDatabase = mongoClient.getDatabase("wz");
            mongoDatabase.createCollection("test");
            System.out.println("成功创建集合");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getClass().getName()+":"+e.getMessage());
        }*/

       //获取集合
        try{
            MongoClient mongoClient = new MongoClient("localhost",27017);
            MongoDatabase mongoDatabase = mongoClient.getDatabase("wz");
            mongoDatabase.getCollection("test");
            System.out.println("集合获取成功");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("集合获取异常");
        }
    }
}
