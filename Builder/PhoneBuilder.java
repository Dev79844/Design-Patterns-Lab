public class PhoneBuilder {
    

    private String os;
    private String processor;
    private int ram;
    private double screensize;
    private int battery;

    public PhoneBuilder setOs(String os1){
        this.os = os1;
        return this;
    }
    public PhoneBuilder setProcessor(String processor1){
        this.processor = processor1;
        return this;
    }
    public PhoneBuilder setRam(int ram1){
        this.ram = ram1;
        return this;
    }
    public PhoneBuilder setScreensize(double screensize1){
        this.screensize = screensize1;
        return this;
    }
    public PhoneBuilder setBattery(int battery1){
        this.battery = battery1;
        return this;
    }

    public Phone getPhone(){
        return new Phone(this.os, this.processor, this.ram, this.battery, this.screensize);
    }
}
