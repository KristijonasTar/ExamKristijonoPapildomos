package lt.techin.exam;

import java.util.ArrayList;
import java.util.Collections;

public class Exercises {


    /*
     * Metodas parodo ar iš duotų trijų atkarpų (įvedami jų ilgiai) galima sudaryti trikampį.
     */
    public static boolean isTriangleValid(int a, int b, int c) {
            return a + b > c && b + c > a && a + c > b;
    }



    /* Metodas spausdina  nelyginius skaičius nuo pateikto skaičiaus 'number' iki 1
     * pvz. number = 8 =>
     * 7
     * 5
     * 3
     * 1
     *  */
    public static void printOddNumbers(int number) {
        for (int i = number; i > 0; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }



    /* Paskaičiuoti kiek masyve yra skaičių didesnių nei skaičius 'number'
     * Pvz. array =  {5, 2, 4, 1} number = 3 => 2
     */
    public static int countLargerThanNumber(int[] array, int number) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                count++;
            }
        }
        return count;
    }


    /* Surasti mažiausią skaičių ArrayListe
     * Pvz {6.7, 3.5, 8.2, 4.3} => 8.2
     */
    public static double findSmallest(ArrayList<Double> numbers) {
        double min = Collections.min(numbers);
        return min;
    }

    /* Paskaičiuoti kiek ArrayListe yra stringų, kuriuose yra žodis word
        pvz: {"iphone 12", "IPHONE 12", "samsung s23"} word = "iphone" => 2
     */
    public static int countStringsContainingWord(ArrayList<String> strings, String word) {
        int count = 0;
        for (String string : strings) {
            if (string.toLowerCase().contains(word.toLowerCase())) {
                count++;
            }
        }
        return count;
    }


    /* Metodas generuoja bet kokį atsitiktinį (nesikartojanti kviečiant metodą daug kartų) email adresą */
    public static String generateRandomEmail(){
        String emailAddress = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        while (emailAddress.length() < 5) {
            int character = (int) (Math.random() * 26);
            emailAddress += alphabet.substring(character, character + 1);
        }
        emailAddress += Integer.valueOf((int) (Math.random() * 99))
                .toString();
        emailAddress += "@" + "gmail.com";
        return emailAddress;
    }
}
