package com.dmdev.oop.lesson15;

public class TrainingGround {
    public static void main(String[] args) {

        Archer archer = new Archer("Max", 47);

        Mage mage = new Mage("Elliot",35);

        Warrior warrior = new Warrior("Steeve",15);

        Enemy enemy = new Enemy("Zombi",100);

        attackEnemy(enemy,warrior,mage,archer);
    }
    public static void attackEnemy(Enemy enemy, Hero... heroes){
        while (enemy.isAlive()){
            for (Hero hero :  heroes) {
                if(enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}
