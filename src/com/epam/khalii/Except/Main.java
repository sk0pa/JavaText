package com.epam.khalii.Except;

/**
 * Created by Anhelina_Khalii on 23.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        try{
            throw new MyOwnException();
        }
        catch (MyOwnException ex){
            System.out.println("Catch new exception");
        }
    }
}
