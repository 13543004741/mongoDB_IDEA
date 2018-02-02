public class MongoDBUtil {

    public static void main(String[] args) {
        //插入数据
       /* try{
            MongoClient mongoClient = new MongoClient("localhost");
            MongoDatabase database = mongoClient.getDatabase("wz");
            MongoCollection<Document> collections = database.getCollection("test");
            Document document = new Document();
            document.append("name","langYe").append("six","man").append("age",22).append("school","nf");
            //插入一条数据
            collections.insertOne(document);
            //批量插入数据
            //collections.insertMany(new ArrayList<Document>());
            System.out.println("成功插入一个文档！");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("插入文档异常！");
        }*/



        //删除数据
       /* try{
            MongoClient mongoClient = new MongoClient("localhost");
            MongoDatabase database = mongoClient.getDatabase("wz");
            MongoCollection<Document> collections = database.getCollection("test");
            //删除一个符合条件的文档
            collections.deleteOne(Filters.eq("name","langYe"));
            //删除所有符合条件的文档
            //collections.deleteMany(Filters.eq("name","langYe"));
            System.out.println("成功删除一个文档！");
            //检索查看结果
            FindIterable<Document> findIterable = collections.find();
            MongoCursor<Document> mongoCursor = findIterable.iterator();
            while (mongoCursor.hasNext()){
                System.out.println(mongoCursor.next());
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("删除文档异常！");
        }*/


       //查询数据
        /*try{
            MongoClient mongoClient = new MongoClient("localhost");
            MongoDatabase database = mongoClient.getDatabase("wz");
            MongoCollection<Document> collections = database.getCollection("test");
            //检索所有文档
            *//**
             * 1. 获取迭代器FindIterable<Document>
             * 2. 获取游标MongoCursor<Document>
             * 3. 通过游标遍历检索出的文档集合
             * *//*
            MongoIterable<Document> mongoIterable = collections.find();
            MongoCursor<Document> mongoCursor = mongoIterable.iterator();
            while (mongoCursor.hasNext()){
                System.out.println(mongoCursor.next());
            }
            System.out.println("查询文档成功！");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("查询文档失败！");
        }*/


        //更新数据
        /*try{
            MongoClient mongoClient = new MongoClient("localhost");
            MongoDatabase database = mongoClient.getDatabase("wz");
            MongoCollection<Document> collections = database.getCollection("test");
            //更新多个字段使用map集合
            Map<String,Object> map = new HashMap<>();
            map.put("sex","man");
            map.put("age","20");
            map.put("name","wangZai");
            Document document = new Document("$set",map);
            collections.updateMany(Filters.eq("name","langYe"),document);
            //更新某个字段使用new Document()
            //collections.updateMany(Filters.eq("name","langYe"),new Document("$set",new Document("name","wangZai")));
            MongoIterable<Document> mongoIterable = collections.find();
            MongoCursor<Document> mongoCursor = mongoIterable.iterator();
            while (mongoCursor.hasNext()){
                System.out.println(mongoCursor.next());
            }
            System.out.println("成功更新一个文档！");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("更新文档异常！");
        }*/
    }
}
