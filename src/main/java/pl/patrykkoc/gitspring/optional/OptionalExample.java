package pl.patrykkoc.gitspring.optional;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        // start sposób - bez Lambdy
         Optional<String> maybeNick = findNick();
         if(maybeNick.isPresent())
             System.out.println(maybeNick.get());

        // nowy sposób
        maybeNick.ifPresent(
                nick -> System.out.println("Mam nicka" + nick)
        );
    }


    private static Optional<String> findNick(){
        Optional<String> maybeNick = Optional.of("A");
     //   return Optional.empty();
        System.out.println("searching for nick..");
return maybeNick;

    }
}
