package ru.itis.tuhocspringboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itis.tuhocspringboot.models.User;
import ru.itis.tuhocspringboot.repositories.UsersRepository;

import java.util.List;

@Controller
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("users")
    public String getUsersPage(Model model) {
        List<User> userList = usersRepository.findAll();
        model.addAttribute("users", userList);
        return "users_page";
    }
}
