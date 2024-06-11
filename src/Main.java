import model.dao.CustomerDaoImpl;
import model.enitity.Customer;
//import model.entity.Customer;

import java.sql.Date;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        new CustomerDaoImpl()
                .addNewCustomer(new Customer(
                        1,
                        "Pon Channarith",
                        "Pon Channarith123@gmail.com",
                        "!@#$%^&**&^%$#@!",
                        false,
                        Date.valueOf(LocalDate.now())
                ));
    }
}