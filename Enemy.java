package com.dmdev.oop.lesson15;

public class Enemy implements Mortal{
    private int health;
    private String name;

    public Enemy(String name,int health) {
        this.health = health;
        this.name = name;
    }
    public void takeDamage(int damage){
        if(isAlive() && health <= damage) {
            health = 0;
            System.out.println(getName() + " died");
        }
        else {
            this.health -= Math.min(health,damage);
            System.out.println(getName()+" got damage : "+damage + "\n "+ health + " is left");
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }
}
