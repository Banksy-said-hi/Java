package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    private Map<String, Address> addresses = new HashMap<>();

    public Address create(Address address) {
        address.setId(UUID.randomUUID().toString());
        addresses.put(address.getId(), address);

        return address;
    }

    public List<Address> getAll() {
        return new ArrayList<Address>(addresses.values());
    }

    public Address update(Address address) {
        String id = address.getId();
        addresses.put(id, address);

        return address;
    }
}
