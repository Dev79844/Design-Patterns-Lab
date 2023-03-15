package Adapter1;

public class DB {
    public static void main(String args[]){
        MongoDB mongo = new MongoDB();

        mongo.execute("sql", "student");
        mongo.execute("nosql", "student");
    }
}
