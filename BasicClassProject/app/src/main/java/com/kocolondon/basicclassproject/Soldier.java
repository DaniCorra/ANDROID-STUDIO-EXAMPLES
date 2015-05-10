package com.kocolondon.basicclassproject;

import android.util.Log;

/**
 * Created by Kingsley on 10/05/2015.
 */
public class Soldier {
    int health;
    String soldierType;

    void shootEnemy() {
        //lets print which type of soldier is shooting
        Log.i(soldierType, "is shooting");
    }
}
