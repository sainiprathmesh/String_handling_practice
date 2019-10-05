package question4;

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int l = s.length();
        String s1 = s.toLowerCase();
        String s2 = "";
        int c = 0;
        for (int i = 0; i < l; i++) {
            char ch = s1.charAt(i);
            char ch1 = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                c++;
                if (c % 3 == 1)
                    s2 += '*';
                else if (c % 3 == 2)
                    s2 += '^';
                else
                    s2 += '!';
            } else
                s2 += ch1;
        }

        System.out.println(s2);

    }
}
