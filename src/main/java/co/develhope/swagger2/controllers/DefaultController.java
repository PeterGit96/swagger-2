package co.develhope.swagger2.controllers;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DefaultController {

    @GetMapping
    @ApiOperation(value = "Welcome Message", notes = "Prints out the welcome message")
    public String welcomeMsg() {
        return "Hello, thanks for visiting us!";
    }

}