package rw.ac.auca.PhotoStudioManagmentSystemSpring.staffmember.service;

import rw.ac.auca.PhotoStudioManagmentSystemSpring.staffmember.domain.StaffMember;

import java.util.List;
import java.util.UUID;

public interface StaffMemberService {
    StaffMember registerStaffMember(StaffMember theStaff);
    StaffMember updateStaffMember(UUID id, StaffMember theStaff);
    void deleteStaffMember(UUID id);
    StaffMember findStaffMemberById(UUID id);
    List<StaffMember> findAllStaffMembers();
}
