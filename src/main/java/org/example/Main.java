package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a = 3;
        double b = 2.99;
        boolean c = true;
        char d = 'A';
        String e = "Hallo Welt"; // Sequenz aus Buchstaben, daher kein Primitive

        int bananen = 5;
        bananen = 4;
        bananen = bananen - 1;
        bananen += 3;
        System.out.println("Bananen: " + bananen);

        // Operations und type casting
        int x = 10;
        int y = 3;
        double result = (double) x / y;
        String resultString = Double.toString(result);
        System.out.println(result);
        System.out.println(resultString);

        // Vergleiche
        boolean comp = a > b;
        boolean boolcomp =  3 == 3;
        String a  = "hallo";
        String b = "hallo";

        boolean comp = !a.equals(b);
        System.out.println(comp);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wie viel Geld hast du zum Einkaufen? ");

        int geldZumEinkaufen = scanner.nextInt();

        System.out.print("Möchtest du einkaufen gehen (ja/nein)? ");
        String einkaufenJaNein = scanner.next();

        if (geldZumEinkaufen > 30 && einkaufenJaNein.equals("ja")) {
            System.out.println("Du kannst einkaufen gehen. Los geht´s");
        } else if (geldZumEinkaufen <= 30 && einkaufenJaNein.equals("ja")) {
            System.out.println("Ein Eis ist vielleicht noch drin!");
        } else if (geldZumEinkaufen > 30 && einkaufenJaNein.equals("nein")) {
            System.out.println("Wie wäre es damit das Geld anzulegen?");
        } else {
            System.out.println("Du brauchst mehr Geld");
        }

        System.out.println("Bitte geben eine Zahl zwischen 1 und 3 ein:");
        int zahl = scanner.nextInt();

        String monatsname = "";

        switch (zahl) {
            case 1:
                monatsname = "Januar";
                break;
            case 2:
                monatsname = "Februar";
                break;
            case 3:
                monatsname = "März";
                break;
            default:
                System.out.println("Die eingegebene Zahl ist ungültig.");
                break;
        }

        if (!monatsname.equals("")) {
            System.out.println("Die Zahl " + zahl + " entspricht dem Monat " + monatsname);
        }

        String[] namen = new String[5];
        namen[0] = "Markus";
        namen[1] = "Max";
        namen[6] = "Lukas";

        String[] namen = {"Markus", "Lukas", "Max"};
        int[] numbers = {1,2,3,4};
        numbers[3] = 10;

        String[] mehrNamen = namen;
        String[] mehrNamen = namen.clone();
        mehrNamen[2] = "Sebastian";
        System.out.println(namen[2]);

        int[][] numbers = {{1,2,3}, {1,2,3}};
        int[][] newNumbers = numbers.clone();
        numbers[0][1] = 10;
        System.out.println(numbers[0][1]);


        for (int i = 0; i < namen.length; i++) {
            System.out.println(namen[i]);
        }

        for (String name : namen) {
            System.out.println(name);
        }

        int i = 0;
        while (i < namen.length) {
            System.out.println(namen[i]);
            i++;
        }

        int i = 0;
        do {
            System.out.println(namen[i]);
            i++;
        } while (i < namen.length);


        for (int[] row : numbers) {
            for (int num : row) {
                System.out.println(num + " ");
            }
        }

        // Collections

        String[] namen = {"Markus", "Lukas", "Max"};
        String[] newNamen = new String[namen.length + 1];

        // Copy all the elements from the original array to the new array
        for (int i = 0; i < namen.length; i++) {
            newNamen[i] = namen[i];
        }
        newNamen[newNamen.length - 1] = "John";
        namen = newNamen;
        System.out.println(Arrays.stream(namen).toList());

        List<String> namen = new ArrayList<>();
        namen.add("Markus");
        namen.add("Lukas");
        namen.add("Max");

        List<String> namen = new ArrayList<>(Arrays.asList("Markus", "Lukas", "Max"));
        namen.add("John");
        System.out.println(namen);

        List<String> namen = new LinkedList<>(Arrays.asList("Markus", "Lukas", "Max"));
        namen.add("John");
        namen.remove("Markus");
        System.out.println(namen);


        HashMap<String, Integer> nameToAge = new HashMap<>();
        Map<String, Integer> nameToAge = new TreeMap<>();
        nameToAge.put("Markus", 25);
        nameToAge.put("Lukas", 30);
        nameToAge.put("Max", 27);
        nameToAge.put("John", 28);

        nameToAge.replace("Lukas", 50);
        nameToAge.remove("Max");

        System.out.println(nameToAge);

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfGuesses = 0;
        int guessesLeft = 10;
        boolean hasWon = false;

        System.out.println("Ich denke an eine Zahl zwischen 1 und 100. Kannst du sie erraten?");

        while (numberOfGuesses < 10) {
            System.out.print("Gib deine Vermutung ein (du hast noch " + guessesLeft + " Versuche übrig): ");
            int guess = scanner.nextInt();
            numberOfGuesses++;
            guessesLeft--;

            if (guess < numberToGuess) {
                System.out.println("Deine Vermutung ist zu niedrig.");
            } else if (guess > numberToGuess) {
                System.out.println("Deine Vermutung ist zu hoch.");
            } else {
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("Glückwunsch! Du hast die Zahl in " + numberOfGuesses + " Versuchen erraten.");
        } else {
            System.out.println("Sorry, du hast die Zahl nicht erraten. Es war " + numberToGuess + ".");
        }



    }

}