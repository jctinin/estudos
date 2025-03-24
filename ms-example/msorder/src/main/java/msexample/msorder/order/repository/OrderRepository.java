package msexample.msorder.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import msexample.msorder.order.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
