package com.onursevinc.dev.sshWS.auth;

import com.onursevinc.dev.sshWS.user.User;

/**
 * @author OnurSevinc
 * @version 0.1
 * @date 16.04.2022
 * @time 18:15
 */
public interface AuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}
