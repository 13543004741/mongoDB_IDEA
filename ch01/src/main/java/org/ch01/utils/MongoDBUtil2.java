package org.ch01.utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;

import java.util.ArrayList;
import java.util.List;

public class MongoDBUtil2 {

    public static void main(String[] args) {
        try {
            //连接到mongodb服务，如果是远程连接可以替换“localhost”为服务器所在的地址
            //serverAddress()两个参数分别为服务器地址和端口
            ServerAddress serverAddress = new ServerAddress("localhost",27017);
            List<ServerAddress> addrs = new ArrayList<>();
            addrs.add(serverAddress);

            //创建mongodb证书（credentials） 三个参数分别为用户名、数据库名称、密码
            MongoCredential mongoCredential = MongoCredential.createMongoCRCredential("admin","wz","123".toCharArray());
            List<MongoCredential> credentials = new ArrayList<>();
            credentials.add(mongoCredential);

            //通过连接认证获取mongodb连接
            MongoClient mongoClient = new MongoClient(addrs,credentials);

            //连接到数据库
            MongoDatabase mongoDatabase = mongoClient.getDatabase("wz");
            System.out.println("数据库名称："+mongoDatabase.getName());
            System.out.println("connect to database successfully");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getClass().getName()+":"+e.getMessage());
        }

    }

}
