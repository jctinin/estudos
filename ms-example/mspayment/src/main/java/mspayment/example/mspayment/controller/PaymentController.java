package mspayment.example.mspayment.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

  @PostMapping("/{orderId}")
  public String proccessPayment(@PathVariable Long orderId) {
    return "Payment processed for order " + orderId;
  }

}
