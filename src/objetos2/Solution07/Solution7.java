package objetos2.Solution07;


class Stat {
    int value;
    int max;

    public Stat(int value) {
        this.value = value;
        this.max = value;
    }
}

class Enemy {
    Stat health;
    Stat weapon;

    public Enemy(String type) {
        if (type.equals("guerrero")) {
            this.health = new Stat(50);
            this.weapon = new Stat(60);
        } else if (type.equals("amazona")) {
            this.health = new Stat(40);
            this.weapon = new Stat(70);
        } else if (type.equals("brujo")) {
            this.health = new Stat(30);
            this.weapon = new Stat(80);
        }
    }

}


public class Solution7 {
    public static void main(String[] args) {

        Enemy guerrero = new Enemy("guerrero");
        Enemy amazona = new Enemy("amazona");
        Enemy brujo = new Enemy("brujo");

        System.out.println("GUERRERO  " +
                "Health: " + guerrero.health.value + "/" + guerrero.health.max + "   " +
                "Weapon: " + guerrero.weapon.value + "/" + guerrero.weapon.max);

        System.out.println("AMAZONA   " +
                "Health: " + amazona.health.value + "/" + amazona.health.max + "   " +
                "Weapon: " + amazona.weapon.value + "/" + amazona.weapon.max);

        System.out.println("BRUJO     " +
                "Health: " + brujo.health.value + "/" + brujo.health.max + "   " +
                "Weapon: " + brujo.weapon.value + "/" + brujo.weapon.max);
    }
}

