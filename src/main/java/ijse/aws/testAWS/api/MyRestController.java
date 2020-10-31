package ijse.aws.testAWS.api;

import ijse.aws.testAWS.data.Message;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/api/message")
    public Message messageBuilder(@RequestParam("username") String user, @RequestParam("message")String message){
        Message msg=new Message();
        msg.setSender(user);
        msg.setMessage(message);
        msg.setSentTime(new Date());
        return msg;
    }
    @PostMapping("/api/message")
    public Message createMessage(@RequestBody() Message msg){
        return msg;
    }
}

