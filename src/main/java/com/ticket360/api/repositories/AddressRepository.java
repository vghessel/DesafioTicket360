package com.ticket360.api.repositories;

import com.ticket360.api.domain.address.Address;
import com.ticket360.api.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AddressRepository extends JpaRepository <Address, UUID> {
    public Optional<Address> findByEventId(UUID eventId);
}
