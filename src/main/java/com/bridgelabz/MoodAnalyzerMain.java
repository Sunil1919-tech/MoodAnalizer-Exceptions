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
    Declaring analyseMood class
    exception Handling implentation
     */
    public String analyseMood() {
        try {

            if (this.message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}