public class Phone{

    private String os;
    private String processor;
    private int ram;
    private double screensize;
    private int battery;

    public Phone(String os, String processor, int ram, int battery, double screensize){
        this.os = os;
        this.processor = processor;
        this.ram = ram;
        this.battery = battery;
        this.screensize = screensize;
    }

    public String toString(){
        return "Phone[os: "+os+" ,processor: "+processor+" ,ram: "+ram+" ,screensize: "+screensize+" ,battery: "+battery+"]";
    }
}