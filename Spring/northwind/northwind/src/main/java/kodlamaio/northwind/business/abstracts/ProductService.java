package kodlamaio.northwind.business.abstracts;


import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    //List<Product> getAll();

    // success or failed return type
    DataResult<List<Product>> getAll();
    Result add(Product product);
}
