package Adapter1;

public class MySQL implements SQL {
    @Override
    public void execute(String queryType, String tableName){
        System.out.println("Execute SQL query in table:" + tableName);
    }
}
