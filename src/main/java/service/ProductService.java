package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> products = new ArrayList<>();

    // Constructor: Tạo dữ liệu giả khi khởi động
    public ProductService() {
        products.add(new Product(1, "Laptop Dell", 1500.0));
        products.add(new Product(2, "iPhone 15", 1200.0));
        products.add(new Product(3, "Chuột Logitech", 25.0));
    }

    // 1. Lấy tất cả danh sách
    public List<Product> getAllProducts() {
        return products;
    }
}





