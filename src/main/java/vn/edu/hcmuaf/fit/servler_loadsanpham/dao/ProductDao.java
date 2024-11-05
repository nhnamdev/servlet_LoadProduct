package vn.edu.hcmuaf.fit.servler_loadsanpham.dao;

import vn.edu.hcmuaf.fit.servler_loadsanpham.dao.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDao {
    static Map<Integer, Product> data = new HashMap<>();
    static {
        data.put(1, new Product(1, "Áo Thun Nam", "500.000VNĐ", "https://product.hstatic.net/1000402464/product/ss24ts08tw_blue___2__b616367ce5df47eb898bd0e94f58d378_large.jpg"));
        data.put(2, new Product(2, "Áo Khoác Nam", "1.200.000VNĐ", "https://product.hstatic.net/1000402464/product/ss24ss02tw_green___2__2a582dfdb4d6477792e17fd413c1d6ad_large.jpg"));
        data.put(3, new Product(3, "Quần Jean Nam", "800.000VNĐ", "https://product.hstatic.net/1000402464/product/ss24ts02tw_blue___2__9ae1eb77fe1a415aad5dc271bb1ee9a8_large.jpg"));
        data.put(4, new Product(4, "Giày Thể Thao Nam", "1.500.000VNĐ", "https://product.hstatic.net/1000402464/product/ss24ts06tw___3__bbc18be26201491fa9ca20df9f2b8cc3_large.jpg"));
        data.put(5, new Product(5, "Túi Xách Nam", "900.000VNĐ", "https://file.hstatic.net/1000402464/file/banner_vuong_5.jpg"));

    }
    public List<Product> getAll(){
        return new ArrayList<>(data.values());
    }
}
