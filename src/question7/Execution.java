package question7;

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int l = s.length();
        long a = 0;
        for (int i = 0; i < l; i++)
            a += 0 + s.charAt((i));
        System.out.println("total weight=" + a);
    }
}
