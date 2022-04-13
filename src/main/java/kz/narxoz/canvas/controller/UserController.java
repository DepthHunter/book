package kz.narxoz.canvas.controller;

import kz.narxoz.canvas.model.Book;
import kz.narxoz.canvas.model.User;
import kz.narxoz.canvas.repository.BookRepository;
import kz.narxoz.canvas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("users")
    public List<User> getAll() {
        return userRepository.findAll();
    }
}