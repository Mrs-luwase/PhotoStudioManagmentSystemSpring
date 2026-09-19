package rw.ac.auca.PhotoStudioManagmentSystemSpring.booking.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rw.ac.auca.PhotoStudioManagmentSystemSpring.base.BaseEntity;
import rw.ac.auca.PhotoStudioManagmentSystemSpring.client.domain.Client;
import rw.ac.auca.PhotoStudioManagmentSystemSpring.staffmember.domain.StaffMember;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Booking extends BaseEntity {

    @Column(name = "event_type", nullable = false)
    private String eventType;

    @Column(name = "event_date", nullable = false)
    private LocalDate eventDate;

    @Column(name = "status", nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @ManyToOne
    @JoinColumn(name = "staff_id", nullable = true)
    private StaffMember assignedStaff;
}
