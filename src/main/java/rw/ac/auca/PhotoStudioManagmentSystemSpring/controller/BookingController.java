package rw.ac.auca.PhotoStudioManagmentSystemSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import rw.ac.auca.PhotoStudioManagmentSystemSpring.booking.domain.Booking;
import rw.ac.auca.PhotoStudioManagmentSystemSpring.booking.service.BookingService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/search-all")
    @ResponseStatus(HttpStatus.OK)
    public List<Booking> findAllRecords() {
        return bookingService.findAllBookings();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Booking findById(@PathVariable UUID id) {
        return bookingService.findBookingById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.OK)
    public Booking createBooking(@RequestBody Booking theBooking) {
        return bookingService.registerBooking(theBooking);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Booking updateBooking(@PathVariable UUID id, @RequestBody Booking theBooking) {
        return bookingService.updateBooking(id, theBooking);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBooking(@PathVariable UUID id) {
        bookingService.deleteBooking(id);
    }
}
