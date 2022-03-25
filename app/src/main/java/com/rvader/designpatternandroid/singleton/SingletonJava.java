package com.rvader.designpatternandroid.singleton;

/**
 * Created by Renz Manacmol on 25/3/22.
 */

//Singleton: restricts the instantiation of the
//class to on only one instance and be use everywhere.
public class SingletonJava {

    String textString;
    private static SingletonJava instance = null;

    private SingletonJava() {
    }

    //dealing with multithreading
    //synchronized, will ensure that there is no thread interference
    //allows one thread to run the method at a time,
    // forcing every other thread to be in a wait or blocked state
    public static synchronized SingletonJava getInstance() {
        if (instance == null) {
            instance = new SingletonJava();
        }
        return (instance);
    }

    //sample usage
    public void setText(String textString) {
        this.textString = textString;
    }

    public String getText() {
        return textString;
    }

}