import Business.Abstratcs.ProductService;
import Business.Concretes.ProductManager;
import Core.JLoggerManagerAdapter;
import DataAccess.Concretes.AbcProductDao;
import Entities.Concretes.Product;

public class Main {

    public static void main(String[] args) {

        // ToDO : Spring IoC solution
        //ProductService productService = new ProductManager(new HibernateProductDao());
        ProductService productService2 = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());

        Product  product = new Product(1,1,"X", 12, 50);
        Product  product2 = new Product(3,2,"X", 12, 50);
        //productService.add(product);
        //productService.add(product2);
        //If changed  data access type to abc from hibernate.
        productService2.add(product2);

    }
}
