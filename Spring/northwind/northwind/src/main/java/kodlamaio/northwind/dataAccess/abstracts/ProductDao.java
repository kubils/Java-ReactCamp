package kodlamaio.northwind.dataAccess.abstracts;

import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//CRUD  db: JPA repository
//<Column, id-type>
public interface ProductDao extends JpaRepository<Product, Integer> {
}
