package service;

import model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1, "Laptop Dell", 1500.0));
        products.add(new Product(2, "iPhone 15", 1200.0));
        products.add(new Product(3, "Chuột Logitech", 25.0));
    }

    public List<Product> findAll() {
        return products;
    }

    public Product addProduct (Product product){
        products.add(product);
        return  product;
    }

    // 3. Cập nhật
    public Product updateProduct(int id, Product newInfo) {
        for (Product p : products) {
            if (p.getId() == id) {
                p.setName(newInfo.getName());
                p.setPrice(newInfo.getPrice());
                return p;
            }
        }
        return null;
    }

    // 4. Xóa
    public boolean deleteProduct(int id) {
        // removeIf trả về true nếu xóa được phần tử
        return products.removeIf(p -> p.getId() == id);
    }
}
