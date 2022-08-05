import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListOfCharacters {

           public static void main(String[] args) {
            List<String> names = new ArrayList<String>(Arrays.asList("Amir", "Hatef", "MEhran"
                    , "Mojtaba", "Mohammaad", "Ali", "Davood", "Reza", "Mohsen"));
            System.out.println("******* first part of challenge *******");

            Map<Integer, List<String>> hashMapNames = names.stream()
                    .collect(Collectors.groupingBy
                            (String::length));
            System.out.println(hashMapNames);
            System.out.println("******* second part of challenge  *******");

            hashMapNames.entrySet()
                    .forEach(e -> System.out.println(e.getValue()
                            + " -> " + e.getValue().size()));
        }
    }


