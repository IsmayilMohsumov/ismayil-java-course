package org.example.lesson6.ismayil;

public class Cuma {

    private String adi = "cuma";

    Cuma(){
       //no-args
    }

    Cuma(int a){
        System.out.println(a);
    }

    public String bezilereiniBoyutTersdenQaytar(){
        String teze = ""; //cUmA
        int index = this.adi.length(); // 4

        while(index>0){
            index--;
            if (index%2!=0){
                Character a= this.adi.charAt(index);
                teze = teze + a.toString().toUpperCase();
            }else{
                teze = teze + adi.charAt(index);
            }
        }

        return teze;
    }

    public String tekleriBoyutTuzdenQaytar(){

        //
        return "";
    }

    public static void main(String[] args) {
        Cuma c = new Cuma();
        String s = c.bezilereiniBoyutTersdenQaytar();
        System.out.println(s);


    }

}
