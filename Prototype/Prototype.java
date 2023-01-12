import java.util.Map;
import java.util.HashMap;

abstract class Color implements Cloneable{
    protected String colorName;

    abstract void addColour();

    public Object clone() throws CloneNotSupportedException{
        Object obj = null;
        try{
            obj = super.clone();
        }catch(Exception e){
            e.printStackTrace();
        }
        return obj;
    }
}

class blueColor extends Color{
    public blueColor(){
        this.colorName = "blue";
    }

    @Override
    public void addColour(){
        System.out.println("Blue colour added");
    }
}

class blackColor extends Color{
    public blackColor(){
        this.colorName = "black";
    }

    @Override
    public void addColour(){
        System.out.println("Black colour added");
    }
}

class ColorStore{
    private static Map<String, Color> colorMap = new HashMap<String, Color>();

    static{
        colorMap.put("blue", new blueColor());
        colorMap.put("black", new blackColor());
    }
    public static Color getColor(String colorname){
        return (Color) colorMap.get(colorname).clone();
    }
}

class Prototype{
    public static void main(String args[])throws CloneNotSupportedException{
        ColorStore.getColor("blue").addColour();
        ColorStore.getColor("black").addColour();
    }
}