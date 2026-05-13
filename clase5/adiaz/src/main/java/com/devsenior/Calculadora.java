package com.devsenior;

public class Calculadora {
    public int sumar(int numero1 , int numero2){
        return numero1 + numero2;
    }

    public int dividir(int numero1, int numero2){
        if(numero2 == 0){
            throw new IllegalArgumentException("Math Error");
        }
        return numero1 / numero2;
    }
}
