package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer,String> {

    /*testing Query Methods*/
//   Customer findCustomerByAddress(String address);
//   Customer readCustomerByAddress(String address);
//   Customer getCustomerByAddress(String address);
//   Customer queryCustomerByAddress(String address);
//   Customer streamCustomerByAddress(String address);
//   Customer searchCustomerByAddress(String address);
//
//   Long countCustomerByAddress(String address);
//   Boolean existsCustomerByAddress(String address);
//
//   void deleteCustomerByAddress(String address);
//   void removeCustomerByAddress(String address);

//    //Native SQL Supported
//    @Query(value = "select * from Customer",nativeQuery = true)
//    List<Customer> getAllCustomers1();
//
//    //JPQL
//    @Query(value = "select c from Customer c")
//    List<Customer> getAllCustomers2();
//
//    //HQL
//    @Query(value = "from Customer c")
//    List<Customer> getAllCustomers3();
//
//
//    //what about params.?
//    //we need to search a customer by name
//    //With Named params :nm
//    //:address
//    //here you can set the parameters by name
//    @Query(value = "select * from Customer where name=:nm",nativeQuery = true)
//    Customer searchCustomerWithName(@Param("nm") String name);
//
//
//    //positional parameters
//    //you can set the parameters by position
//    @Query(value = "select * from Customer where name=?1 and address=?2",nativeQuery = true)
//    Customer searchCustomerWithName2(String name,String address);

}