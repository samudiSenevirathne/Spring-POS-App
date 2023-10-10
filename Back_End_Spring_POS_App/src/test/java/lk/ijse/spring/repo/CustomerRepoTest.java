package lk.ijse.spring.repo;

import lk.ijse.spring.config.WebRootConfig;
import lk.ijse.spring.entity.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.transaction.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@WebAppConfiguration
@ContextConfiguration(classes = {WebRootConfig.class})
@ExtendWith({SpringExtension.class})
@Transactional
class CustomerRepoTest {

    @Autowired
    CustomerRepo customerRepo;

    public CustomerRepoTest() {

    }

    @Test
    public void testGetAllItems() {
        List<Customer> all = this.customerRepo.findAll();
        for(Customer customer : all){
            System.out.println(customer.toString());
        }
    }


    @Test
    public void testFindCustomerByAddress(){

//        Customer matara = customerRepo.findCustomerByAddress("MATARA");
//        System.out.println(matara.toString());

//        Customer matara = customerRepo.readCustomerByAddress("akurassa");
//        System.out.println(matara.toString());

//        Customer matara = customerRepo.getCustomerByAddress("akurassa");
//        System.out.println(matara.toString());

//        Customer matara = customerRepo.queryCustomerByAddress("MATARA");
//        System.out.println(matara.toString());

//        Customer matara = customerRepo.streamCustomerByAddress("MATARA");
//        System.out.println(matara.toString());

//        Customer matara = customerRepo.searchCustomerByAddress("akurassa");
//        System.out.println(matara.toString());

//        Long akurassa = customerRepo.countCustomerByAddress("akurassa");
//        System.out.println(akurassa);

//        Boolean akurassa = customerRepo.existsCustomerByAddress("gamapaha");
//        System.out.println(akurassa);

//        customerRepo.deleteCustomerByAddress("gamapaha");

//        customerRepo.removeCustomerByAddress("gamapaha");

    }

}