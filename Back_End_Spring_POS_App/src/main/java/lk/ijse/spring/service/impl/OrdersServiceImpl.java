package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.OrdersDTO;
import lk.ijse.spring.entity.Orders;
import lk.ijse.spring.repo.OrdersRepo;
import lk.ijse.spring.service.OrdersService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    OrdersRepo ordersRepo;

    @Autowired
    ModelMapper mapper;


    @Override
    public void addOrders(OrdersDTO dto) {
        /* as service level validation */
        if (ordersRepo.existsById(dto.getOid())) {
            throw new RuntimeException(dto.getOid()+" is already available, please insert a new ID");
        }

        Orders map = mapper.map(dto, Orders.class);
        ordersRepo.save(map);
    }

    @Override
    public List<OrdersDTO> getAllOrders() {
        List<Orders> all = ordersRepo.findAll();
        return mapper.map(all, new TypeToken<List<OrdersDTO>>() {}.getType());
    }

}
