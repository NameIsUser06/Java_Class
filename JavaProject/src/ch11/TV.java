package ch11;

public class TV implements Sound{

    private int soundlevel;

    @Override
    public void soundUp() {
        soundlevel++;
    }

    @Override
    public void soundDown() {
       if (soundlevel == 0) {
           return;
       }
       soundlevel--;
    }

    public void showInfo() {
        System.out.println(soundlevel);
    }

}
