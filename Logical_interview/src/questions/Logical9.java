package questions;

import java.util.HashMap;
import java.util.Map;

public class Logical9 {

    public static void main(String[] args) {

        int arr[] = {10,20,10,37,56,15,16,15,22,42,22,10,7,9,7,7};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (map.containsKey(arr[i])) {
                count = map.get(arr[i]) + 1;
                map.put(arr[i], count);
            } else {
                map.put(arr[i], count);
            }
        }
        
        System.out.println(map);
        System.out.println("************************");

        System.out.println("Repeated elements are:");

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey()+"="+entry.getValue());
            }
        }
        
        
        System.out.println("************************");
        
        
        System.out.println(" non Repeated elements are:");

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() <= 1) {
                System.out.println(entry.getKey()+"="+entry.getValue());
            }
        }
    }
}
