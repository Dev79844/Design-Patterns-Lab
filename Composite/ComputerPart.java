import java.util.ArrayList;
import java.util.List;

interface Component // For Both Of Leaf And Composite Element
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

    // Constructor
    public Composite(String Name) {
        // super(); // Why????
        this.Name = Name;
    }


    public void addComponent(Component com) {
        components.add(com);
    }

    @Override
    public void showPrice() {
        System.out.println("---------------" + Name + "---------------");
        for (Component c : components) {
            c.showPrice(); // Will Print The Price Of Each Object
                           // If It Is Leaf Object Directly The Price Will Be Printed
                           // If It Is A Composite Object The It Will Further Traverse Into It
        }
    }
}

public class ComputerPart {
}
