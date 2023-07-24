package com.qa;

import com.qa.classes.Weapon;

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


    }

}
