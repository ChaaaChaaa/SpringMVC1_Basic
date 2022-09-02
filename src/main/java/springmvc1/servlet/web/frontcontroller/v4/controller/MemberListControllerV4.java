package springmvc1.servlet.web.frontcontroller.v4.controller;

import java.util.List;
import java.util.Map;

import springmvc1.servlet.domain.member.Member;
import springmvc1.servlet.domain.member.MemberRepository;
import springmvc1.servlet.web.frontcontroller.ModelView;
import springmvc1.servlet.web.frontcontroller.v3.ControllerV3;
import springmvc1.servlet.web.frontcontroller.v4.ControllerV4;

public class MemberListControllerV4 implements ControllerV4 {
    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        List<Member> members = memberRepository.findAll();
        model.put("members", members);
        return "members";
    }
}
