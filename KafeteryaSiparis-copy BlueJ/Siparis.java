
import java.util.ArrayList;

public class Siparis
{
    private int siparisNo;
    private String siparisTarihi;
    private String siparisDurumu;
    private double toplamTutar;
    private ArrayList<Urun> urunler;
    private Odeme odeme;

    public Siparis(int siparisNo, String siparisTarihi)
    {
        this.siparisNo = siparisNo;
        this.siparisTarihi = siparisTarihi;
        this.siparisDurumu = "Olusturuldu";
        this.toplamTutar = 0.0;
        urunler = new ArrayList<Urun>();
        odeme = null;
    }

    public int getSiparisNo()
    {
        return siparisNo;
    }

    public String getSiparisTarihi()
    {
        return siparisTarihi;
    }

    public String getSiparisDurumu()
    {
        return siparisDurumu;
    }

    public double getToplamTutar()
    {
        return toplamTutar;
    }

    public void urunEkle(Urun urun, double fiyat)
    {
        urunler.add(urun);
        toplamTutar += fiyat;
    }

    public void durumGuncelle(String yeniDurum)
    {
        siparisDurumu = yeniDurum;
    }

    public void siparisBilgisiGoster()
    {
        System.out.println("Siparis No: " + siparisNo);
        System.out.println("Siparis Tarihi: " + siparisTarihi);
        System.out.println("Siparis Durumu: " + siparisDurumu);
        System.out.println("Toplam Tutar: " + toplamTutar + " TL");
        System.out.println("Urun Sayisi: " + urunler.size());
    }
    
    public void odemeAta(Odeme odeme)
{
    this.odeme = odeme;
}

public void odemeBilgisiGoster()
{
    if (odeme != null)
    {
        odeme.odemeBilgisiGoster();
    }
    else
    {
        System.out.println("Bu siparis icin odeme kaydi bulunmuyor.");
    }
}
}
