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
    //testCase to predict the mood Sad
    @Test
    public void given_NullMood_Should_Throw_MoodAnalysisException() {
        MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain(null);
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            Assertions.assertEquals(MoodAnalysisException.Exception_Type.NULL,e.type);
        }
    }
}