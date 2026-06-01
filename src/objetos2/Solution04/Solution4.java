package objetos2.Solution04;

import java.util.*;

class FunctionGame2 {

    public boolean function2(float param) {
        if (param >= 0) {
            return true;
        } else {
            return false;
        }
    }


    public boolean function1(int param) {
        if (param % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    public String function3(int param1, String param2) {
        String pal = "";
        for (int i = 0; i < param1; i++) {
            pal = pal + param2;
        }
        return pal;
    }

    public int function4(int[] param) {
        int num = 0;
        for (int i = 0; i < param.length; i++) {
            num = num + param[i];
        }
        return num;
    }

    public int[] function5(int[] param) {
        int[] a = new int[param.length];
        for (int i = 0; i < param.length; i++) {
            a[i] = param[i] * 2;
        }
        return a;
    }

    public String[] function6(int param1, boolean param2) {
        String[] a = new String[param1];
        if (param2) {
            for (int i = 0; i < param1; i++) {

                a[i] = "cierto";
            }
        }
        if (!param2) {
            for (int i = 0; i < param1; i++) {

                a[i] = "falso";
            }

        }
        return a;
    }

    public int function7(String[] param) {
        int c = 0;
        for (int i = 0; i < param.length; i++) {
            if (param[i].equals("java")) {
                c++;
            }
        }
        return c;
    }


    public int[] function8(int param1, int param2, int param3) {
        int[] a = {param1, param2, param3};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }
}

public class Solution4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FunctionGame2 fg2 = new FunctionGame2();

        String functionName = scanner.next();

        switch (functionName) {
            case "function1":
                for (int i = 5; i-- > 0; ) {
                    int param = scanner.nextInt();
                    boolean returnValue = fg2.function1(param);
                    System.out.println(param + " -> " + returnValue);
                }
                break;
            case "function2":
                for (int i = 6; i-- > 0; ) {
                    float param = scanner.nextFloat();
                    boolean returnValue = fg2.function2(param);
                    System.out.println(param + " -> " + returnValue);
                }
                break;
            case "function3":
                for (int i = 4; i-- > 0; ) {
                    int param1 = scanner.nextInt();
                    String param2 = scanner.next();
                    String returnValue = fg2.function3(param1, param2);
                    System.out.println(param1 + "," + param2 + " -> " + returnValue);
                }
                break;
            case "function4":
                for (int i = 4; i-- > 0; ) {
                    int size = scanner.nextInt();
                    int[] param = new int[size];
                    for (int j = 0; j < size; j++) {
                        param[j] = scanner.nextInt();
                    }
                    int returnValue = fg2.function4(param);
                    System.out.println(Arrays.toString(param) + " -> " + returnValue);
                }
                break;
            case "function5":
                for (int i = 4; i-- > 0; ) {
                    int size = scanner.nextInt();
                    int[] param = new int[size];
                    for (int j = 0; j < size; j++) {
                        param[j] = scanner.nextInt();
                    }
                    int[] returnValue = fg2.function5(param);
                    System.out.println(Arrays.toString(param) + " -> " + Arrays.toString(returnValue));
                }
                break;
            case "function6":
                for (int i = 4; i-- > 0; ) {
                    int param1 = scanner.nextInt();
                    boolean param2 = scanner.nextBoolean();
                    String[] returnValue = fg2.function6(param1, param2);
                    System.out.println(param1 + "," + param2 + " -> " + Arrays.toString(returnValue));
                }
                break;
            case "function7":
                for (int i = 5; i-- > 0; ) {
                    int size = scanner.nextInt();
                    String[] param = new String[size];
                    for (int j = 0; j < size; j++) {
                        param[j] = scanner.next();
                    }
                    int returnValue = fg2.function7(param);
                    System.out.println(Arrays.toString(param) + " -> " + returnValue);
                }
                break;
            case "function8":
                for (int i = 9; i-- > 0; ) {
                    int param1 = scanner.nextInt();
                    int param2 = scanner.nextInt();
                    int param3 = scanner.nextInt();
                    int[] returnValue = fg2.function8(param1, param2, param3);
                    System.out.println(param1 + "," + param2 + "," + param3 + " -> " + Arrays.toString(returnValue));
                }
                break;
        }
    }
}
