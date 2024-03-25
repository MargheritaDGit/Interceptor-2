package Controller;

import Interceptor.MonthInterceptor;
import com.example.Interceptor2.Month;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/months")
public class MonthController {
    @Autowired
    MonthInterceptor monthInterceptor;

    @GetMapping("/m")
    public Month getMonth(HttpServletRequest request) {
        return (Month) request.getAttribute("month");
    }
}
