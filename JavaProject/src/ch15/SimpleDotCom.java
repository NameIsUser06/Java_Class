package ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SimpleDotCom {

    ArrayList<Integer> location;
    int numOfHits;

//    public String checkYourself(String guessStr) {
//        int guess = Integer.parseInt(guessStr);
//        String result = "miss";
//        for (int i : location) {
//            if (guess == i) {
//                result = "hit";
//                numOfHits++;
//                break;
//            }
//        }
//
//        if (numOfHits == location.length) {
//            result = "kill";
//        }
//
//        return result;
//    }
    public String checkYourself(String guessStr) {
        int guess = Integer.parseInt(guessStr);
        String result = "miss";
        int index = location.indexOf(guess);
        if (index >= 0) {
            location.remove(index);
            if (location.isEmpty()) {
                result = "kill";
                return result;
            }
            else result = "hit";
        }
        return result;
    }
    public String getUserInput(String prompt) {
        String inputLine;
        System.out.print(prompt + " ");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            inputLine = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return inputLine;
    }

//    public void setLocationCells(int[] location) {
//        this.location = location;
//    }

    public void setLocation(ArrayList<Integer> location) {
        this.location = location;
    }
}
