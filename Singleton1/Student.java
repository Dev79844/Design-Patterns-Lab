package Singleton1;

public class Student {
    private static Student stu = new Student();
    public int roll;

    private Student(){
        System.out.println("Student added");
    }

    public static Student getInstance(){
        return stu;
    }

    public int getRollno(){
        return roll;
    }

    public void setRollno(int roll){
        this.roll = roll;
    }

    public static void setSoleInstance(Student stu){
        Student.stu = stu;
    } 
}
