package pl.patrykkoc.gitspring.lambda;

public interface Calculations {

     default int calc(int q,int b){return 1;};

   String person(String imie,String nazwisko,int wiek);
}
