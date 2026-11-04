public class Odeme
{
    private int odemeNo;
    private double odemeTutari;
    private String odemeTarihi;
    private boolean odemeDurumu;

    public Odeme(int odemeNo, double odemeTutari, String odemeTarihi)
    {
        this.odemeNo = odemeNo;
        this.odemeTutari = odemeTutari;
        this.odemeTarihi = odemeTarihi;
        this.odemeDurumu = false;
    }

    public int getOdemeNo()
    {
        return odemeNo;
    }

    public double getOdemeTutari()
    {
        return odemeTutari;
    }

    public String getOdemeTarihi()
    {
        return odemeTarihi;
    }

    public boolean isOdemeDurumu()
    {
        return odemeDurumu;
    }

    public void odemeYap()
    {
        if (odemeTutari > 0)
        {
            odemeDurumu = true;
            System.out.println("Odeme basariyla gerceklestirildi.");
            System.out.println("Odenen tutar: " + odemeTutari + " TL");
        }
        else
        {
            System.out.println("Odeme tutari gecerli degil.");
        }
    }

    public void odemeBilgisiGoster()
    {
        System.out.println("Odeme No: " + odemeNo);
        System.out.println("Odeme Tutari: " + odemeTutari + " TL");
        System.out.println("Odeme Tarihi: " + odemeTarihi);

        if (odemeDurumu)
        {
            System.out.println("Odeme Durumu: Odendi");
        }
        else
        {
            System.out.println("Odeme Durumu: Bekleniyor");
        }
    }
}