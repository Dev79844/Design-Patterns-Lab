package AbstractFactoryDP;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }else{
            return new Square();
        }
    }
}
