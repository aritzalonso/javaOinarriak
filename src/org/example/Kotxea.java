package org.example;

public class Kotxea extends Ibilgailua{
    public Kotxea(String modeloa, String marka, int urtea) {
        super(modeloa, marka, urtea);
}
    @Override
    public String erakutsiDatuak(){
        return "Kotxea: "+ super.erakutsiDatuak();

    }
}
