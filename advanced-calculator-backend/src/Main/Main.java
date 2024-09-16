package Main;

import Business.IslemSec;
import Data.DatabaseHelper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String islemcesit;
        Double sonuc = null;

        while (true) {
            String a = input.nextLine();

            if (a.equalsIgnoreCase("exit")) {
                break;
            }

            if (a.contains(",")) {
                a = a.replaceAll(",", ".");
            }

            while (true) {
                DatabaseHelper gecmiss = new DatabaseHelper();

                Double aa = 0.0;
                if (a.equals("clean")) {
                    sonuc = null;
                    break;
                }
                if (a.equals("gecmis")) {

                    gecmiss.printResults();
                    sonuc = null;


                } else {
                    aa = Double.valueOf(a);
                }

                islemcesit = input.nextLine();

                if (islemcesit.equals("gecmis")) {
                    gecmiss.printResults();

                }


                if (islemcesit.equalsIgnoreCase("clean")) {

                    sonuc = null;
                    break;
                }


                if (islemcesit.equalsIgnoreCase("exit")) {
                    return;
                }


                double bb = 0;
                String b = null;
                if (!islemcesit.equalsIgnoreCase(null) && !islemcesit.equalsIgnoreCase("cos") && !islemcesit.equalsIgnoreCase("sin") &&
                        !islemcesit.equalsIgnoreCase("tan") && !islemcesit.equalsIgnoreCase("cot") && !islemcesit.equalsIgnoreCase("radyan") &&
                        !islemcesit.equalsIgnoreCase("faktoriyel")) {
                    b = input.nextLine();


                    if (b.equals("gecmis") || a.equals("gecmis") || islemcesit.equals("gecmis")) {
                        {
                            sonuc = null;
                            if (!a.equals("clean") || !b.equals("clean") || !islemcesit.equals("clean")) {
                                System.out.println("önce clean yazınız");
                                break;

                            }

                        }
                    }

                    if (b.equalsIgnoreCase("clean")) {
                        sonuc = null;
                        break;
                    }

                    if (b.equalsIgnoreCase("exit")) {

                        return;
                    }
                    if (b.contains(",")) {
                        b = b.replaceAll(",", ".");
                    }
                    if (b.equals("gecmis")) {
                        gecmiss.printResults();
                    }
                    else {
                        bb = Double.valueOf(b);
                    }
                }
                IslemSec sec = new IslemSec();
                if (sonuc == null) {
                    sonuc = sec.islemcesidi(aa, islemcesit, bb);
                } else {
                    sonuc = sec.islemcesidi(sonuc, islemcesit, bb);
                }

                if (!(sonuc == null) && !islemcesit.equals("gecmis") && !a.equals("gecmis") && !b.equals("gecmis")) {
                    DatabaseHelper.saveResult(islemcesit, aa, bb, sonuc);
                    System.out.println(sonuc);
                }
                aa = sonuc;
            }
        }
    }
}