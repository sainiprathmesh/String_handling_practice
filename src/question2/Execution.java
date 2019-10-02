package question2;

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        int n = sc.nextInt();
        System.out.println(str.substring(n));
    }
}
