public class Factory {
    public static void main(String args[]){
        OSFactory os = new OSFactory();

        OS android = os.getOs("android");
        android.system();

        OS ios = os.getOs("ios");
        ios.system();

        OS windows = os.getOs("windows");
        windows.system();
    }
}
