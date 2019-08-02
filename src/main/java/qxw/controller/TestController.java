package qxw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qxw.model.Uc;
import qxw.service.UcService;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UcService ucService;

    @RequestMapping("/uc")
    public int test(@RequestBody Uc uc){
        return ucService.getUc(uc.getUid(), uc.getCid()).getId();
    }

}
