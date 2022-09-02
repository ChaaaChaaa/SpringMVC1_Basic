package springmvc1.servlet.web.frontcontroller.v2.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import springmvc1.servlet.web.frontcontroller.MyView;
import springmvc1.servlet.web.frontcontroller.v2.ControllerV2;

public class MemberFormControllerV2 implements ControllerV2{
    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        return new MyView("/WEB-INF/views/new-form.jsp");
    }
}
