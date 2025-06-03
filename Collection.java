import java.util.*;
public class Collection {
    public static void main(String[] args) {
        // 1. List - ArrayList (danh sách có thứ tự, cho phép trùng)
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");  // trùng được
        System.out.println("ArrayList: " + list);

        // 2. Set - HashSet (tập hợp không thứ tự, không trùng)
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");  // không thêm được vì trùng
        System.out.println("HashSet: " + set);

        // 3. Map - HashMap (key-value, key không trùng)
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(1, "Uno");  // ghi đè value với key = 1
        System.out.println("HashMap: " + map);

        // Duyệt ArrayList
        System.out.println("Duyệt ArrayList:");
        for (String lang : list) {
            System.out.println(lang);
        }
    }
}
