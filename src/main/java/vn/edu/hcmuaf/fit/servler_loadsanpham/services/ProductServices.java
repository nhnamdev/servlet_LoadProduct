package vn.edu.hcmuaf.fit.servler_loadsanpham.services;

import vn.edu.hcmuaf.fit.servler_loadsanpham.dao.ProductDao;
import vn.edu.hcmuaf.fit.servler_loadsanpham.dao.model.Product;

import java.util.List;

public class ProductServices {
    public List<Product> getAll(){
        ProductDao productDao = new ProductDao();
        return productDao.getAll();
    }


}
