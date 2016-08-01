package main.factory;

public class MainClass {

	public static void main(String[] args) {
		Resorts resort1=ResortsFactory.getResort("DisneyLandResort") ;
		resort1.checkIn();
		Resorts resort2=ResortsFactory.getResort("ModerateDisneyResort") ;
		resort2.checkIn();
		Resorts resort3=ResortsFactory.getResort("ValueDisneyResort") ;
		resort3.checkIn();
	}

}
