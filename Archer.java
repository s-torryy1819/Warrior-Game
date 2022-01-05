package com.dmdev.oop.lesson15;

public class Archer extends Hero{
    public Archer(String name, int damage) {
        super(name, damage);
    }
    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println(getName()+" is shooting a bow into "+enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
