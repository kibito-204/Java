package abc;
import java.util.*;
public class Mapexp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> m = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            int score = sc.nextInt();
            sc.nextLine();
            m.put(name,score);
        }
        for(Map.Entry<String,Integer> a : m.entrySet()){
            System.out.println(a.getKey() + " - " + a.getValue());
        }
    }
}

