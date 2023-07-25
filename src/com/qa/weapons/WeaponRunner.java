package com.qa.weapons;

import com.qa.weapons.Weapon;

public class WeaponRunner {

    public static void main(String[] args) {

        Weapon w1 = new Weapon();
        w1.setName("Excalibur");
        w1.setDamageOutput(50);
        w1.setPrice(5000);
        w1.setOneHanded(true);
        w1.setSingleOperator(true);
        w1.setDurability(100);
        w1.setDamageType("Slashing");

        System.out.println(w1.getName());
        System.out.println(w1.getDamageOutput());
        System.out.println(w1.getPrice());
        System.out.println(w1.isOneHanded());
        System.out.println(w1.isSingleOperator());
        System.out.println(w1.getDurability());
        System.out.println(w1.getDamageType());
        System.out.println(w1.isBroken());

        w1.drawWeapon();
        System.out.println(w1.attack());
        System.out.println(w1.getDurability());
        for (int i = 0; i < 98; i++) {
            w1.attack();
        }
        System.out.println(w1.getDurability());
        System.out.println(w1.isBroken());
        System.out.println(w1.attack());
        System.out.println(w1.getDurability());
        System.out.println(w1.isBroken());

        Weapon w2 = new Weapon("Aymr", 42, 3000, true, true, 64, "Blunt");
        System.out.println(w2.getName());
        System.out.println(w2.getDamageOutput());
        System.out.println(w2.getPrice());
        System.out.println(w2.isOneHanded());
        System.out.println(w2.isSingleOperator());
        System.out.println(w2.getDurability());
        System.out.println(w2.getDamageType());
        System.out.println(w2.isBroken());

        Weapon w3 = new Weapon("Duskblade of Draktharr", 60, true, 50);
        System.out.println(w3);

        System.out.println(Weapon.isPeacefulMode());
        System.out.println(Weapon.togglePeacefulMode());
        System.out.println(Weapon.togglePeacefulMode());

        Weapon[] weapons = new Weapon[3];
        weapons[0] = w1;
        weapons[1] = w2;
        weapons[2] = w3;
        for (Weapon weapon : weapons) {
            System.out.println(weapon);
        }

        String[] words = new String[6];
        words[0] = "Hello";
        words[1] = "Universe";
        words[2] = "I";
        words[3] = "Am";
        words[4] = "Your";
        words[5] = "Creator";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (i != words.length-1) {
                sb.append(" ");
            }
        }

        System.out.println(sb);



    }

}
