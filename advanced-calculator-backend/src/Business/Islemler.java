package Business;

import java.util.Scanner;


import static java.lang.Math.cos;
import static java.lang.Math.toRadians;

public class Islemler {
    public static double toplama(double a, double b) {
        return a + b;
    }

    public static double cikarma(double a, double b) {
        return a - b;
    }

    public static double carpma(double a, double b) {
        return a * b;
    }

    public static double bolme(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Sıfıra bölme hatası");
        }
        return a / b;
    }

    public static double modalma(double a, double b) {
        return a % b;
    }

    public static double karesinialma(double a, double b) {

        return Math.pow(a, 2);
    }
    public static double kupunualma(double a, double b) {
        return Math.pow(a, 3);
    }
    public static double ussunualma(double a, double b) {
        return Math.pow(a, b);
    }
    public static double ikinciderecedenkokalma(double a, double b) {
        return Math.pow(a, 1/2);

    }
    public static double ucuncuderecedenkokalma(double a, double b) {
        return Math.pow(a, 1/3);
    }

    public static double karekokunualma(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Karekök derecesi sıfır olamaz.");
        }
        if (a < 0 && b % 2 == 0) {
            throw new ArithmeticException("Negatif sayıların çift dereceli kökü yok");
        }
        return Math.pow(a, 1 / b);
    }

    public static double cosinus(double a, double b) {
        Double radyan= Math.toRadians(a);
        return Math.cos(radyan);

    }
    public static double sinus(double a, double b) {
        return Math.sin(Math.toRadians(a));
    }
    public static double sinh(double a, double b) {
        return (Math.exp(a) - Math.exp(-a)) / 2;
    }
    public static double cosh(double a, double b) {
        return (Math.exp(a) + Math.exp(-a)) / 2;
    }
    public static double tanjant(double a, double b) {

        return Math.tan(Math.toRadians(a));
    }

    public static double radyan(double a, double b) {
        return Math.toRadians(a);

    }
    public static double faktoriyel(double a,double b) {
        Double sonuc=1.0;
        if (a == 0 || a==1) {
             sonuc= 1.0;
        } else {
            for (int i = 1; i <= a; i++) {

                sonuc=sonuc*i;
            }
        }
        return sonuc;
    }
    public static double logaritma(double a, double b) {
        double loge=Math.log(a);// e tabanına göre
        return loge;
    }
    public static double logon(double a, double b) {
        double logonn=Math.log10(a);//10 tabanına göre
        return logonn;
    }
    public static double tanh(double a, double b) {
        return Math.tanh(a);
    }
    // e üzeri x
    public static double exp(double a, double b) {
        return Math.exp(a);
    }

    // 10 üzeri x
    public static double pow10(double a, double b) {
        return Math.pow(10, a);
    }

    // 1/x
    public static double carpmayagoretersi(double a, double b) {
        if (a == 0) {
            throw new ArithmeticException("0' a bölme hatası");
        }
        return 1 / a;
    }
    public static double pozitifnegatif(double a, double b) {
        return -a;
    }
    public static double e() {
        return Math.E;
    }
    public static double pi() {
        return Math.PI;
    }
    public static double rand() {
        return Math.random();
    }
    // Bilimsel gösterimdeki üs hesaplamaları
    public static double ee(double a, double b) {
        return Math.pow(a, b);
    }

    }


