package ru.andraft.myproject.client;

import java.net.UnknownHostException;
import java.util.Date;

import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

 
/**
 * Java + MongoDB Hello world Example
 * 
 */
public class HelloWorld {
	private static DB db = null;
	private static DBCollection collection;
	private static DBCollection admins;
	private static BasicDBObject document;
	
	public static DB getDB() throws UnknownHostException{
		if(db==null){
			MongoClient mongo = new MongoClient("dharma.mongohq.com" , 10037 );
			db = mongo.getDB("andraft");}
		return db;};
		
	public static void main(String[] args) throws UnknownHostException  {
			boolean auth = getDB().authenticate("crazyjkee", "rfltn81".toCharArray());
			if (db.collectionExists("mycollection")&&db.collectionExists("admins")) {
			  collection = db.getCollection("mycollection");
			  admins = db.getCollection("admins");
			  printAllDocuments(admins);
			  System.out.println("OK");     
			    } else {
			       insertDocuments(admins);
			    }

}
	public static void insertDocuments(DBCollection collection){
			        System.out.println("Добавь Документ");
	}
	public static void upgradeAdmins(String name,String key,String value){
		BasicDBObject updateQuery = new BasicDBObject();
			  updateQuery.append("$set", 
			  new BasicDBObject().append(key, value));
			  BasicDBObject searchQuery = new BasicDBObject();
			  searchQuery.append("name", name);
			  admins.updateMulti(searchQuery, updateQuery);
	}
	public static boolean adminki(String adm){
		boolean admin = false;
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("name", adm);
		DBCursor cursor = admins.find(searchQuery);
		while (cursor.hasNext()) {
			System.out.println(cursor.next());
			admin = true;
		}
		return admin;		
	}
	public static void printAllDocuments(DBCollection collection) {
		DBCursor cursor = collection.find();
		while (cursor.hasNext()) 
			System.out.println(cursor.next());
		
	}
 
	public static void removeAllDocuments(DBCollection collection) {
		collection.remove(new BasicDBObject());
	}
 
	
}