package com.EasterEgg;

public class Main {

    public static void main(String[] args) {

        EasterEgg objEasterEgg = new EasterEgg();

            Basket objBasket = new Basket();
            objBasket.add(new EasterEgg());
            objBasket.add(new EasterEgg());
            objBasket.add(new EasterEgg());
            objBasket.add(new EasterEgg());
            System.out.println(objBasket);
            System.out.println("Number of Eggs: " + objEasterEgg.EggCounter());

    }
}
