package org.budgetmanager.budgetmanager;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class BudgetController {
    @GetMapping("/get")
    public String hello() {
        return "Hello World";
    }
}
