package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("lütfen boyunuzu(metre cinsinden) giriniz:");
        Scanner input= new Scanner(System.in);
        double boy= input.nextDouble();
        System.out.print("lütfen kilonuzu giriniz:");
        double kilo= input.nextDouble();

        double vucutIndeksi= (kilo/(boy*boy));

        System.out.println("vücut kitle indeksiniz:"+vucutIndeksi);


    }
}
