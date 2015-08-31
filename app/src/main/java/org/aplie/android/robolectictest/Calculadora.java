package org.aplie.android.robolectictest;

public class Calculadora {
    public String suma(int valor1,int valor2){
        return Integer.toString(valor1 + valor2);
    }

    public String resta(int valor1,int valor2){
        return Integer.toString(valor1 - valor2);
    }

    public String multiplicar(int valor1,int valor2){
        return Integer.toString(valor1 * valor2);
    }

    public String dividir(int valor1,int valor2){
        String resutl = "";
        if(valor2 == 0){
            resutl = "No se puede dividir entre 0";
        }else {
            resutl = Integer.toString(valor1 / valor2);
        }

        return resutl;
    }
}
