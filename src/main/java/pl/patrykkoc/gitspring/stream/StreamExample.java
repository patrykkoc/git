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


         
        colors.stream().filter(s -> {
            boolean tru = s.length()>=4;
            Log.info("testing object [{}] - passed ? [{}]",s,tru);
            return tru; })
                .map(s -> {
                    Log.info("mapping object [{}]",s);
                    return s.length();
                })

                .collect(Collectors.toList())
        .forEach(integer -> System.out.println("number [" + integer + "]"));



    }


}
