package com.dmdev.oop.lesson15;

public class Mage extends Hero{
    public Mage(String name, int damage) {
        super(name, damage);
    }
    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println(getName()+" is making a spell on "+enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
