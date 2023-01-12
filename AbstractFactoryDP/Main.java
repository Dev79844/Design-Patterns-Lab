package AbstractFactoryDP;

public class Main {
    public static void main(String args[]){
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(false);

        Shape shape1 = shapeFactory1.getShape("rectangle");
        shape1.draw();

        Shape shape2 = shapeFactory1.getShape("square");
        shape2.draw();

        AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);

        Shape shape3 = shapeFactory2.getShape("rectangle");
        shape3.draw();

        Shape shape4 = shapeFactory2.getShape("square");
        shape4.draw();
    }
}
