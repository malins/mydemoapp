package malins.mydemoapp;

import javax.servlet.ServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private static Logger log = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("/")
    public String indexPage(final ServletRequest request) {
        log.info("Client " + request.getRemoteAddr() + " calls index page");
        return "index";
    }
}
