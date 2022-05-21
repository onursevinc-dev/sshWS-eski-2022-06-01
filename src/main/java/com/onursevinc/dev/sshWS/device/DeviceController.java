package com.onursevinc.dev.sshWS.device;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author OnurSevinc
 * @version 0.1
 * @date 16.04.2022
 * @time 18:15
 */
@RestController
@RequestMapping("api/device")//pre-path
public class DeviceController
{
    @Autowired
    private DeviceService deviceService;

    @PostMapping //api/device
    public ResponseEntity<?> saveDevice(@RequestBody Device device)
    {
        return new ResponseEntity<>(deviceService.saveDevice(device), HttpStatus.CREATED);
    }

    @DeleteMapping("{deviceId}")//api/device/{deviceId}
    public ResponseEntity<?> deleteDevice(@PathVariable Long deviceId)
    {
        deviceService.deleteDevice(deviceId);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping //api/device
    public ResponseEntity<?> getAllDevices()
    {
        return new ResponseEntity<>(deviceService.findAllDevices(), HttpStatus.OK);
    }
}
