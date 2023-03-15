package Adapter;

public interface AdapterDemo {
    public static void main(String args[]){
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp4", "Intentions");
        audioPlayer.play("mp3", "Perfect");
        audioPlayer.play("vlc", "Sugar");
        audioPlayer.play("avi", "Flex");
    }
}
