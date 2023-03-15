package Adapter;

public class Mp4Player implements AdvancedAudioPlayer {
    @Override
    public void playMp4(String fileName){
        System.out.println("Playing "+fileName+".mp4");
    }

    @Override
    public void playVlc(String fileName){
        
    }
}
