package kodlamaio.northwind.api.Controllers;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  //Http request
@RequestMapping("/api/products")
public class ProductsController {

    private ProductService productService;

    //Dep Inj. : A dependency is injected via constructor
    @Autowired  // ProductManager p = new PM(); gets to p
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getall")  //"/api/products/getall"
    /*public List<Product> getAll() {
        // api -> business -> dataaccess
        return this.productService.getAll();
    }*/
    //with Data type
    public DataResult<List<Product>> getAll() {
        return this.productService.getAll();
    }

    //post data
    @PostMapping("/add")
    //@requestbody what is your posted data
    public Result add(@RequestBody Product product) {
        return this.productService.add(product);
    }
}
