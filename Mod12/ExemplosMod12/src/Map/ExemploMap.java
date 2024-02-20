package Map;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

    public static void main(String[] args) {
        

        Map<String, String> map = new HashMap<>();

        map.put("user", "maria");
        map.put("phone", "41544564656");

        for (String key : map.keySet()) {
            System.out.println("Chave= " + key + ", valor = " + map.get(key));
        }

        System.out.println(map.get("user"));
    }

}