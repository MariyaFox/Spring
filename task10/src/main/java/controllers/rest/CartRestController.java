package controllers.rest;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import persistence.Cart;

@RestController
@RequestMapping("/api/v1/cart")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CartRestController {

    private CartService cartService;
    private Cart cart;
}