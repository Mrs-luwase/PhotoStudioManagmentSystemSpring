package rw.ac.auca.PhotoStudioManagmentSystemSpring.booking.service;

import rw.ac.auca.PhotoStudioManagmentSystemSpring.booking.domain.Booking;

import java.util.List;
import java.util.UUID;

public interface BookingService {
    Booking registerBooking(Booking theBooking);
    Booking updateBooking(UUID id, Booking theBooking);
    void deleteBooking(UUID id);
    Booking findBookingById(UUID id);
    List<Booking> findAllBookings();
}
