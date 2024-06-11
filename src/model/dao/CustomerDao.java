package model.dao;
import model.enitity.Customer;
import java.util.List;

public interface CustomerDao {
    List<Customer> queryAllCustomers();
    int deleteCustomerById(int id);
    int updateCustomer(int id);
    int addNewCustomer(Customer customer);
}