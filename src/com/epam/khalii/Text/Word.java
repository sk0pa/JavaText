package com.epam.khalii.Text;

/**
 * Created by Anhelina_Khalii on 22.04.2015.
 */
public class Word {
    private String w;

    public String getW() {
        return w;
    }

    public void setW(String w) {
        this.w = w;
    }

    public Word(String word){
        setW(word);
    }

    boolean equals(Word o){
        if(o==null)
            return false;
        if(o.getClass()!=this.getClass())
            return false;
        if(this.getW().equals(o.getW()))
            return true;
        return false;
    }

    public int length(){
        return w.length();
    }

    public String toString(){
        return getW();
    }
}
