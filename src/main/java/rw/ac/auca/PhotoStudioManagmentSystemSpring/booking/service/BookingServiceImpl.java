package rw.ac.auca.PhotoStudioManagmentSystemSpring.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rw.ac.auca.PhotoStudioManagmentSystemSpring.booking.domain.Booking;
import rw.ac.auca.PhotoStudioManagmentSystemSpring.booking.repository.BookingRepository;

import java.util.List;
import java.util.UUID;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Booking registerBooking(Booking theBooking) {
        return bookingRepository.save(theBooking);
    }

    @Override
    public Booking updateBooking(UUID id, Booking theBooking) {
        Booking found = findBookingById(id);
        found.setEventType(theBooking.getEventType());
        found.setEventDate(theBooking.getEventDate());
        found.setStatus(theBooking.getStatus());
        found.setClient(theBooking.getClient());
        found.setAssignedStaff(theBooking.getAssignedStaff());
        return bookingRepository.save(found);
    }

    @Override
    public void deleteBooking(UUID id) {
        bookingRepository.delete(findBookingById(id));
    }

    @Override
    public Booking findBookingById(UUID id) {
        return bookingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Booking not found!"));
    }

    @Override
    public List<Booking> findAllBookings() {
        return bookingRepository.findAll();
    }
}
