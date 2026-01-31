package bucles;

import java.util.Locale;
import java.util.Scanner;

public class ShowLineNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);


        int LineNum = 1;
        String Line = sc.nextLine();
        while (!Line.equals("END")) {
            System.out.println(LineNum + " | " + Line);
            Line = sc.nextLine();
            LineNum++;
        }
    }
}