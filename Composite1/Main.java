package Composite1;

public class Main {
    public static void main(String args[]){
        Composite HLD = new Composite("HLD");
        Composite LLD = new Composite("LLD");
        Composite DB = new Composite("DB");
        Composite SD = new Composite("System Design");

        SystemDesign API = new Leaf("APIs");
        SystemDesign DP = new Leaf("DP");
        SystemDesign UML = new Leaf("UML");
        SystemDesign SQL = new Leaf("SQL");
        SystemDesign NoSQL = new Leaf("NoSQL");

        DB.addComponent(NoSQL);
        DB.addComponent(SQL);

        LLD.addComponent(DP);
        LLD.addComponent(UML);

        HLD.addComponent(API);
        HLD.addComponent(DB);

        SD.addComponent(HLD);
        SD.addComponent(LLD);
        SD.getName();
    }
}
