package ch16.DotCom;

import java.io.*;
import java.util.ArrayList;

public class GameHelper {
    private static final char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
    private final int[][] grid = new int[7][7];
    private int comCount;

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

    public ArrayList<String> placeDotCom() {
        ArrayList<String> alphaCells = new ArrayList<>();
        int randRow, randCol;
        if (comCount == 0) {
            comCount++;
            while (true) {
                randRow = (int) (Math.random() * 1000) % 7;
                randCol = (int) (Math.random() * 1000) % 5;
                if (grid[randRow][randCol] == 0 && (grid[randRow][randCol + 1] == 0) && (grid[randRow][randCol + 2] == 0)){
                    grid[randRow][randCol] = 1;
                    grid[randRow][randCol + 1] = 1;
                    grid[randRow][randCol + 2] = 1;
                    break;
                }
            }
            alphaCells.add(String.format(alphabet[randRow] + "%d", randCol));
            alphaCells.add(String.format(alphabet[randRow] + "%d", randCol + 1));
            alphaCells.add(String.format(alphabet[randRow] + "%d", randCol + 2));
        }
        else if (comCount == 1) {
            comCount--;
            randRow = (int)(Math.random() * 1000) % 5;
            randCol = (int)(Math.random() * 1000) % 7;
            while (true) {
                randRow = (int) (Math.random() * 1000) % 5;
                randCol = (int) (Math.random() * 1000) % 7;
                if (grid[randRow][randCol] == 0 && (grid[randRow + 1][randCol] == 0) && (grid[randRow + 2][randCol] == 0)){
                    grid[randRow][randCol] = 1;
                    grid[randRow + 1][randCol] = 1;
                    grid[randRow + 2][randCol] = 1;
                    break;
                }
            }
            alphaCells.add(String.format(alphabet[randRow] + "%d", randCol));
            alphaCells.add(String.format(alphabet[randRow + 1] + "%d", randCol));
            alphaCells.add(String.format(alphabet[randRow + 2] + "%d", randCol));
        }
        System.out.println(alphaCells);
        return alphaCells;
    }

    public void printAll() {
        for (int[] ints : grid) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}