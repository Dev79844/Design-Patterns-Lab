package AFactory;

public abstract class FactoryGenerator {
    public static AbstractDeviceFactory getFactory(FactoryType ftype){
        switch(ftype){
            case MOBILEFACTORY: return new MobileFactory();
            case LAPTOPFACTORY: return new LaptopFactory();
        }
        return null;
    }
}
