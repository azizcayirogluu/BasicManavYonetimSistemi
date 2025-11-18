package manavProject;

public class Main {
    public static void main(String[] args) {

        Urunler elma = new Urunler("Elma", 95);
        Urunler armut = new Urunler("Armut", 95);
        Urunler muz = new Urunler("Muz", 105);
        Urunler brokoli = new Urunler("Brokoli", 75);

        Müsteriler m1 = new Müsteriler("Elif");

        m1.urunEkle(armut);
        m1.urunEkle(armut);
        m1.urunEkle(elma);
        m1.urunEkle(muz);
        

        m1.sepetiGoster();
        m1.ödenecekTutar();
        
    }
}
