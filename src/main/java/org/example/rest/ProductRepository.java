package org.example.rest;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository {

    private static Map<String,Product> map = new HashMap<String,Product>();
    public ProductRepository(){
        map.put("6b6353b7", new Product("6b6353b7", "Medium Roast", "Medium roasted for consistent flavor"));
        map.put("75c54784", new Product("75c54784", "Dark Roast", "Dark roast for full-body flavor"));
        map.put("1064a8b3", new Product("1064a8b3", "Light Roast", "Light roasted Arabica beans"));
    }
    public  Product getProductById(String id){
        return map.get(id);
    }
    public  Map<String,Product> findAllProduct(){
        return map;
    }
}
