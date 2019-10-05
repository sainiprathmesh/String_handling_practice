package question5;

import java.util.Scanner;

public class Execution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine().trim();
        String target = sc.nextLine().trim();
        String replacement = sc.nextLine().trim();
        CharSequence t = target;
        CharSequence r = replacement;
        String s2 = st.replace(t, r);
        System.out.println(s2);
    }
}
