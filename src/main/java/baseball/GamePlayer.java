package baseball;

import View.GameHost;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class GamePlayer {
    private String userinput;

    public List<Integer> userInput(GameHost gamehost) {
        userinput = Console.readLine();
        return input_to_List(userinput, gamehost);
    }

    public List<Integer> input_to_List(String string, GameHost gh) {
        if (string.length()>3) gh.exceedLengthError();
        List<Integer> inputnumber = new ArrayList<>();

        for (int i = 0; i < 3; i++){
            Character charnumber = string.charAt(i);
            if(!Character.isDigit(charnumber)) gh.notnumberError();

            int intnumber = Integer.parseInt(charnumber.toString());
            if(intnumber==0) gh.zeronumberError();
            if(inputnumber.contains(intnumber)) gh.duplicationError();
            inputnumber.add(intnumber);
        }
        return inputnumber;
    }

    public int restart(){
        userinput = Console.readLine();
        return Integer.parseInt(userinput);
    }
}
