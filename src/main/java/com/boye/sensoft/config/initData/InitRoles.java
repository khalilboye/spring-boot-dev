package com.boye.sensoft.config.initData;

import com.boye.sensoft.entities.Role;
import com.boye.sensoft.entities.User;
import com.boye.sensoft.repositories.RoleRepository;
import com.boye.sensoft.repositories.UserRepository;
import com.boye.sensoft.utils.RoleEnum;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class InitRoles// implements ApplicationRunner
{
    /*private final RoleRepository roleRepository;

    public InitRoles(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Init roles .....");

        Role roleUser = roleRepository.findByName(RoleEnum.ROLE_USER.getName());
        if(roleUser == null){
            roleUser = new Role(RoleEnum.ROLE_USER);
            roleRepository.save(roleUser);
        }

        Role roleAdmin = roleRepository.findByName(RoleEnum.ROLE_USER.getName());
        if(roleAdmin == null){
            roleAdmin = new Role(RoleEnum.ROLE_ADMIN);
            roleRepository.save(roleAdmin);
        }
    }

     */

}
