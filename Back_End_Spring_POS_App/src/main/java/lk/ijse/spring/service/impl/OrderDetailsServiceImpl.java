package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.OrderDetailsDTO;
import lk.ijse.spring.entity.OrderDetails;
import lk.ijse.spring.repo.OrderDetailsRepo;
import lk.ijse.spring.service.OrderDetailsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrderDetailsServiceImpl implements OrderDetailsService {

    @Autowired
    OrderDetailsRepo orderDetailsRepo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void addOrderDetails(OrderDetailsDTO dto) {
        OrderDetails map = mapper.map(dto, OrderDetails.class);
        orderDetailsRepo.save(map);
    }
}
