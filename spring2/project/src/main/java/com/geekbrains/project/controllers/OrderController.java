package com.geekbrains.project.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.geekbrains.project.dtos.OrderDto;
import com.geekbrains.project.dtos.ProductDto;
import com.geekbrains.project.error_handling.InvalidDataException;
import com.geekbrains.project.error_handling.ResourceNotFoundException;
import com.geekbrains.project.models.Order;
import com.geekbrains.project.models.Product;
import com.geekbrains.project.models.User;
import com.geekbrains.project.services.OrderService;
import com.geekbrains.project.services.ProductService;
import com.geekbrains.project.services.UserService;

import javax.transaction.Transactional;
import java.security.Principal;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/orders")
public class OrderController {
    private final OrderService orderService;
    private final UserService userService;

    @PostMapping
    public void createNewOrder(Principal principal) {
        User user = userService.findByUsername(principal.getName()).get();
        orderService.createOrderForCurrentUser(user);
    }

    @GetMapping
    @Transactional
    public List<OrderDto> getAllOrdersForCurrentUser(Principal principal) {
        User user = userService.findByUsername(principal.getName()).get();
        return orderService.findAllByUser(user).stream().map(OrderDto::new).collect(Collectors.toList());
    }
}
