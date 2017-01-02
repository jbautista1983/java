package prueba_mongo_db;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class prueba {
	


	   public static void main( String  args[] ) {
		
	      try{
			
	         // To connect to mongodb server
	         MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
				
	         // Now connect to your databases
	         DB db = mongoClient.getDB( "test" );
	         System.out.println("Connect to database successfully");
	         String myUserName = "usuario";
	         String myPassword = "contraseņa";
//         boolean auth = db.authenticate(myUserName, myPassword);
       		boolean auth = db.authenticate("username", "password".toCharArray());
	         System.out.println("Authentication: "+auth);
				
	      }catch(Exception e){
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      }
 	   }
	}

	
}
