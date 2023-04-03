package ch16.DotCom;

import java.util.ArrayList;

public class Dotcom {
    private String name;
    private ArrayList<String> location;

    public Dotcom(String name) {
        this.name = name;
    }
    public void setLocation(ArrayList<String> location) {
        this.location = location;
    }

    public String checkYourself(String userInput) {
        String status = "miss";

        int index = location.indexOf(userInput);
        if (index >= 0) {
            location.remove(index);
            if (location.isEmpty()) {
                status = "kill";
            }
            else {
                status = "hit";
            }
        }
        return status;
    }
}
