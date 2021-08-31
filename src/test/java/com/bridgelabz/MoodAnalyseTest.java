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
    public void given_SadMood_Should_Return_Sad() {
        MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain();
        String mood = moodAnalyzer.analyseMood("I am In a Sad Mood");
        Assertions.assertEquals("SAD", mood);

    }

}
