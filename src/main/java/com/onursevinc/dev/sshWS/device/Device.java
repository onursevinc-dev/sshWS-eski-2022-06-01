package com.onursevinc.dev.sshWS.device;

import com.onursevinc.dev.sshWS.user.User;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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
@Table(name = "devices")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "device_operation_time", nullable = false)
    private int deviceOperationTime;

    @Column(name = "device_views", nullable = false)
    private int deviceViews;

    @Column(name = "device_digital_value", nullable = false)
    private int deviceDigitalValue;

    @Column(name = "device_analog_value", nullable = false)
    private int deviceAnalogValue;

    @Column(name = "description", nullable = false, length = 1000)
    private String description;

    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "device_type", nullable = false)
    private DeviceType deviceType;

    //@OneToMany(fetch = FetchType.LAZY, mappedBy = "device")
    //private Set<Purchase> purchaseList;
}
