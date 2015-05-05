package com.epam.khalii.Text;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please, tap some text. ");
        Scanner sc = new Scanner(System.in);
        Text text = new Text();
        if (sc.hasNextLine()) {
            text = new Text(sc.nextLine());
        }
        System.out.println("Wait...");
        System.out.println("Enter word length you need to replace");
        int len=0;
        try {
        if (sc.hasNextInt()) {
             len = sc.nextInt();
        }
        }
        catch(NumberFormatException ex){
            System.out.println("Sorry, it's not an integer");
            return;
        }
        System.out.println("Wait...");
        String word;
        System.out.println("Enter word to which you need to replace");
        if (sc.hasNext()) {
            word = sc.next();
            text.replaceWord(len, word);
            System.out.println(text.toString());
        }
    }
}
