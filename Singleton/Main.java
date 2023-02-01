package Singleton;

public class Main {
    public static void main(String args[]){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.setI(2);
        s2.setI(3);

        System.out.println(s1.getI());
        System.out.println(s2.getI());

        print("s1", s1);
        print("s2", s2);

    }

    static void print(String s, Singleton obj){
        System.out.println(String.format("Object: %s, Hashcode:%d",s,obj));
    }
}
