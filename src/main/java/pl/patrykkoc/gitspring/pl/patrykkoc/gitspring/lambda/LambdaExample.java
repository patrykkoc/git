package pl.patrykkoc.gitspring.pl.patrykkoc.gitspring.lambda;



public class LambdaExample {

    public static void main(String[] args) {

        //dodawanie
      //  System.out.println(performCalculations(1, 2, (a, b) -> a+b));
        //mnożenie
    //    System.out.println(performCalculations(1,2,(a,b) -> a*b));
       // System.out.println(writePerson("Patryk","Koc",11,(a,b,c) -> a+":"+b+" - wiek"+c));
    }
//
    private static int performCalculations(int first,
                                            int second,
                                            Calculations calculations){
        return calculations.calc(first,second);
    }
    private static String writePerson(String imie, String nazwisko, int wiek, Calculations calculations){
        return calculations.person(imie,nazwisko,wiek);
    }
}
