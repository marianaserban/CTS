package ro.ase.csie.cts.singleton;

public class Elvis {
    public final static Elvis theTrueElvis = new Elvis();
    private Elvis(){

    }
    public void sing(){
        System.out.println("Elvis is singing");
    }
}