package obdp;

public class personalDevice {
    public static void main(String[] args) {
        onlineDownloader d1 = new onlineDownloader();
        String file1 = "minecraft";
        String file2 = "Whatsapp";
        String file3 = "Telegram";
        String file4 = "Dream11";

        d1.download(file1);
        d1.download(file2);
        d1.download(file3);
        d1.download(file4);

        d1.deleteFromDownloads(file4);
    }
}
