package rowReader.test;

import org.junit.Test;
import rowReader.Row;

import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertNotEquals;


public class TestRows {

    @Test
    public void findStopInLine() {
        //Arrange
        Row testRow = new Row();
        testRow.populate("Stop in the name of love");

        Boolean expected = false;

        //Act
        Boolean actual = testRow.getKeepRunning();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void longestWordSingleLine() {
        //Arrange
        Row testRow = new Row();
        testRow.populate("I'm so excited");

        String expected = "excited";

        //Act
        String actual = testRow.getLongestWord();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void calculateCharsMultiLine() {
        //Arrange
        Row no1 = new Row();
        no1.populate("And I was meant for so much more");
        Row no2 = new Row();
        no2.populate("And I found a dream worth fighting for");

        no1.analyze(no2);

        Integer expected = 70;

        //Act
        Integer actual = no1.getCharCount();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void calculateWordsMultiLine() {
        //Arrange
        Row no1 = new Row();
        no1.populate("And I was meant for so much more");
        Row no2 = new Row();
        no2.populate("And I found a dream worth fighting for");
        no1.analyze(no2);

        Integer expected = 16;

        //Act
        Integer actual = no1.getWordCount();

        //Assert
        assertEquals(expected, actual);
    }

}
