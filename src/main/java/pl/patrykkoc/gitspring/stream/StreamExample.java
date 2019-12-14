package pl.patrykkoc.gitspring.stream;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Slf4j
public class StreamExample {
 //hjk
    private static final Logger Log = LoggerFactory.getLogger(StreamExample.class);

    public static void main(String[] args) {
        List<String> colors = Arrays.asList(
                "white",
                "black",
                "blue",
                "red",
                "pink"
        );

        //exercise:
         
        colors.stream().filter(s -> {
            Log.info("testing object [{}]",s);
            return s.length()>=4; })
                .map(s -> {
                    Log.info("mapping object [{}]",s);
                    return s.length();
                })

                .collect(Collectors.toList())
        .forEach(integer -> System.out.println("number " + integer));



    }


}
