package projekt;

public class Row {
    private Boolean keepRunning;
    private Integer rowCount;
    private String longestWord;
    private Integer longestWordCount;
    private Integer wordCount;
    private Integer charCount;


    public Row(String lineInput) {

        // Spara attributet för att användas senare
        rowCount = 0;

        // Antal tecken i raden
        charCount = lineInput.length();

        // dela upp raden i ord
        String[] wordArray = lineInput.split(" ");

        // räkna antalet ord
        wordCount = wordArray.length;

        // kolla vilket som är det längsta ordet i raden
        longestWordCount = 0;
        for (String s : wordArray) {
            s = s.toLowerCase();
            if (s.equals("stop")) {
                keepRunning = false;
                wordCount--;
            } else keepRunning = true;

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

    public Boolean supposedToRun() {

        return keepRunning;

    }
    public void analyze(Row input) {
        rowCount++;
        wordCount += input.wordCount;
        charCount += input.charCount;
        if (longestWordCount < input.longestWordCount)
        {
            longestWord = input.longestWord;
            longestWordCount = input.longestWordCount;

        }

    }

}