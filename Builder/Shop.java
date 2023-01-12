public class Shop {
    public static void main(String args[]){
        Phone p = new PhoneBuilder().setOs("Android").setProcessor("Qualcomm").setRam(8).setScreensize(5.5).setBattery(10000).getPhone();
        System.out.println(p);

    }
}
