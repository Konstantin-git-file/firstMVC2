package com.example.firstmvc2.Members;


import com.example.firstmvc2.Members.models.Member;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;



@Controller
@RequestMapping("/members")
public class MembersHandler {

    private static List<Member> members = new ArrayList<>();

    @GetMapping

    public String toMembers(Model model) {
        model.addAttribute("members",members);
//        model.addAttribute("lastName", "Bob");
        return "members/members";
    }

    @GetMapping("/new_member")
    public String toAddMember() {
        return "members/new_member";
    }

    @PostMapping("/new_member/create")
    public String createMember(@RequestParam String firstName,
                               @RequestParam String lastName) {
        members.add(new Member(firstName, lastName));
//        System.out.printf("First Name: %s; Last Name: %s \n", firstName, lastName);
        return "redirect:/members";
    }


}
