package pl.patrykkoc.gitspring.lambda;



public class LambdaExample {

    public static void main(String[] args) {

         System.out.println(writePerson("Patryk","Koc",11,(a,b,c) -> a+":"+b+" - wiek"+c));
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
