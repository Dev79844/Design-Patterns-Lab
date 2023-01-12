package AbstractFactoryDP;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("Rectangle")){
            return new RoundedRectangle();
        }else{
            return new RoundedSquare();
        }
    }
}
