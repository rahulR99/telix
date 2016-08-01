package main.singleton;

public class SingleTon {
	private SingleTon(){
		
	}
	private static SingleTon INSTANCE=null;
	
	public static SingleTon getInstance(){
		if(INSTANCE == null){
			INSTANCE=new SingleTon();
		}
		return INSTANCE;
	}
}
