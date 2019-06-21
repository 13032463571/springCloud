package cn.how2j.springcloud.client;

import cn.how2j.springcloud.pojo.Product;

import java.util.List;

public class MainHystrixError implements ProductClientFeign {
    @Override
    public List<Product> listProdcuts() {
        return null;
    }
}
