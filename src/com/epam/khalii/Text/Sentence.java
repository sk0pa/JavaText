package com.epam.khalii.Text;

import java.util.ArrayList;

/**
 * Created by Anhelina_Khalii on 22.04.2015.
 */
public class Sentence {

    private Word[] array;

    public Word[] getArray() {
        return array;
    }

    public void setArray(Word[] array) {
        this.array = array;
    }



    public Sentence(String s){
        String[] words = s.split("\\s+");
        Word[] word = new Word[words.length];
        for(int i=0;i<words.length;i++){
            word[i]= new Word(words[i]);
        }
        setArray(word);
    }

    public void replaceWord(int length, String result){
        for(Word w:array){
            if(w.length()==length)
                w.setW(result);
        }
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        int i;
        for(i=0;i<array.length-1;i++){
            builder.append(array[i].getW()+" ");
        }
        builder.append(array[i].getW()+".");
        return builder.toString();
    }
}
