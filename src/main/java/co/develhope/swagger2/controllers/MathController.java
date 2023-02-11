package co.develhope.swagger2.controllers;

import co.develhope.swagger2.entities.ArithmeticOperation;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping
    @ApiOperation(value = "Welcome Message", notes = "Prints out the welcome message")
    public String welcomeMathMsg() {
        return "Hello, thanks for visiting us!";
    }

    @GetMapping("/division-info")
    @ApiOperation(value = "Division Info", notes = "Prints out the division's info")
    public ArithmeticOperation divisionInfo() {
       String[] properties = {"distributive, invariant, identity"};
       return new ArithmeticOperation("division", 2,
               "Division is one of the four basic operations of arithmetic", properties);
    }

    @GetMapping("/multiplication")
    @ApiOperation(value = "Multiplication", notes = "Returns the multiplication result from two input values")
    public int multiplication(@RequestParam int operand1, @RequestParam int operand2) {
        return operand1 * operand2;
    }

    @GetMapping("/square/{n}")
    @ApiOperation(value = "Square", notes = "Returns the square of a number")
    public int square(@PathVariable int n) {
        return n * n;
    }


}