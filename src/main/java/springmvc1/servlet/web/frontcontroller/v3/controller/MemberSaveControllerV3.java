package springmvc1.servlet.web.frontcontroller.v3.controller;

import java.util.Map;

import springmvc1.servlet.domain.member.Member;
import springmvc1.servlet.domain.member.MemberRepository;
import springmvc1.servlet.web.frontcontroller.ModelView;
import springmvc1.servlet.web.frontcontroller.v3.ControllerV3;

public class MemberSaveControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {
        String userName = paramMap.get("userName");
        int age = Integer.parseInt(paramMap.get("age"));
        Member member = new Member(userName, age);
        memberRepository.save(member);

        ModelView modelView = new ModelView("save-result");
        modelView.getModel().put("member",member);
        return modelView;
    }
}
