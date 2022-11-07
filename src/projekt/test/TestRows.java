package projekt.test;

import org.junit.Test;
import projekt.Row;

import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertNotEquals;


public class TestRows {
    //Testa 1 och få resultatet 1 ifrån FizzBuzz
    @Test
    public void findStopInLine() {
        //Arrange
        Row testRow = new Row("Stop in the name of love");

        Boolean expected = false;

        //Act
        Boolean actual = testRow.supposedToRun();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void longestWordSingleLine() {
        //Arrange
        Row testRow = new Row("I'm so excited");

        String expected = "excited";

        //Act
        String actual = testRow.getLongestWord();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void calculateCharsMultiLine() {
        //Arrange
        Row no1 = new Row("And I was meant for so much more");
        Row no2 = new Row("And I found a dream worth fighting for");

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
        Row no1 = new Row("And I was meant for so much more");
        Row no2 = new Row("And I found a dream worth fighting for");
        no1.analyze(no2);

        Integer expected = 16;

        //Act
        Integer actual = no1.getWordCount();

        //Assert
        assertEquals(expected, actual);
    }

}
