import java.util.ArrayList;
import java.util.List;

interface Component 
{
    void showPrice();
}

class Leaf implements Component {
    int Price;
    String Name;
    public Leaf(int Price, String Name) {
        this.Price = Price;
        this.Name = Name;
    }

    @Override
    public void showPrice() {
        System.out.println(Name + " : " + Price);
    }
}

class Composite implements Component {
    String Name;
    List<Component> components = new ArrayList<>();

    public Composite(String Name) {
        this.Name = Name;
    }


    public void addComponent(Component com) {
        components.add(com);
    }

    @Override
    public void showPrice() {
        System.out.println("---------------" + Name + "---------------");
        for (Component c : components) {
            c.showPrice();
        }
    }
}

public class ComputerPart {
}
