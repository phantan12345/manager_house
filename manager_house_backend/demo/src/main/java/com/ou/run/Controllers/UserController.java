package com.ou.run.Controllers;

import com.ou.run.Services.Users.DTO.UserDTO;
import com.ou.run.Services.Users.IUserService;
import com.ou.run.Services.Users.UserService;
import com.ou.run.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ADMIN
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private IUserService UserService;

    @GetMapping("/create")
    public Users add(  ) {
        return new Users("tan", "tan");
    }
}
