package AFactory;

public class MobileFactory extends AbstractDeviceFactory {
    Device getGadget(DeviceType dtype){
        switch(dtype){
            case SAMSUNG: return new Samsung("8", "Snapdragon");
            case APPLE: return new Apple("8", "A11 Bionic Chip");
        }
        return null;
    }
}
