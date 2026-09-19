package rw.ac.auca.PhotoStudioManagmentSystemSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import rw.ac.auca.PhotoStudioManagmentSystemSpring.staffmember.domain.StaffMember;
import rw.ac.auca.PhotoStudioManagmentSystemSpring.staffmember.service.StaffMemberService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/staff")
public class StaffMemberController {

    @Autowired
    private StaffMemberService staffMemberService;

    @GetMapping("/search-all")
    @ResponseStatus(HttpStatus.OK)
    public List<StaffMember> findAllRecords() {
        return staffMemberService.findAllStaffMembers();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public StaffMember findById(@PathVariable UUID id) {
        return staffMemberService.findStaffMemberById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.OK)
    public StaffMember createStaffMember(@RequestBody StaffMember theStaff) {
        return staffMemberService.registerStaffMember(theStaff);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public StaffMember updateStaffMember(@PathVariable UUID id, @RequestBody StaffMember theStaff) {
        return staffMemberService.updateStaffMember(id, theStaff);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStaffMember(@PathVariable UUID id) {
        staffMemberService.deleteStaffMember(id);
    }
}
