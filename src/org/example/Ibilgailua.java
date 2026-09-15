package org.example;

public class Ibilgailua {
    String modeloa;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    String marka;
    int urtea;

    public int getUrtea() {
        return urtea;
    }

    public void setUrtea(int urtea) {

            if (urtea > 1900){
                this.urtea = urtea;
            }
    }

    public String getModeloa() {
        return modeloa;
    }

    public void setModeloa(String modeloa) {
        this.modeloa = modeloa;
    }

    public Ibilgailua (String modeloa, String marka, int urtea) {
       this.modeloa = modeloa;
       this.marka = marka;
       this.urtea = urtea;
   }

    public String erakutsiDatuak(){
        return this.marka + " " + this.modeloa + " " + this.urtea;
    }

    public void mugitu() {

    }
}
