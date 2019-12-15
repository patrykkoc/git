package pl.patrykkoc.gitspring;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Optional;

@Data
@AllArgsConstructor
public class Adress {

    private String city;
    private String street;

    Optional<String> getCity(){
        return Optional.ofNullable(city);
    }
    Optional<String> getStreet(){
        return Optional.ofNullable(street);
    }

}
