package controller;

import model.Product;
import service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.findAll();
    }
    // POST: Thêm mới
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }
    // PUT: Cập nhật theo ID
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    // DELETE: Xóa theo ID
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        boolean isDeleted = productService.deleteProduct(id);
        if (isDeleted) {
            return "Xóa thành công sản phẩm ID: " + id;
        } else {
            return "Không tìm thấy sản phẩm để xóa";
        }
    }

}
