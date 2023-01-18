package AFactory;

public class LaptopFactory extends AbstractDeviceFactory {
    Device getGadget(DeviceType dtype){
        switch(dtype){
            case DELL: return new Dell("16", "AMD", "NVIDIA RTX 3070");
            case HP: return new HP("16", "INTEL", "NVIDIA RTX 3080");
        }
        return null;
    }
}
