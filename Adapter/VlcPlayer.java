package Adapter;

public class VlcPlayer implements AdvancedAudioPlayer {
    @Override
    public void playVlc(String fileName){
        System.out.println("Playing "+fileName+".vlc");
    }

    @Override
    public void playMp4(String fileName){
        
    }
}
