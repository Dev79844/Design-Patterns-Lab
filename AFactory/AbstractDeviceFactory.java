package AFactory;

public abstract class AbstractDeviceFactory{
    abstract Device getGadget(DeviceType deviceType);
}