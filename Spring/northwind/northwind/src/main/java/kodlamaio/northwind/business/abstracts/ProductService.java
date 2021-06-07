package kodlamaio.northwind.business.abstracts;


import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

import java.util.List;

public interface ProductService {
    //List<Product> getAll();

    // success or failed return type
    DataResult<List<Product>> getAll();
    Result add(Product product);

    DataResult<Product> getByProductName(String productName);

    DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);

    DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);

    DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);  //where category_id in(1,2,3)

    DataResult<List<Product>> getByProductNameContains(String productName);

    DataResult<List<Product>> getByProductNameStartsWith(String productName);

    DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId); //=:productName and =:categoryId


    //Paging
    DataResult<List<Product>> getAll(int pageNo, int pageSize);

    //sorted data
    DataResult<List<Product>> getAllSorted();

    DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();

}
