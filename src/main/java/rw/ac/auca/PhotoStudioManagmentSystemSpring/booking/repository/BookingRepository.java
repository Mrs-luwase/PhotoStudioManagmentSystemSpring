package rw.ac.auca.PhotoStudioManagmentSystemSpring.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.ac.auca.PhotoStudioManagmentSystemSpring.booking.domain.Booking;

import java.util.UUID;

@Repository
public interface BookingRepository extends JpaRepository<Booking, UUID> {
}
