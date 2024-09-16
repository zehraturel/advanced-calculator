package Business;

public class IslemSec {


    public Double islemcesidi(double a, String islemcesit, double b) {
        if (islemcesit.equals("+")) {
            double toplam = 0;
            toplam = Islemler.toplama(a, b);
            return toplam;
        }
        else if (islemcesit.equals("-")) {
            double cikarma = 0;
            cikarma = Islemler.cikarma(a, b);
            return cikarma;
        }
        else if (islemcesit.equals("*")) {
            double carpma = 0;
            carpma = Islemler.carpma(a, b);
            return carpma;
        }
        else if (islemcesit.equals("/")) {
            try {
                return Islemler.bolme(a, b);
            } catch (ArithmeticException e) {
                System.out.println("Hata: " + e.getMessage());
                return null;
            }
        }
        else if (islemcesit.equals("%")) {
           double mod = Islemler.modalma(a, b);
        }
        else if (islemcesit.equals("^")) {
            double karesial = 0;
            karesial = Islemler.karesinialma(a, b);
            return karesial;
        }
        else if (islemcesit.equals("karekok")) {
            try {
                return Islemler.karekokunualma(a, b);
            } catch (ArithmeticException e) {
                System.out.println("Hata: " + e.getMessage());
                return null;
            }
        }
        else if (islemcesit.equals("cos")){
            return Islemler.cosinus(a,b);
        }
        else if (islemcesit.equals("sin")) {
            return Islemler.sinus(a,b);
        }
        else if(islemcesit.equals("tan")){
            return Islemler.tanjant(a,b);
        }
        else if(islemcesit.equals("radyan")){
            return Islemler.radyan(a,b);
        }
        else if(islemcesit.equals("faktoriyel")){
            return Islemler.faktoriyel(a,b);
        }
        else if(islemcesit.equals("logaritma")){
            return Islemler.logaritma(a,b);
        }
        else if (islemcesit.equals("sinh")) {
            return Islemler.sinh(a,b);
        }
        else if (islemcesit.equals("cosh")) {
            return Islemler.cosh(a,b);

        } else if (islemcesit.equals("tanh")) {
            return Islemler.tanh(a,b);
        }
        else if (islemcesit.equals("log10")) {
            return Islemler.logon(a,b);
        }
        else if (islemcesit.equals("carpmayagoretersi")) {
            return Islemler.carpmayagoretersi(a,b);
        }
        else if (islemcesit.equals("pow10")) {
            return Islemler.pow10(a,b);
        }
        else if (islemcesit.equals("exp")) {
            return Islemler.exp(a,b);
        }
        else if (islemcesit.equals("kupunualma")) {
            return Islemler.kupunualma(a,b);
        }
        else if (islemcesit.equals("ussunualma")) {
            return Islemler.ussunualma(a,b);
        }
        else if (islemcesit.equals("ikinciderecenkokalma")) {
            return Islemler.ikinciderecedenkokalma(a,b);
        }
        else if (islemcesit.equals("ucuncuderecedenkokalma")) {
            return Islemler.ucuncuderecedenkokalma(a,b);
        }
        else if (islemcesit.equals("pozitifnegatif")) {
            return Islemler.pozitifnegatif(a,b);
        }
        else if (islemcesit.equals("e")) {
            return Islemler.e();
        }
        else if (islemcesit.equals("pi")) {
            return Islemler.pi();
        }
        else if (islemcesit.equals("random")) {
            return Islemler.rand();
        } else if (islemcesit.equals("ee")) {
            return Islemler.ee(a,b);

        }
        return null;
    }
}