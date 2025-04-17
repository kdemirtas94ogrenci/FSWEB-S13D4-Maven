package org.example;

public enum Weapon {


    SWORD(8, 7),
    MACE(10, 3),
    CLUB(8, 3),
    ARROW(6, 6);

    private int damage;
    private double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return this.damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}


