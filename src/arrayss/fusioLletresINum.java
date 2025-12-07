package arrayss;

import java.util.Locale;
import java.util.Scanner;

public class fusioLletresINum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int longA = sc.nextInt();
        char[] entradaA = new char[longA];
        for (int i = 0; i < longA; i++) {
            entradaA[i] = sc.next().charAt(0);
        }
        int longB = sc.nextInt();
        char[] entradaB = new char[longB];
        for (int i = 0; i < longA; i++) {
            entradaB[i] = sc.next().charAt(0);
        }
        char[] arrayLetras = new char[longA + longB];
        char[] arrayNum = new char[longA + longB];
        int posicionLetras = 0;
        int posicionNum = 0;
        for (int i = 0; i < longA; i++) {
            if (Character.isLetter(entradaA[i])) {
                arrayLetras[posicionLetras] = entradaA[i];
                posicionLetras++;
            } else {
                arrayNum[posicionNum] = entradaB[i];
                posicionNum++;
            }
        }
        for (int i = 0; i < longB; i++) {
            if (!Character.isLetter(entradaB[i])) {
                arrayNum[posicionNum] = entradaB[i];
                posicionNum++;
            } else {
                arrayLetras[posicionLetras] = entradaA[i];
                posicionLetras++;
            }
        }
        int minSize;
        if (longA > longB) {
            minSize = longB;
        } else {
            minSize = longA;
        }
        char[] arrayFusion = new char[longA + longB];
        int posicionFusion = 0;
        for (int i = 0; i < minSize; i++) {
            if (posicionNum > 0) {
                arrayFusion[posicionFusion] = arrayNum[i];
                posicionFusion++;
            }
            if (posicionLetras > 0) {
                arrayFusion[posicionFusion] = arrayLetras[i];
                posicionFusion++;
            }
        }
        if (arrayNum.length > arrayLetras.length) {
            for (int i = posicionLetras; i < entradaA.length; i++) {
                arrayFusion[posicionFusion] = arrayLetras[posicionLetras];
                posicionLetras++;
            }
        } else {
            for (int i = posicionNum; i < entradaB.length; i++) {
                arrayFusion[posicionFusion] = arrayNum[posicionNum];
                posicionNum++;
            }
        }
        for (char melon : arrayFusion) {
            System.out.print(melon + " ");
        }
    }
}

