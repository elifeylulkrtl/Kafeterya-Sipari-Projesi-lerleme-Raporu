
import java.util.ArrayList;

public class KafeteryaYoneticisi
{
    private int yoneticiNo;
    private String ad;
    private String soyad;
    private String yetki;
    private String eposta;

    private ArrayList<Urun> urunler;
    private ArrayList<Siparis> siparisler;

    public KafeteryaYoneticisi(int yoneticiNo, String ad,
                               String soyad, String yetki,
                               String eposta)
    {
        this.yoneticiNo = yoneticiNo;
        this.ad = ad;
        this.soyad = soyad;
        this.yetki = yetki;
        this.eposta = eposta;

        urunler = new ArrayList<Urun>();
        siparisler = new ArrayList<Siparis>();
    }

    public int getYoneticiNo()
    {
        return yoneticiNo;
    }

    public String getAd()
    {
        return ad;
    }

    public String getSoyad()
    {
        return soyad;
    }

    public String getYetki()
    {
        return yetki;
    }

    public String getEposta()
    {
        return eposta;
    }

    public void urunEkle(Urun urun)
    {
        if (urun != null)
        {
            urunler.add(urun);
            System.out.println("Urun listeye eklendi.");
        }
    }

    public void urunleriListele()
    {
        System.out.println("Kafeterya Urun Listesi:");

        if (urunler.isEmpty())
        {
            System.out.println("Listede urun bulunmuyor.");
        }
        else
        {
            for (Urun urun : urunler)
            {
                urun.urunBilgisiGoster();
                System.out.println("-------------------");
            }
        }
    }

    public void siparisEkle(Siparis siparis)
    {
        if (siparis != null)
        {
            siparisler.add(siparis);
            System.out.println("Siparis kaydedildi.");
        }
    }

    public void siparisRaporuOlustur()
    {
        System.out.println("KAFETERYA SIPARIS RAPORU");
        System.out.println("Yonetici: " + ad + " " + soyad);
        System.out.println("Toplam siparis sayisi: " + siparisler.size());

        if (siparisler.isEmpty())
        {
            System.out.println("Raporlanacak siparis bulunmuyor.");
        }
        else
        {
            for (int i = 0; i < siparisler.size(); i++)
            {
                System.out.println("Siparis kaydi " + (i + 1)
                                   + ": " + siparisler.get(i));
            }
        }
    }

    public void yoneticiBilgisiGoster()
    {
        System.out.println("Yonetici No: " + yoneticiNo);
        System.out.println("Ad Soyad: " + ad + " " + soyad);
        System.out.println("Yetki: " + yetki);
        System.out.println("E-posta: " + eposta);
    }
}