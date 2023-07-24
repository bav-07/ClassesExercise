package com.qa.classes;

public class Weapon {

    private String name;
    private int damageOutput;
    private int price;
    private boolean isOneHanded;
    private boolean singleOperator;
    private int durability;
    private String damageType;
    private boolean isBroken = false;

    public Weapon(String name, int damageOutput, int price, boolean isOneHanded, boolean singleOperator, int durability, String damageType) {
        super();
        this.name = name;
        this.damageOutput = damageOutput;
        this.price = price;
        this.isOneHanded = isOneHanded;
        this.singleOperator = singleOperator;
        this.durability = durability;
        this.damageType = damageType;
    }

    public Weapon() {
        super();
    }

    public void drawWeapon() {
        System.out.println(name + " has been drawn.");
    }

    public int attack() {
        if (!isBroken) {
            this.setDurability(--durability);
            if (this.durability == 0) {
                this.setBroken(true);
                return this.damageOutput * 2;
            }
            return this.damageOutput;
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamageOutput() {
        return damageOutput;
    }

    public void setDamageOutput(int damageOutput) {
        this.damageOutput = damageOutput;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isOneHanded() {
        return isOneHanded;
    }

    public void setOneHanded(boolean oneHanded) {
        isOneHanded = oneHanded;
    }

    public boolean isSingleOperator() {
        return singleOperator;
    }

    public void setSingleOperator(boolean singleOperator) {
        this.singleOperator = singleOperator;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

}
