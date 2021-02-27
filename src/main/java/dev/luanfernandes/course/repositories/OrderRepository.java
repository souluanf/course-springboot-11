package dev.luanfernandes.course.repositories;

import dev.luanfernandes.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
