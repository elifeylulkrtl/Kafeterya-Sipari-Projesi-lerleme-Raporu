
public class Urun
{
    private int urunNo;
    private String urunAdi;
    private String kategori;
    private String fiyat;
    private int stok;
    private boolean stokDurumu;
    private String tarih;

    public Urun(int urunNo, String urunAdi, String kategori,
                String fiyat, int stok, String tarih)
    {
        this.urunNo = urunNo;
        this.urunAdi = urunAdi;
        this.kategori = kategori;
        this.fiyat = fiyat;
        this.stok = stok;
        this.tarih = tarih;
        this.stokDurumu = stok > 0;
    }

    public int getUrunNo()
    {
        return urunNo;
    }

    public String getUrunAdi()
    {
        return urunAdi;
    }

    public String getKategori()
    {
        return kategori;
    }

    public String getFiyat()
    {
        return fiyat;
    }

    public int getStok()
    {
        return stok;
    }

    public boolean isStokDurumu()
    {
        return stokDurumu;
    }

    public String getTarih()
    {
        return tarih;
    }

    public void stokGuncelle(int yeniStok)
    {
        if (yeniStok >= 0)
        {
            stok = yeniStok;
            stokDurumu = stok > 0;
        }
    }

    public void fiyatGuncelle(String yeniFiyat)
    {
        {
            fiyat = yeniFiyat;
        }
    }

    public void urunBilgisiGoster()
    {
        System.out.println("Urun No: " + urunNo);
        System.out.println("Urun Adi: " + urunAdi);
        System.out.println("Kategori: " + kategori);
        System.out.println("Fiyat: " + fiyat + " TL");
        System.out.println("Stok: " + stok);
        System.out.println("Stok Durumu: " + (stokDurumu ? "Mevcut" : "Tukendi"));
        System.out.println("Tarih: " + tarih);
    }
}
