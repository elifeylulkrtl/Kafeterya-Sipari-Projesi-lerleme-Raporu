
import java.util.ArrayList;

public class Kullanici
{
    private int kullaniciNo;
    private String adSoyad;
    private String kullaniciTuru;
    private ArrayList<Siparis> siparisler;

    public Kullanici(int kullaniciNo, String adSoyad,
                     String kullaniciTuru)
    {
        this.kullaniciNo = kullaniciNo;
        this.adSoyad = adSoyad;
        this.kullaniciTuru = kullaniciTuru;
        siparisler = new ArrayList<Siparis>();
    }

    public int getKullaniciNo()
    {
        return kullaniciNo;
    }

    public String getAdSoyad()
    {
        return adSoyad;
    }

    public String getKullaniciTuru()
    {
        return kullaniciTuru;
    }

    public void siparisEkle(Siparis siparis)
    {
        siparisler.add(siparis);
    }

    public void siparisleriListele()
    {
        System.out.println("Kullanici: " + adSoyad);
        System.out.println("Siparis Sayisi: " + siparisler.size());
    }

    public void kullaniciBilgisiGoster()
    {
        System.out.println("Kullanici No: " + kullaniciNo);
        System.out.println("Ad Soyad: " + adSoyad);
        System.out.println("Kullanici Turu: " + kullaniciTuru);
    }
}
