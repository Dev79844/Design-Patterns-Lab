package obs;

public interface subject {
    void subscribe(subscriber sub);
    void unsubscribe(observer ob);
    void notifySubscriber();
    void upload(String title);
}
