package springmvc1.servlet.web.frontcontroller.v3;

import java.util.Map;

import springmvc1.servlet.web.frontcontroller.ModelView;

public interface ControllerV3 {
    ModelView process(Map<String,String> paramMap);
}
