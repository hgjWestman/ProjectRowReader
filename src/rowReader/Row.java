package rowReader;

public class Row {
    private Boolean keepRunning;
    private Integer rowCount;
    private String longestWord;
    private Integer longestWordCount;
    private Integer wordCount;
    private Integer charCount;


    public Row() {

        keepRunning = true;
        rowCount = 0;
        longestWord = "";
        longestWordCount = 0;
        wordCount = 0;
        charCount = 0;

    }

    public void populate(String lineInput) {

        // count number of characters in the line
        charCount = lineInput.length();

        // split line into an array of words, separated by whitespace
        String[] wordArray = lineInput.split(" ");

        // count number of words in the line
        wordCount = wordArray.length;

        // find the (first) longest word in the line
        longestWordCount = 0;
        keepRunning = true;
        for (String s : wordArray) {
            s = s.toLowerCase();

            // check if the line contains the word "stop", and change keepRunning to false if it does
            if (s.equals("stop")) {
                keepRunning = false;
            }

            // check if the current word is the longest yet, and if it is, save it
            if (s.length() > longestWordCount) {
                longestWordCount = s.length();
                longestWord = s;
            }
        }
    }

    public Integer getRowsCount() {

        return rowCount;

    }
    public String getLongestWord() {

        return longestWord;

    }

    public Integer getLongestWordChars() {

        return longestWordCount;

    }

    public Integer getWordCount() {

        return wordCount;

    }
    public Integer getCharCount() {

        return charCount;

    }

    public Boolean getKeepRunning() {

        return keepRunning;

    }
    public void analyze(Row input) {

        rowCount++; // increase number of lines
        wordCount += input.wordCount; // add number of words to the sum of words in the previous lines
        charCount += input.charCount; // add number of characters to the sum of characters in the previous lines

        if (longestWordCount < input.longestWordCount) // check if the new line contains a longer word than previous lines
        {
            longestWord = input.longestWord;
            longestWordCount = input.longestWordCount;

        }

    }

}