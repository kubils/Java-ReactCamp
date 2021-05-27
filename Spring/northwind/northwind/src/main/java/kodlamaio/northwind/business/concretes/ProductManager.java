package kodlamaio.northwind.business.concretes;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

    @Override
    public DataResult<Product> getByProductName(String productName) {
        return new SuccessDataResult<Product>
                (this.productDao.getByProductName(productName), "Data listed");

    }

    @Override
    public DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId) {
        return new SuccessDataResult<Product>
                (this.productDao.getByProductNameAndCategory_categoryId(productName, categoryId), "Data listed");
    }

    @Override
    public DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId) {
        return new SuccessDataResult<Product>
                (this.productDao.getByProductNameOrCategory_categoryId(productName, categoryId), "Data listed");
    }

    @Override
    public DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories) {
        return new SuccessDataResult<Product>
                (this.productDao.getByCategory_categoryIdIn(categories), "Data listed");
    }

    @Override
    public DataResult<List<Product>> getByProductNameContains(String productName) {
        return new SuccessDataResult<Product>
                (this.productDao.getByProductNameContains(productName), "Data listed");
    }

    @Override
    public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
        return new SuccessDataResult<Product>
                (this.productDao.getByProductNameStartsWith(productName), "Data listed");
    }

    @Override
    public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
        return new SuccessDataResult<Product>
                (this.productDao.getByNameAndCategory_categoryId(productName, categoryId), "Data listed");
    }


    //paging with jpa
    @Override
    public DataResult<List<Product>> getAll(int pageNo, int pageSize) {

        //pageNo starts from 0 so -1
        Pageable pageable = PageRequest.of(pageNo -1, pageSize);

        return new SuccessDataResult<List<Product>>
                (this.productDao.findAll(pageable).getContent(), "Data listed");
    }

    //sorted data
    @Override
    public DataResult<List<Product>> getAllSorted() {
        Sort sort = Sort.by(Sort.Direction.DESC, "productName");
        return new SuccessDataResult<List<Product>>
                (this.productDao.findAll(sort), "Data listed");
    }
}
