package com.company;

public class Concatrnacion {
    public static void main(String[] args) {
        var usuario = "Joel";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;

        System.out.println("union = " + union);

        var i = 3;
        var j = 4;

        System.out.println(i + j);//suma de numeros
        System.out.println(i + j + usuario);//primero realiza la suma y al lado el texto
        System.out.println(usuario + i + j);// contexto cadena, todo en una sola
        System.out.println(usuario +(i + j) );//uso de parantesis modifica el print

    }
}
