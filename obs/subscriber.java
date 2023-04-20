package obs;
public class subscriber implements observer{

    private String name;
    private Channel channel = new Channel();

    public subscriber(String name){
        this.name = name;
    }
    @Override
    public void subscribeChannel(Channel ch) {
        channel = ch;
    }

    @Override
    public void update() {
        System.out.println("Hey "+name+" Video uploaded on: "+channel.title);
    }
    
}
