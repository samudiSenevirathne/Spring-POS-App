package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.OrdersDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.entity.OrderDetails;
import lk.ijse.spring.entity.Orders;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.repo.OrderDetailsRepo;
import lk.ijse.spring.repo.OrdersRepo;
import lk.ijse.spring.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrderDetailsServiceImpl implements OrderDetailsService {

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    OrderDetailsRepo orderDetailsRepo;

    @Autowired
    OrdersRepo ordersRepo;

    @Autowired
    ItemRepo itemRepo;

    @Override
    public void purchaseOrder(OrdersDTO dto) {
        if (ordersRepo.existsById(dto.getOid())) {
            throw new RuntimeException("Order Id " + dto.getOid() + " Already Exists!");
        }
       Orders orders=new Orders(dto.getOid(),customerRepo.getReferenceById(dto.getCusID()),dto.getDate()) ;
       ordersRepo.save(orders);
        dto.getOrderDetails().forEach(dtoP -> {
            orderDetailsRepo.save(new OrderDetails(dtoP.getOid(),dtoP.getItemCode(),dtoP.getQty(),dtoP.getUnitPrice()));
            Item referenceById = itemRepo.getReferenceById(dtoP.getItemCode());
            itemRepo.save(new Item(dtoP.getItemCode(),referenceById.getDescription(),referenceById.getQtyOnHand()-dtoP.getQty(),referenceById.getUnitPrice()));
        });
    }

}
