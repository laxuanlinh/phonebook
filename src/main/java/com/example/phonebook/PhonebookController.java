package com.example.phonebook;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@RestController
public class PhonebookController {

//    @GetMapping(name = "/hello")
//    public String hello(){
//        return "hello";
//    }

    @RequestMapping(method = RequestMethod.GET, value = "/phone")
    public Phone getPhone(@RequestParam Integer id, @RequestParam Integer phonebook){
        Long start = System.nanoTime();
        Phone phone = new Phone();
        if (phonebook.equals(1))
            phone = (Phone) PhonebookApplication.phonebook.get(id);
        else
            phone = (Phone) PhonebookApplication.phonebook2.get(id);
        Long end = System.nanoTime();
        System.out.println("Time taken "+phonebook+": "+(end-start));
        return phone;
    }

}

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
class Phone {
    private Integer id;
    private String name, phoneNumber;
}