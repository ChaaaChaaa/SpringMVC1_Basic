package springmvc1.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import springmvc1.servlet.domain.member.Member;
import springmvc1.servlet.domain.member.MemberRepository;

@Controller
public class SpringMemberSaveControllerV1 {
    private MemberRepository memberRepository = MemberRepository.getInstance();

    @RequestMapping("springmvc/v1/members/save")
    public ModelAndView process(HttpServletRequest request, HttpServletResponse response) {
        String userName = request.getParameter("userName");
        int age = Integer.parseInt(request.getParameter("age"));
        Member member = new Member(userName, age);
        memberRepository.save(member);

        ModelAndView modelView = new ModelAndView("save-result");
        modelView.addObject("member",member);
        return modelView;
    }
}
