package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class GamePlayer {

    public List<Integer> userInput() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input_to_List(input);
    }

    public List<Integer> input_to_List(int input) {
        List<Integer> inputlist = new ArrayList<>();
        inputlist.add(input/100);
        input %= 100;
        inputlist.add(input/10);
        input %= 10;
        inputlist.add(input);
        return inputlist;
    }
}
