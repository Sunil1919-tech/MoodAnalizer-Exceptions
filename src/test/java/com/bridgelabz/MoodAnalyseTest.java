package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * purpose-implement the MoodAnalyzer Program
 * using Exceptions
 *
 * @author Sunil
 * @version 16.0
 * @since 28/08/2021
 */
public class MoodAnalyseTest {
    //testCase to predict the mood happy/Sad
    @Test
    public void givenMessage_SadMood_Should_Return_Sad() {
        MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain("I am In a Sad Mood");
        String mood = moodAnalyzer.analyseMood();
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals("SAD", mood);


    }

    //Constructor in message should return Happy
    @Test
    public void givenMessage_AnyMood_Should_Return_HAPPY() {
        MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain("I am in Happy Mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY", mood);
    }
}
