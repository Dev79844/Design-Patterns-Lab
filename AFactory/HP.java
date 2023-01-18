package AFactory;

public class HP extends Device {
    private String ram;
    private String processor;
    private String gpu;

    public HP(String ramsize, String processorType, String gpuType){
        this.ram = ramsize;
        this.processor = processorType;
        this.gpu = gpuType;
    }

    public String getDetails(){
        return "Samsung:\nramsize:"+this.ram+"\nprocessor:"+this.processor+"\nGPU:"+this.gpu;
    }

    public String toString(){
        return "Samsung(ram:"+ram+", Processor:"+processor+", GPU:"+gpu+")";
    }
}
