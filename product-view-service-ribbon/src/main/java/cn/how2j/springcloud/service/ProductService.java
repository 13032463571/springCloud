package cn.how2j.springcloud.service;

import cn.how2j.springcloud.client.ProductClientRibbon;
import cn.how2j.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductClientRibbon ribbon;

    public List<Product> listProducts() {
        List<Product> ps = ribbon.listProdcuts();
        return ps;
    }
}
