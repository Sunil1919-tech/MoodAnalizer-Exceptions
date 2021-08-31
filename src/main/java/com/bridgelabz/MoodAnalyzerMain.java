package com.bridgelabz;

/*
    MoodAnalyzerMain is an Object to declare the mood
    whether happy or sad
 */
public class MoodAnalyzerMain {
    private String message;

    // Constructor
    public MoodAnalyzerMain() {
    }

    //paraMetarised constructor
    public MoodAnalyzerMain(String message) {
        this.message = message;
    }

    /*
    Declaring analyseMood Method
     */
    public String analyseMood() {
        if (this.message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
