package org.example.rest;

import java.util.Map;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;
import com.opensymphony.xwork2.ModelDriven;

public class ProductController implements ModelDriven<Object> {
    private static final long serialVersionUID = 1L;
    private String id;
    private Object model;
    private ProductRepository productRepository = new ProductRepository();
    private static Map<String,Product> map;
    {
        map = productRepository.findAllProduct();
    }
    public HttpHeaders index() {
        model = map;
        return new DefaultHttpHeaders("index").disableCaching();
    }
    public String add(){
        String prodId = id;
        Product product = new Product(id,"Sample", "New coffee sample");
        model = product;
        return "SUCCESS";
    }
    public String show(){
        String prodId = id;
        Product product = new Product(id,"Sample", "New coffee sample"); // productRepository.getProductById(id);
        model = product;
        return "SUCCESS";
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        model = productRepository.getProductById(id);
        this.id = id;
    }
    @Override
    public Object getModel() {
        return model;
    }
}