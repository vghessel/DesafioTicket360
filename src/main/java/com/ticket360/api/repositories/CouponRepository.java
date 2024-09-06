package com.ticket360.api.repositories;

import com.ticket360.api.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CouponRepository extends JpaRepository<Event, UUID> {
}
