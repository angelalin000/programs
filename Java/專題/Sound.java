import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import java.net.URL;

public class Sound {
    Clip clip;
    URL soundURL[] = new URL[4];

    public Sound() {
        soundURL[0] = getClass().getResource("/music/bg.wav");
        soundURL[1] = getClass().getResource("/music/cd.wav");
        soundURL[2] = getClass().getResource("/music/bird.wav");
        soundURL[3] = getClass().getResource("/music/false.wav");
    }

    public void setFile(int i) {
        try {
            AudioInputStream bgm = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(bgm);
        } catch (Exception e) {

        }
    }

    public void play() {
        clip.start();
    }

    public void loop() {
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop() {
        clip.stop();
    }

}
