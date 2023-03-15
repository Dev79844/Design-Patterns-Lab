package Adapter1;

public class MongoDB implements NoSQL {
    @Override
    public void execute(String queryType, String collectionName){
        System.out.println("Execute NoSQL query in "+collectionName);
    }
}
