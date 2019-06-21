package cn.how2j.springcloud.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import cn.how2j.springcloud.pojo.Product;

import java.util.List;

@Component
public class ProductClientRibbon {

    @Autowired private RestTemplate restTemplate;
    public List<Product> listProdcuts() {
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products",List.class);
    }
}
