package NumberGuessingGame;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

class GameImplementor extends DataProvider implements NumberGuessingGame {
    Scanner scannerObject = new Scanner(System.in);

    public void getTheBoundValue(){
        System.out.println("\nWelcome to the game of Number Guessing.");
        System.out.println("Enter the bound value within which the random number has to be generated: ");
        System.out.println("Disclaimer: Zero not allowed");
        int boundValue = scannerObject.nextInt();
        while (boundValue ==0){
            System.out.println("Disclaimer: Bound Value must not be Zero.");
            boundValue = scannerObject.nextInt();
        }
        setBoundValueOfRandomNumber(boundValue);
    }

    public void generateTheRandomNumber() {
        Random randomObject = new Random();
        int randomValue = randomObject.nextInt(getBoundValueOfRandomNumber());
        setRandomNumber(randomValue);
    }

    public void guessTheRandomNumber() {
        int guessValue;
        int guessCount=0;
        System.out.println("Let's start the guessing game..");
        do {
            guessCount++;
            System.out.println("Guess-"+guessCount+" --> Enter the number:");
            guessValue = scannerObject.nextInt();
            if(guessValue>getRandomNumber()){
                System.out.println("The given number is too high, Try Again.");
            }
            else if(guessValue<getRandomNumber()){
                System.out.println("The given number is too low, Try Again.");
            }
            else {
                System.out.println("Yeah, you guessed it right.");
                System.out.println("Generating the game report....");
            }
        }while(guessValue!=getRandomNumber());
        setGuessedNumber(guessValue);
    }

    public void generateTheGameReportFilePath() {
        String userWorkingDirectory = System.getProperty("user.dir");
        String pathSeparator = System.getProperty("file.separator");
        String formatFilePath = userWorkingDirectory + pathSeparator + "src" + pathSeparator + "NumberGuessingGame" + pathSeparator + "ReportFolder" + pathSeparator + "FormatOfGameReport.txt";
        String reportFilePath = userWorkingDirectory + pathSeparator + "src" + pathSeparator + "NumberGuessingGame" + pathSeparator + "ReportFolder" + pathSeparator + "GameReport.txt";
        setReportFormatFilePath(formatFilePath);
        setGameReportFilePath(reportFilePath);
    }

    public void generateTheGameReport() {
        String storeText;
        String guessedNumber = Integer.toString(getGuessedNumber());
        try {
            Reader readerPath = new FileReader(getReportFormatFilePath());
            BufferedReader readerObject = new BufferedReader(readerPath);
            Writer writerPath = new FileWriter(getGameReportFilePath());
            BufferedWriter writerObject = new BufferedWriter(writerPath);
            while((storeText = readerObject.readLine()) != null){
                writerObject.write(storeText);
                writerObject.newLine();
            }
            writerObject.write(guessedNumber);
            System.out.println("\nGame Report generated successfully.");
            writerObject.close();
            writerPath.close();
            readerObject.close();
            readerPath.close();
        } catch (FileNotFoundException e) {
            System.out.println("The specified file is not present in the given path.");
        } catch (IOException e) {
            System.out.println("Check the file in the specified path.");
        } catch (NullPointerException e) {
            System.out.println("Don't enter null");
        }
    }
}
