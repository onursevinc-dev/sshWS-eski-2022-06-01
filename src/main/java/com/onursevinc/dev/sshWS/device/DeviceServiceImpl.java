package com.onursevinc.dev.sshWS.device;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author OnurSevinc
 * @version 0.1
 * @date 16.04.2022
 * @time 18:15
 */
@Service
public class DeviceServiceImpl implements DeviceService
{
    private final DeviceRepository deviceRepository;

    public DeviceServiceImpl(DeviceRepository deviceRepository)
    {
        this.deviceRepository = deviceRepository;
    }

    @Override
    public Device saveDevice(Device device)
    {
        device.setCreateTime(LocalDateTime.now());

        return deviceRepository.save(device);
    }

    @Override
    public void deleteDevice(Long id)
    {
        deviceRepository.deleteById(id);
    }

    @Override
    public List<Device> findAllDevices()
    {
        return deviceRepository.findAll();
    }
}
