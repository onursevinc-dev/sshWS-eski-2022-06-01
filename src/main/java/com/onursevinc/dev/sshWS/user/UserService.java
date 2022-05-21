package com.onursevinc.dev.sshWS.user;

import com.onursevinc.dev.sshWS.user.role.Role;

import java.util.Optional;

/**
 * @author OnurSevinc
 * @version 0.1
 * @date 16.04.2022
 * @time 18:15
 */
public interface UserService
{
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
