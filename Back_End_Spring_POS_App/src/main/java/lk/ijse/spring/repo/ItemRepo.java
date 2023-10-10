package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


public interface ItemRepo extends JpaRepository<Item,String> {

    @Modifying
    @Query(value = "update item set qtyOnHand = qtyOnHand - ?1 where code = ?2", nativeQuery = true)
    int editItemQty(int qtyOnHand, String code);

}