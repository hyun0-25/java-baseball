package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class GamePlayer {
    private String userinput;

    public List<Integer> userInput() {
        userinput = Console.readLine();
        int input = Integer.parseInt(userinput);
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

    public int restart(){
        userinput = Console.readLine();
        return Integer.parseInt(userinput);
    }
}
