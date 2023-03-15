package Adapter1;

public class QueryAdapter implements NoSQL {
    MySQL mysql;
    MongoDB mongo;
    public QueryAdapter(String queryType){
        if(queryType.equalsIgnoreCase("sql")){
            mysql = new MySQL();
        }
        else if(queryType.equalsIgnoreCase("nosql")){
            mongo = new MongoDB();
        }
    }

    @Override
    public void execute(String queryType, String collectionName){
        if(queryType.equalsIgnoreCase("sql")){
            mysql.execute(queryType, collectionName);
        }
        else if(queryType.equalsIgnoreCase("nosql")){
            mongo.execute(queryType, collectionName);
        }
    }
}
