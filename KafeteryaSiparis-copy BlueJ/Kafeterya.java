import java.util.ArrayList;

public class Kafeterya
{
    private String kafeteryaAdi;
    private String konum;
    private ArrayList<Urun> urunler;

    public Kafeterya(String kafeteryaAdi, String konum)
    {
        this.kafeteryaAdi = kafeteryaAdi;
        this.konum = konum;
        urunler = new ArrayList<Urun>();
    }

    public String getKafeteryaAdi()
    {
        return kafeteryaAdi;
    }

    public String getKonum()
    {
        return konum;
    }

    public void urunEkle(Urun urun)
    {
        urunler.add(urun);
    }

    public void urunleriListele()
    {
        System.out.println("Kafeterya: " + kafeteryaAdi);
        System.out.println("Konum: " + konum);
        System.out.println("Urun Sayisi: " + urunler.size());

        for (Urun urun : urunler)
        {
            urun.urunBilgisiGoster();
            System.out.println("----------------");
        }
    }
}