package lk.ijse.spring.service;

import lk.ijse.spring.dto.OrdersDTO;

import java.util.List;

public interface OrdersService {

    void addOrders(OrdersDTO dto);

    List<OrdersDTO> getAllOrders();
}
