package NumberGuessingGame;

class DataProvider {
    private int boundValueOfRandomNumber;
    private int randomNumber;
    private int guessedNumber;
    private String reportFolderFilePath;
    private String gameReportFilePath;
    private String reportFormatFilePath;

    public int getBoundValueOfRandomNumber() {
        return boundValueOfRandomNumber;
    }

    public void setBoundValueOfRandomNumber(int boundValue) {
        this.boundValueOfRandomNumber = boundValue;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomValue) {
        this.randomNumber = randomValue;
    }

    public int getGuessedNumber() {
        return guessedNumber;
    }

    public void setGuessedNumber(int guessValue) {
        this.guessedNumber = guessValue;
    }

    public String getReportFormatFilePath() {
        return reportFormatFilePath;
    }

    public void setReportFormatFilePath(String reportFormatFilePath) {
        this.reportFormatFilePath = reportFormatFilePath;
    }

    public String getGameReportFilePath() {
        return gameReportFilePath;
    }

    public void setGameReportFilePath(String gameReportFilePath) {
        this.gameReportFilePath = gameReportFilePath;
    }

}
