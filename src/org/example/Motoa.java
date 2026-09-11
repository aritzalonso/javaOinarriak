package org.example;

public class Motoa extends Ibilgailua {
    public Motoa(String modeloa, String marka, int urtea) {
        super(modeloa, marka, urtea);
    }

    @Override
    public String erakutsiDatuak() {
        return "Kotxea: "+ super.erakutsiDatuak();
    }
}
