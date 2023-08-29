package View;

public class GameHost {
    private static final String START_GAME_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String END_GAME_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private static final String INPUT_GAME_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String NOTHING_MESSAGE = "낫싱";
    private static final String BALL_NUMBER_MESSAGE = "%d볼 ";
    private static final String STRIKE_NUMBER_MESSAGE = "%d스트라이크 ";
    private static final String STRIKE_THREE_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    public void startMessage(){
        System.out.println(START_GAME_MESSAGE);
    }
    public void endMessage(){
        System.out.println(END_GAME_MESSAGE);
    }
    public void inputMessage(){
        System.out.println(INPUT_GAME_MESSAGE);
    }
    public void nothingMessage(){
        System.out.println(NOTHING_MESSAGE);
    }
    public void ballMessage(int n){
        if(n!=0) {
            System.out.printf(BALL_NUMBER_MESSAGE, n);
        }
    }
    public void strikeMessage(int n){
        System.out.printf(STRIKE_NUMBER_MESSAGE, n);
        if(n==3) {
            System.out.println(STRIKE_THREE_MESSAGE);
        }
    }
}
