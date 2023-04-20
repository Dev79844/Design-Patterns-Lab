package obs;

public class youtube
{
    public static void main(String[] args) {
        Channel channel= new Channel();
        subscriber s1 = new subscriber("JOHN");
        subscriber s2 = new subscriber("DAN");
        subscriber s3 = new subscriber("DEV");
        subscriber s4 = new subscriber("HAZEL");
        subscriber s5 = new subscriber("JOHN WICK");
    
        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);
        channel.subscribe(s4);
        channel.subscribe(s5);
    
        s1.subscribeChannel(channel);
        s2.subscribeChannel(channel);
        s3.subscribeChannel(channel);
        s4.subscribeChannel(channel);
        s5.subscribeChannel(channel);
    
        channel.upload("Complete Web Dev. Course");
        
        channel.unsubscribe(s3);
        System.out.println("\n");
        channel.upload("Machine Learning Bootcamp");
    }
}