package com.teameast.parkshark.service.member;

import com.teameast.parkshark.domain.member.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final UserRepository userRepository;
    private final MemberMapper memberMapper;

    @Autowired
    public MemberService(UserRepository userRepository, MemberMapper memberMapper) {
        this.userRepository = userRepository;
        this.memberMapper = memberMapper;
    }
}
