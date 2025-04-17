package org.example;

public class Player {

    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = healthPercentage < 0 ? 0 : Math.min(healthPercentage, 100);
        this.weapon = weapon;
    }

    public int healthRemaining() {
        return this.healthPercentage;
    }

    public void loseHealth(int damage) {

        this.healthPercentage = Math.max(this.healthPercentage - damage, 0);

        if (healthPercentage == 0)
            System.out.println(name + " player has been knocked out of game");
    }

    public void restoreHealth(int healthPotion) {

        //TODO Buna ekstra kontrol ekle

        this.healthPercentage = Math.min(this.healthPercentage + healthPotion, 100);
    }
}


