import java.util.ArrayList; // import the ArrayList class
import io.javalin.Javalin;

import java.util.Collections; // import the Collections class
import java.util.HashMap; // import the HashMap class

public class Main
{
	public static void main(String[] args)
	{		
		ArrayList<String> animals = new ArrayList<String>(); // Create an ArrayList object
		Javalin app = Javalin.create().start(8080);
		
		//getting data from website
		app.post("/animals", ctx -> 
		{
			animals.add(ctx.formParam("aname"));
			
			String allAnimals="";
			for(int i=0; i<animals.size(); i++)
			{
				//System.out.println(animals.get(i));
				allAnimals=allAnimals+"<br>"+animals.get(i);
			}
			ctx.html(allAnimals);
		});
	}
}