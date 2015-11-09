package mx.iteso.adapter.audioplayer;

abstract public class Demo {
    public static void main() {
        AudioPlayer audioPlayer = new AudioPlayer() {
        };
        audioPlayer.play("mp4", "my kind of woman - mac demarco.mp4");
        audioPlayer.play("vlc", "magic spells - crystal castles.vlc");
        audioPlayer.play("mp3", "far far away.mp3");
        audioPlayer.play("mp5", "mind me.avi");
    }
}
