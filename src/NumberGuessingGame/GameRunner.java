package NumberGuessingGame;

public class GameRunner {
    public static void main(String[] args) {
        NumberGuessingGame run = new GameImplementor();
        run.getTheBoundValue();
        run.generateTheRandomNumber();
        run.guessTheRandomNumber();
        run.generateTheGameReportFilePath();
        run.generateTheGameReport();
    }
}
