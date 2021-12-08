package ink.wgb.eptycm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@RestController
public class BaseController {

    @Autowired
    CommentRepository commentRepository;

    @GetMapping("/")
    public String index(){
        List<Comments> comments = commentRepository.findAll();
        Set<String> emails = new HashSet<>();

        StringBuilder str= new StringBuilder();
        for(Comments c:comments){
            emails.add(c.getMail());
        }
        for(String s:emails){
            if(!Objects.equals(s, "null"))
            str.append(s).append(";");

        }

        return str.toString();
    }
}
