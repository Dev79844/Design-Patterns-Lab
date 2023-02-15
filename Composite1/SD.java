package Composite1;

import java.util.ArrayList;
import java.util.List;

interface SystemDesign{
    void getName();
}

class Leaf implements SystemDesign{
    String name;

    public Leaf(String name){
        this.name = name;
    }

    @Override
    public void getName(){
        System.out.println(name);
    }
}

class Composite implements SystemDesign{
    String name;
    List<SystemDesign> components = new ArrayList<>();

    public Composite(String name){
        this.name = name;
    }

    public void addComponent(SystemDesign com){
        components.add(com);
    }

    @Override
    public void getName(){
        System.out.println("-----Components------");
        for(SystemDesign sd: components){
            sd.getName();
        }
    }
}

public class SD{

}
