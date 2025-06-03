import java.util.*;
import java.util.stream.*;

public class Stream {
    public static void main(String[] args) {
       List<Integer> number = Arrays.asList(1,2,3,4);
       List<Integer> filter1 = number.stream().filter(n -> n%2==0).collect(Collectors.toList());
        System.out.println(filter1);
        List<Integer> doubled = number.stream().map(n -> n+2).collect(Collectors.toList());
        System.out.println(doubled);
        number.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();
        int sum = number.stream().reduce(0,(m,n)->m+n);
        System.out.println(sum);
    }
}
