package Bucles;

import java.util.Locale;
import java.util.Scanner;

public class NotesMitjaMaxiMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int CantNum = sc.nextInt();
        sc.nextLine();

        String NomMax = "";
        String NomMin = "";
        float MAX = 0;
        float Sub = 0;
        float MIN = 0;


        for (int A = 1;A<=CantNum;A++){
            String Nom = sc.next();
            float Num = sc.nextFloat();
            Sub = Sub+Num;
            MIN = Num;
            if (Num>MAX){
                MAX=Num;
                NomMax=Nom;
            }
            if (Num<MIN) {
                MIN=Num;
                NomMin=Nom;
            }

        }
        float MIT=Sub/CantNum;
        System.out.println("L'alumne amb major nota és el/la "+ NomMax +" amb un "+ MAX);
        System.out.println("L'alumne amb menor nota és el/la "+ NomMin +" amb un "+ MIN);
        System.out.println("La nota mitjana de la classe és de "+ MIT);
    }
}

