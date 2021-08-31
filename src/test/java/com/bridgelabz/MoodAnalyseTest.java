package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**purpose-implement the MoodAnalyzer Program
 * using Exceptions
 * @author Sunil
 * @version 16.0
 * @since 28/08/2021
 */
public class MoodAnalyseTest {
    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain();
        String mood = moodAnalyzer.analyseMood("I am In Any Mood");
        Assertions.assertEquals("HAPPY", mood);

    }

}
