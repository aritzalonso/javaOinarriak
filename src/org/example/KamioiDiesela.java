package org.example;

public class KamioiDiesela extends Ibilgailua implements ErregaiaErabiltzenDena{
    public KamioiDiesela(String marka, String modeloa, int urtea){
    super (marka, modeloa, urtea);
}
    @Override
    public void mugitu(){
        System.out.println("kamioi diesela mugitzen ari da.");
    }

    @Override
    public void hornitu(){
        System.out.println("kamoiDiesela hornitzen ari da.");
    }
}
