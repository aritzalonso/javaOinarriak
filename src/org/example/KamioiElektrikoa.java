package org.example;

public class KamioiElektrikoa extends Ibilgailua implements Elektrikoa{
    public KamioiElektrikoa(String marka, String modeloa, int urtea){
        super (marka, modeloa, urtea);
    }
   @Override
    public void mugitu(){
        System.out.println("kamioiElektrikoa mugitzen ari da.");
    }

    @Override
    public void kargatu(){
        System.out.println("kamoiElektrikoa kargatzne ari da.");
    }
}
