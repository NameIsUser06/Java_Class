package ch16.DotCom;

import java.util.ArrayList;

public class DotComBust {
    private int numOfGuess;
    private ArrayList<Dotcom> dotComs = new ArrayList<Dotcom>();
    private GameHelper gameHelper = new GameHelper();
    private void setUpGame() {
        dotComs.add(new Dotcom("google.com"));
        dotComs.add(new Dotcom("naver.com"));
        dotComs.add(new Dotcom("kakao.com"));

        for (Dotcom dotCom : dotComs) {
            ArrayList<String> newLocation = gameHelper.placeDotCom();
            dotCom.setLocation(newLocation);
        }
    }

    private void startPlaying() {
        while(!dotComs.isEmpty()) {
            String userguess = gameHelper.getUserInput("enter a guess");
            checkUserGuess(userguess);
        }
        finishGame();
    }

    private void finishGame() {
        System.out.println("you have " + numOfGuess);
        if (numOfGuess < 18) {
            System.out.println("good job");
        }
        else {
            System.out.println("^^;");
        }
    }

    private void checkUserGuess(String userGuess) {
        numOfGuess++;
        String result = "miss";
        for (Dotcom dotCom : dotComs) {
            result = dotCom.checkYourself(userGuess);
            if (result.equals("hit")) {
                System.out.println(result);
                break;
            }
            if (result.equals("kill")) {
                System.out.println(result);
                dotComs.remove(dotCom);
                break;
            }
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

}
