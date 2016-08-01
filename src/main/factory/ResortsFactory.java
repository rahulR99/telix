package main.factory;

public class ResortsFactory {
	//use getResort method to get object of type Resort 
	   public static Resorts getResort(String ResortType){
	      if(ResortType == null){
	         return null;
	      }		
	      if(ResortType.equalsIgnoreCase("DisneyLandResort")){
	         return new DisneyLandResort();
	         
	      } else if(ResortType.equalsIgnoreCase("ModerateDisneyResort")){
	         return new ModerateDisneyResort();
	         
	      } else if(ResortType.equalsIgnoreCase("ValueDisneyResort")){
	         return new ValueDisneyResort();
	      }
	      
	      return null;
	   }
}
