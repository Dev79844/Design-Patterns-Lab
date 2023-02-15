class CompositeTest
{
    public static void main(String[] args) 
    {
        Component HD = new Leaf(5000,"HDD");
        Component SD = new Leaf(15000,"SSD");
        Component KeyBoard = new Leaf(1500,"Logitech");
        Component Mouse = new Leaf(500,"Corsair");
        Component Monitor = new Leaf(5000,"LG");
        Component CPU = new Leaf(50000,"i9-11th Gen");
        Component RAM = new Leaf(5000,"8GB - RGB - Auros");

        Composite PH = new Composite("Peripheral");
        Composite Cabinet = new Composite("Cabinet");
        Composite MB = new Composite("MotherBoard");
        Composite Computer = new Composite("Computer");

        PH.addComponent(Mouse);
        PH.addComponent(KeyBoard);
        PH.addComponent(Monitor);

        Cabinet.addComponent(HD);
        Cabinet.addComponent(SD);
        Cabinet.addComponent(MB);

        MB.addComponent(CPU);
        MB.addComponent(RAM);

        Computer.addComponent(Cabinet);
        Computer.addComponent(PH);

        Computer.showPrice();
    }
}