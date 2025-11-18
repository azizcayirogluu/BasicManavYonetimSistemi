package manavProject;

import java.util.ArrayList;

public class Müsteriler {

    public String MüsteriAdı;
    ArrayList<Urunler> Sepet = new ArrayList<>();

    public Müsteriler(String MüsteriAd) {
        this.MüsteriAdı = MüsteriAd;
    }

    public void urunEkle(Urunler u) {
        Sepet.add(u);
        System.out.println(u.urunAdi + " adlı ürün sepetinize başarıyla eklenmiştir.");
    }
    
    public void urunCikar(String urunAdi)
    {
        for (Urunler u : Sepet) {
            if (u.urunAdi.equalsIgnoreCase(urunAdi)) {
                Sepet.remove(u);
                System.out.println(urunAdi + " sepetten çıkarıldı.");
                return;
            }
        }

        System.out.println("Bu isimde ürün sepette bulunamadı.");
    }

    public void sepetiGoster() {
        System.out.println("---Sepetinizdeki Ürünler---");
        for (Urunler u : Sepet) {
            System.out.println(u.urunAdi + " = " + u.urunFiyatı + " TL");
        }
    }

    public void ödenecekTutar() {
        double toplam = 0;

        for (Urunler u : Sepet) {
            toplam += u.urunFiyatı;
        }

        System.out.println("Toplam borcunuz: " + toplam + " TL");
    }
}
