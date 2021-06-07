package Abstract;


import Entity.Customer;

public interface CustomerService {

    //all clients have this operation
    void  save(Customer customer) throws Exception;

}
