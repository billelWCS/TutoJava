package atelierMonster;

import java.util.Random;

public class Arena {
    public static void main (String[] args){
        Monster kingKong = new Monster("King Kong", 10, 100);
        Monster godzilla = new Monster("Godzilla", 15, 100);

        Random random = new Random();

        while (kingKong.getLife() > 0 && godzilla.getLife() > 0){
            if (random.nextInt(2) == 0) {
                kingKong.attack(godzilla);
            }else {
                godzilla.attack(kingKong);
            }
        }

        if (kingKong.getLife() > 0) {
            System.out.println(kingKong.getName()+ "a gagné");
        }else {
            System.out.println(godzilla.getName()+ "a gagné");
        }
    }
}
