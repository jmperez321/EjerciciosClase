package objetos2.Solution22;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Fighter {
    String name;
    float strength;
    float speed;
    float agility;

    Fighter(String name, float strength, float speed, float agility) {
        this.name = name;
        this.strength = strength;
        this.speed = speed;
        this.agility = agility;
    }

    float getSum(){
        return strength + speed + agility;
    }
}

class Fight {
    public Fighter winner(Fighter f1, Fighter f2) {
        if (f1.getSum()>f2.getSum()){
            return f1;
        } else if(f1.getSum()< f2.getSum()){
            return f2;
        } else{
            return null;
        }
    }
}

public class Solution22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fighter f1 = new Fighter(sc.next(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        Fighter f2 = new Fighter(sc.next(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());

        Fighter winner = new Fight().winner(f1, f2);

        System.out.println(winner == null ? "DOUBLE KO" : winner.name);
    }
}
