import java.util.ArrayList;

public class Collection extends Personel {
    public static void main(String[] args) {
        System.out.println("collectionslari ogreniyoruz");
Personel p = new Personel();
p.setIsim("Ali");
p.setIdNum(12345);

Personel p1 = new Personel ();

        p1.setIsim("Mehmet");
        p1.setIdNum(54321);

        Ogrenci ogr = new Ogrenci();
        ogr.setName("Ekrem");
        ogr.setDers("JAva");


        ArrayList<Personel> ilkList = new ArrayList<>();

        ilkList.add(p);
        ilkList.add(p1);


    }
}
