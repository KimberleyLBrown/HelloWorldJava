package dev.kimberleybrown;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] names )
    {
        Arrays.sort(names);
        List<String> listNames = Arrays.stream(names).sequential().map(name -> "'" + name + "'").collect(Collectors.toList());
        for (String name : listNames) {
            System.out.println("Hello " + name);
        }
    }
}
