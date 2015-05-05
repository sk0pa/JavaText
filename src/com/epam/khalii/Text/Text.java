package com.epam.khalii.Text;

/**
 * Created by Anhelina_Khalii on 22.04.2015.
 */
public class Text {

    private Sentence[] sarray;

    public Sentence[] getSarray() {
        return sarray;
    }

    public void setSarray(Sentence[] sarray) {
        this.sarray = sarray;
    }

    public Text(){
    }

    public Text(String s){
        s = s.replace(',',' ');
        String[] sentenses = s.split("[.!?]+");
        Sentence[] array = new Sentence[sentenses.length];
        for(int i=0;i<array.length;i++){
            array[i] = new Sentence(sentenses[i]);
        }
        setSarray(array);
    }

    public void replaceWord(int length, String result){
        for(int i=0;i<sarray.length;i++){
            sarray[i].replaceWord(length, result);
        }
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        int i;
        for(i=0;i<sarray.length;i++){
            builder.append(sarray[i].toString());
        }
        return builder.toString();
    }
}
