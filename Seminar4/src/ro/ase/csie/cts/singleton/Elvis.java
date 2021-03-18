package ro.ase.csie.cts.singleton;

public class Elvis {
	
    //private final static Elvis theTrueElvis = new Elvis();
    private static Elvis theTrueElvis;

    private Elvis(){

    }
    
    public static Elvis getInstance() {
		//return theTrueElvis; //true
    	//return new Elvis();  //false
//    	synchronized (Elvis.class) {
//    		if(theTrueElvis==null) 
//        		theTrueElvis=new Elvis();
//		}
    	if(theTrueElvis==null) {
    		theTrueElvis=new Elvis();

    	}
    	return theTrueElvis;
	}
    
    public void sing(){
        System.out.println("Elvis is singing");
    }
}