package obs;

import java.util.ArrayList;


public class Channel implements subject{

    private ArrayList<subscriber> subs = new ArrayList<subscriber>();
    public String title;

    @Override
    public void subscribe(subscriber sub) {
        subs.add(sub);
    }

    @Override
    public void unsubscribe(observer ob) {
        subs.remove(ob);
    }

    @Override
    public void notifySubscriber() {
        for (observer obs:subs){
            obs.update();
        }
    }

    @Override
    public void upload(String title) {
        this.title = title;
        notifySubscriber();
    }
    
}
