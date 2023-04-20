package obdp;
import java.util.ArrayList;
public class onlineDownloader implements downloads{

    private ArrayList<String> myFiles = new ArrayList<>();
    public int flag;
    @Override
    public void deleteFromDownloads(String fileName) {
        myFiles.remove(fileName);
        flag = 0;
        notifyUser(fileName);
    }

    @Override
    public void download(String fileName) {
        myFiles.add(fileName);
        flag = 1;
        notifyUser(fileName);
        
    }

    @Override
    public void notifyUser(String s) {
        if (flag == 0){
            System.out.println("Removed File: "+s);
            
        }else if (flag == 1){

                System.out.println("Downloaded File: "+s);
            
        }
    }
}
