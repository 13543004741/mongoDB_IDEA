package org.ch01.utils;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoDBUtil {

    public static void main(String[] args) {
        try {
            //连接到mongo服务
            MongoClient mongoClient = new MongoClient("localhost",27017);
            //连接到数据库
            MongoDatabase mongoDatabase = mongoClient.getDatabase("wz");
            System.out.println("数据库名称为："+mongoDatabase.getName());
            System.out.println("成功连接mongo数据库！");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("mongo数据库连接异常");
            System.out.println(e.getClass().getName()+":"+e.getMessage());
        }
    }
}
