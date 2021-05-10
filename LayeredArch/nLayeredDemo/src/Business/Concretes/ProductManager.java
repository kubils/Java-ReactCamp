package Business.Concretes;

import Business.Abstratcs.ProductService;
import Core.LoggerService;
import DataAccess.Abstracts.ProductDao;
import Entities.Concretes.Product;


import java.util.List;

public class ProductManager implements ProductService {

    //Dependency injection
    private  ProductDao productDao;
    /*
    * public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }*/

    //adapter inj.
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {
        if (product.getCategoryId() == 1) {
            System.out.println("This category doesn't accept product");
            return; // stop the rest of method
        }
        this.productDao.add(product); // don't any dependency with hibernate in Business
        this.loggerService.logToSystem("Product added : "+ product.getName());
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
