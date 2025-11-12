package EXM;

import java.util.Locale;
import java.util.Scanner;

public class EXM4_1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        float B = sc.nextFloat();
        String A = String.valueOf(B);
        int AL = A.length();
        int AP = A.indexOf('.');
        String AD= A.substring(AP+1,AL);
        int T = Integer.parseInt(AD);

        if (T==0){
            System.out.println("El nombre actual és divisible entre 3.");
        } else if(T%2!=0){
            System.out.println("El nombre actual és senar.");
        } else{
            System.out.println("El nombre actual no és senar ni és divisible entre tres.");
        }
    }
}
