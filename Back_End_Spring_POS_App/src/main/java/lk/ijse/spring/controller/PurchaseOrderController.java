package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.dto.OrderDetailsDTO;
import lk.ijse.spring.dto.OrdersDTO;
import lk.ijse.spring.service.ItemService;
import lk.ijse.spring.service.OrderDetailsService;
import lk.ijse.spring.service.OrdersService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/PurchaseOrder")
@CrossOrigin
public class PurchaseOrderController {

    @Autowired
    OrdersService ordersService;

    @Autowired
    ItemService  itemService;

    @Autowired
    OrderDetailsService orderDetailsService;


    @GetMapping
    public ResponseUtil getAllOrders(){
        return new ResponseUtil("Ok","Successfully Loaded",ordersService.getAllOrders());
    }

    @PostMapping
    public ResponseUtil purchaseOrder(@RequestBody OrdersDTO od, OrderDetailsDTO ods, ItemDTO i) {
        ordersService.addOrders(od);
        orderDetailsService.addOrderDetails(ods);
        itemService.editItemQty(i);
        return new ResponseUtil("Ok", "Successfully Purchased",ods);
    }

}
