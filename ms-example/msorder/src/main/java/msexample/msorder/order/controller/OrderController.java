package msexample.msorder.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import msexample.msorder.order.entity.Order;
import msexample.msorder.order.repository.OrderRepository;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/orders")
public class OrderController {

  @Autowired
  OrderRepository orderRepository;

  @PostMapping
  public Order createOrder(@RequestBody Order order){
    return orderRepository.save(order);
  }

  @GetMapping("/{id}")
  public Order getOrder(@PathVariable Long id){
    return orderRepository.findById(id).orElse(null);
  }


}
