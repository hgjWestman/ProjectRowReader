package projekt;

import java.util.Scanner;

public class InputRows {
    public static void main(String[] args) {

        boolean keepRunning = true;

        Row oldRows = new Row("");
        System.out.println("-------------------------");
        System.out.println("Programmet kommer att be dig ange en ny textrad tills att du skriver ordet \"stop\", då kommer programmet redovisa antalet rader, ord och tecken, samt vilket som var ditt längsta ord.");
        System.out.println(" ");
        System.out.println("Skriv din text:");

        while (keepRunning) {
            Scanner scan = new Scanner(System.in);


            String lineInput = scan.nextLine();
            Row inputRow = new Row(lineInput);


            keepRunning = inputRow.supposedToRun();
            if (keepRunning)
                oldRows.analyze(inputRow);
            }

            System.out.println("-------------------------");
        System.out.println("Allt exkl raden med  \"stop\"");
        System.out.println("-------------------------");
            System.out.println("Antal rader: " + oldRows.getRowsCount());
            System.out.println("Längsta ordet: " + oldRows.getLongestWord());
            System.out.println("Antal bokstäver i det längsta ordet: " + oldRows.getLongestWordChars());
            System.out.println("Totalt antal ord: " + oldRows.getWordCount());
            System.out.println("Totalt antal tecken (inklusive blaksteg): " + oldRows.getCharCount());
            System.out.println("-------------------------");



    }
}
