package CastngsLiterals;

import java.util.Locale;
import java.util.Scanner;

public class Scrollbar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float Vh = sc.nextFloat(); // ViewportHight
        float Ch = sc.nextFloat(); // ContentHight
        float Ah = sc.nextFloat(); // ArrowHeihgt

        double Th = (Vh-2*Ah)*Vh/Ch; //ThumbHeihgt
        double Sj = (Ch - Vh)/(Vh - 2*Ah - Th); //ScrollJump

        System.out.println((int)Th);
        System.out.println((int)Sj);
    }
}
