package question1;

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        System.out.print("\nIndex: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.indexOf(str.charAt(i)) + "\t");
        }
        System.out.print("\nChars: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "\t");
        }

    }
}
