package org.example;

public class Ibilgailua {
    String modeloa;
    String marka;
    int urtea;
   public Ibilgailua (String modeloa, String marka, int urtea) {
       this.modeloa = modeloa;
       this.marka = marka;
       this.urtea = urtea;
   }
    public void erakutsiDatuak(){
        System.out.println("ibilgailua: " + marka + " " + modeloa + " " + urtea);


    }
}
