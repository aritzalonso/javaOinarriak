package org.example;


public class Main {
    public static void main(String[] args) {
        Ibilgailua ibilgailua = new Ibilgailua("SEAT", "LEON" , 2000);

        ibilgailua.erakutsiDatuak();
        Kotxea kotxea = new Kotxea ("SEAT", "LEON" , 2000);
        kotxea.erakutsiDatuak();
        Motoa motoa = new Motoa ("MTB","kawasaki", 1999);
        motoa.erakutsiDatuak();
    }
    }
