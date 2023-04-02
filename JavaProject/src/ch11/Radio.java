package ch11;

public class Radio implements Sound {
    private int soundlevel;
    @Override
    public void soundDown() {
        while(soundlevel != 0) {
            soundlevel--;
        }
        return;
    }

    @Override
    public void soundUp() {
        soundlevel++;
        soundlevel++;
    }
}
