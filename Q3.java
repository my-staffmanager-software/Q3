package upperlink;

import java.util.HashMap;
import java.util.Map;

public class Q3 {

    //Time complexity = O(n0, Space O(n)
    private static String duplicate(String input){

        String[] content = input.split("");
        HashMap<String,Integer> m = new HashMap<>();

        for(String s : content){

            if( m.containsKey(s) ){
                int val = m.get(s);
                m.put(s, val+1);
            }else
                m.put(s,1);
        }

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String,Integer> k : m.entrySet()) {
            sb.append(k.getKey()+" ---> "+k.getValue());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(duplicate("JAVA"));
        System.out.println(duplicate("UPPERLINKERI"));
    }

}
