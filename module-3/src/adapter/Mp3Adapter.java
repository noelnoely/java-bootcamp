package adapter;

public class Mp3Adapter implements MediaPlayer {
    private final Mp3Player player = new Mp3Player();

    @Override
    public void play(String fileName) {
        player.playMp3(fileName);
    }
}