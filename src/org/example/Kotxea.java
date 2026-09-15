package org.example;

public class Kotxea extends Ibilgailua{
    final static int GURPIL_KOPURUA = 4;
    public Kotxea(String modeloa, String marka, int urtea) {
        super(modeloa, marka, urtea);
}
    @Override
    public String erakutsiDatuak(){
        return "Kotxea: "+ super.erakutsiDatuak();

    }
}
