package pakycz;

public class butelka {
    private double ileLitrow;

    butelka(double ileLitrow)
    {
        this.ileLitrow = ileLitrow;
    }

    double getIleLitrow()
    {
        return ileLitrow;
    }
    void wlej (double ilosc)
    {
        this.ileLitrow += ilosc;
    }
    boolean wylej(double ilosc) {
        if (ilosc < ileLitrow)
            this.ileLitrow -= ilosc;
        else
            return false;

        return true;
    }
    void przelej(double ilosc, butelka gdziePrzelac)
    {
        if (this.wylej(ilosc))
        {
            gdziePrzelac.wlej(ilosc);
        }
        else
            System.out.println("Za mało");
    }

    public static void main(String[] args){
        butelka[] Butelka = new butelka[3];

        Butelka[0] = new butelka (5);
        Butelka[1] = new butelka (8);
        Butelka[2] = new butelka (10);

        Butelka[0].wlej(10);

        Butelka[1].przelej(7, Butelka[2]);

        System.out.println(Butelka[0].getIleLitrow());
        System.out.println(Butelka[1].getIleLitrow());
        System.out.println(Butelka[2].getIleLitrow());

    }

}
