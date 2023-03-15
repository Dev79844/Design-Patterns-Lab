package Adapter;

public class MediaAdapter implements MediaPlayer {
    AdvancedAudioPlayer advancedAudioPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("mp4")){
            advancedAudioPlayer = new Mp4Player();
        }
        else if(audioType.equalsIgnoreCase("vlc")){
            advancedAudioPlayer = new VlcPlayer();
        }
    }

    public void play(String audioType, String fileName){
        if(audioType.equalsIgnoreCase("mp4")){
            advancedAudioPlayer.playMp4(fileName);
        }

        else if(audioType.equalsIgnoreCase("vlc")){
            advancedAudioPlayer.playVlc(fileName);
        }
    }

}
