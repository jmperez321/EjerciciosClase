package objetos2.Solution14;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        URL url = new URL();
        try {
            url.protocol = sc.nextLine();
            url.domain = sc.nextLine();
            url.path = sc.nextLine();
            url.query = sc.nextLine();
            url.fragment = sc.nextLine();

            url.validar();

        System.out.println(url);
        }catch (InvalidURLException e){
            System.out.println(e.getMessage());
        }
    }
}
