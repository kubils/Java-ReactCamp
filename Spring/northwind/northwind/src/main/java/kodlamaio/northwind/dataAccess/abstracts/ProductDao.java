package kodlamaio.northwind.dataAccess.abstracts;

import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//CRUD  db: JPA repository
//<Column, id-type>
public interface ProductDao extends JpaRepository<Product, Integer> {

    //In product there is not category_id  : give Category only
    // mistake : give id to category  in product

    Product getByProductName(String productName);

    Product getByProductNameAndCategory_categoryId(String productName, int categoryId);

    List<Product> getByProductNameOrCategory_categoryId(String productName, int categoryId);

    List<Product> getByCategory_categoryIdIn(List<Integer> categories);  //where category_id in(1,2,3)

    List<Product> getByProductNameContains(String productName);

    List<Product> getByProductNameStartsWith(String productName);

    @Query("From Product where productName=:productName and category.categoryId=:categoryId")
    List<Product> getByNameAndCategory_categoryId(String productName, int categoryId); //=:productName and =:categoryId

    //d9  dto
    //select p.productId, p.productName, c.categoryName from products p inner join customer c  on c.categoryId = p.categoryId
    @Query("Select new kodlamaio.northwind.entities.dtos.ProductWithCategoryDto"
            + "(p.id, p.productName, c.categoryName)"
            + "from  Category c Inner Join c.products p")
    List<ProductWithCategoryDto> getProductWithCategoryDetails();

}
