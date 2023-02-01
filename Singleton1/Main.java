package Singleton1;

public class Main {
    public static void main(String args[]){
        Student s1 = Student.getInstance();
        Student s2 = Student.getInstance();

        s1.setRollno(2);
        s2.setRollno(3);

        System.out.println(s1.getRollno());
        System.out.println(s2.getRollno());

        print("s1", s1);
        print("s2", s2);

    }

    static void print(String s, Student obj){
        System.out.println(String.format("Object: %s, Hashcode:%d",s,obj));
    }
}
