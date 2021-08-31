package com.bridgelabz;
/*
    MoodAnalyzerMain is an Object to declare the mood
    whether happy or sad
 */
public class MoodAnalyzerMain {
    // Constructor
    public MoodAnalyzerMain(){
    }

    public String analyseMood(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
