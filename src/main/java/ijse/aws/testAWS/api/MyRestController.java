package ijse.aws.testAWS.api;

import ijse.aws.testAWS.data.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController

public class MyRestController
{

    @GetMapping(path = "/api/hello")
    public Message sayHello(){
        Message msg=new Message();
        msg.setSender("Server");
        msg.setMessage("Hello World");
        msg.setSentTime(new Date());
        return msg;
    }
}

