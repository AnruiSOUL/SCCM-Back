package crame.randall.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by randallcrame on 3/23/17.
 */

@RestController
@CrossOrigin
public class HomeController
{

    @RequestMapping("/")
    public String home()
    {
        return "SCCM ready to go";
    }
}
