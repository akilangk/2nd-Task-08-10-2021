package NumberGuessingGame;

import java.util.Scanner;

interface NumberGuessingGame {
    void getTheBoundValue();
    void generateTheRandomNumber();
    void guessTheRandomNumber();
    void generateTheGameReportFilePath();
    void generateTheGameReport();
}
