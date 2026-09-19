package rw.ac.auca.PhotoStudioManagmentSystemSpring.staffmember.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rw.ac.auca.PhotoStudioManagmentSystemSpring.staffmember.domain.StaffMember;
import rw.ac.auca.PhotoStudioManagmentSystemSpring.staffmember.repository.StaffMemberRepository;

import java.util.List;
import java.util.UUID;

@Service
public class StaffMemberServiceImpl implements StaffMemberService {

    @Autowired
    private StaffMemberRepository staffMemberRepository;

    @Override
    public StaffMember registerStaffMember(StaffMember theStaff) {
        return staffMemberRepository.save(theStaff);
    }

    @Override
    public StaffMember updateStaffMember(UUID id, StaffMember theStaff) {
        StaffMember found = findStaffMemberById(id);
        found.setFullName(theStaff.getFullName());
        found.setRole(theStaff.getRole());
        found.setPhoneNumber(theStaff.getPhoneNumber());
        return staffMemberRepository.save(found);
    }

    @Override
    public void deleteStaffMember(UUID id) {
        staffMemberRepository.delete(findStaffMemberById(id));
    }

    @Override
    public StaffMember findStaffMemberById(UUID id) {
        return staffMemberRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Staff member not found!"));
    }

    @Override
    public List<StaffMember> findAllStaffMembers() {
        return staffMemberRepository.findAll();
    }
}
