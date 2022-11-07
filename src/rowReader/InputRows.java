package rowReader;

import java.util.Scanner;

public class InputRows {
    public static void main(String[] args) {

        boolean keepRunning = true;

        Row sumRows = new Row();
        System.out.println("-------------------------");
        System.out.println("Programmet kommer att be dig ange en ny textrad tills att du skriver ordet \"stop\", då kommer programmet redovisa antalet rader, ord och tecken, samt vilket som var ditt längsta ord.");
        System.out.println(" ");
        System.out.println("Skriv din text:");

        Row inputRow = new Row();
        Scanner scan = new Scanner(System.in);
        while (keepRunning) {

            String lineInput = scan.nextLine();
            inputRow.populate(lineInput);

            keepRunning = inputRow.getKeepRunning();

            if (keepRunning)
                sumRows.analyze(inputRow);
            }

            System.out.println("-------------------------");
            System.out.println("Allt exkl raden med  \"stop\"");
            System.out.println("-------------------------");
            System.out.println("Antal rader: " + sumRows.getRowsCount());
            System.out.println("Längsta ordet: " + sumRows.getLongestWord());
            System.out.println("Antal bokstäver i det längsta ordet: " + sumRows.getLongestWordChars());
            System.out.println("Totalt antal ord: " + sumRows.getWordCount());
            System.out.println("Totalt antal tecken (inklusive blanksteg): " + sumRows.getCharCount());
            System.out.println("-------------------------");



    }
}
