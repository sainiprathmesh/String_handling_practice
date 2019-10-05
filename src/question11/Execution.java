package question11;

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().trim();
        char c = (sc.next()).charAt(0);
        for (int i = 0; i < s1.length(); i++) {
            if (c == s1.charAt(i))

                System.out.print(i + " ");
        }
    }
}
