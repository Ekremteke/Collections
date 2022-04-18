import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Collection extends Personel {
    public static void main(String[] args) {
        System.out.println("collectionslari ogreniyoruz");
Personel p = new Personel();
p.setIsim("Ali");
p.setIdNum(12345);

Personel p1 = new Personel ();

        p1.setIsim("Mehmet");
        p1.setIdNum(54321);

        ArrayList<Personel> ilkList = new ArrayList<>();

        ilkList.add(p);
        ilkList.add(p1);

        ArrayList<Ogrenci> ilkList1 = new ArrayList<>();

        Ogrenci ogr = new Ogrenci();
        ogr.setName("Ekrem");
        ogr.setDers("JAva");

        ilkList1.add(ogr);

        LinkedList <Personel> link = new LinkedList<>();
        link.offer(p);
        link.offer(p1);


        LinkedList <Ogrenci> link1 = new LinkedList <>();
        link1.offer(ogr);

        System.out.println(p);
        System.out.println(p1);
        System.out.println(ogr);
        System.out.println(link);
        System.out.println(link1);

Set <String> set1 = new TreeSet<>();
            set1.add("ekrem");
            set1.add("akrem");
            set1.add("ukrem");
            set1.add("okrem");
            set1.add("ikrem");
            System.out.println(set1);
    }
}
