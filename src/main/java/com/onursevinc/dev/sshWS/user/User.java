package com.onursevinc.dev.sshWS.user;

import com.onursevinc.dev.sshWS.user.role.Role;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author OnurSevinc
 * @version 0.1
 * @date 16.04.2022
 * @time 18:15
 */
@Data
@Entity
@Table(name = "users")//not user => because it is reserved.
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = true, nullable = false, length = 100)
    private String username;

    @Column(name = "password", nullable = false, length = 100)
    private String password;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "surname", nullable = false, length = 100)
    private String surname;

    @Column(name = "gender", nullable = false)
    private int gender;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "phone_number", nullable = false, length = 100)
    private String phoneNumber;

    @Column(name = "address", nullable = false, length = 100)
    private String address;

    @Column(name = "country", nullable = false, length = 100)
    private String country;

    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

    @Transient
    private String token;
}
