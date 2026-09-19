package rw.ac.auca.PhotoStudioManagmentSystemSpring.staffmember.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.ac.auca.PhotoStudioManagmentSystemSpring.staffmember.domain.StaffMember;

import java.util.UUID;

@Repository
public interface StaffMemberRepository extends JpaRepository<StaffMember, UUID> {
}