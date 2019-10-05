package question3;

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        str = str.replace("a", "*");
        str = str.replace("e", "*");
        str = str.replace("i", "*");
        str = str.replace("o", "*");
        str = str.replace("u", "*");
        str = str.replace("A", "*");
        str = str.replace("E", "*");
        str = str.replace("I", "*");
        str = str.replace("O", "*");
        str = str.replace("U", "*");
        System.out.println(str);
    }
}
