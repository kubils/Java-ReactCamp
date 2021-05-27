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


    //Request param = productName
    @GetMapping("/getByProductName")
    public DataResult<Product> getByProductName(@RequestParam String productName) {
        return this.productService.getByProductName(productName);
    }
    @GetMapping("/getByProductNameAndCategoryId")
    public DataResult<Product> getByProductNameAndCategoryId(@RequestParam("productName") String productName, @RequestParam("categoryId") int categoryId) {
        return this.productService.getByProductNameAndCategoryId(productName, categoryId);
    }

    @GetMapping("/getByProductNameOrCategoryId")
    public DataResult<List<Product>> getByProductNameOrCategoryId(@RequestParam String productName, @RequestParam int categoryId) {
        return this.productService.getByProductNameOrCategoryId(productName, categoryId);
    }

    @GetMapping("/getByCategoryIdIn")
    public DataResult<List<Product>> getByCategoryIdIn(@RequestParam List<Integer> categories) {
        return this.productService.getByCategoryIdIn(categories);
    }

    @GetMapping("/getByProductNameContains")
    public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName) {
        return this.productService.getByProductNameContains(productName);
    }

    @GetMapping("/getByProductNameStartsWith")
    public DataResult<List<Product>> getByProductNameStartsWith(@RequestParam String productName) {
        return this.productService.getByProductNameStartsWith(productName);
    }

    //paging
    @GetMapping("/getAllByPage")
    public  DataResult<List<Product>> getAll(int pageNo, int pageSize) {
        return this.productService.getAll(pageNo, pageSize);
    }

    //sort
    @GetMapping("/gettAllDesc")
    public DataResult<List<Product>> getAllSorted() {
        return this.productService.getAllSorted();
    }
}
