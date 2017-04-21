package com.EasterEgg;

import java.util.ArrayList;

/**
 * Created by jcamp on 4/18/2017.
 */
public class Basket {

    ArrayList<EasterEgg> aryBasket = new ArrayList<EasterEgg>();


    public void add(EasterEgg objEgg) {
        aryBasket.add(objEgg);
    }

    public void drop(EasterEgg objEgg) {
        aryBasket.remove(objEgg);
    }

    public String toString() {
        return aryBasket.toString();
    }
}
