package kodlamaio.northwind.business.concretes;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    //can be reach ProductDao interface with redundant field  productDao;
    private ProductDao productDao;

    //Dep Inj. : A dependency is injected via constructor
    @Autowired  //Interfaces can't be new : Autowired  gives implemented class object
    // productDao spring definition  : PD d = new PD ...
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    //     public List<Product> getAll() {
    //        return this.productDao.findAll();
    //    }
    public DataResult<List<Product>> getAll() {

        return new SuccessDataResult<List<Product>>(this.productDao.findAll(), "Data listed");
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        //both can be useful
        //with data operation result
        // return new SuccessDataResult(product,"Product added");

        //without data operation result
        return new SuccessResult("Product added");
    }
}
