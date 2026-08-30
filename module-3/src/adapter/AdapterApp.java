package adapter;

public class AdapterApp {
    public static void main() {
        MediaPlayer player = new Mp3Adapter();
        player.play("song.mp3");
    }
}
