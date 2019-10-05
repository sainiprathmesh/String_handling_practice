package question8;

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int l = s.length();
        long a = 0;
        for (int i = 0; i < l; i++) {
            if ((int) (s.charAt(i)) >= 65 && (int) (s.charAt(i)) <= 90) {
                a += s.charAt((i));
            }
        }
        System.out.println("Upper weight=" + a);
    }
}
