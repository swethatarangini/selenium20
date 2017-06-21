package mainclasses;

import pom.DisneyWorld;
import pom.Open_Disney;

public class DisneyCall {
	public static void main (String args[]) throws InterruptedException{
		Open_Disney open_Disney= new Open_Disney();
		open_Disney.Website();
		DisneyWorld  disney_Xpath =new DisneyWorld();
		disney_Xpath.xpath(); 
	}
		

}