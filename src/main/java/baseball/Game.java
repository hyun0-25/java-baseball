package baseball;

import View.GameHost;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private int ballCount;
    private int strikeCount;
    private static List<Integer> answer;

    public void initialize(){
        GameHost gamehost = new GameHost();
        gamehost.startMessage();
        answer = make_random_nums();
    }

    public void start(){
        initialize();
        GamePlayer player = new GamePlayer();
        GameHost host = new GameHost();
        player.userInput();
        if(ballCount==0 && strikeCount==0) host.nothingMessage();
        else {
            host.ballMessage(ballCount);
            host.strikeMessage(strikeCount);
        }

    }


    public List<Integer> make_random_nums(){
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }

    public void baseballCount(List<Integer> user){
        ballCount=0;
        strikeCount=0;
        for (int i=0; i<3; i++){
            if(user.get(i)==answer.get(i)) strikeCount++;
            else if(answer.contains(user.get(i))){
                ballCount++;
            }
        }
    }
}
