package Singleton;

public class Singleton {
    private static Singleton soleInstance = new Singleton();
    public int i;

    private Singleton(){
        System.out.println("Created");
    }

    public static Singleton getInstance(){
        return soleInstance;
    }

    public int getI(){
        return i;
    }

    public void setI(int i){
        this.i = i;
    }

    public static void setSoleInstance(Singleton soleInstance){
        Singleton.soleInstance = soleInstance;
    } 
}
