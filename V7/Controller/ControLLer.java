package com.MaksDenysov.V7.Controller;

import com.MaksDenysov.V7.Service.Services;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/7")
public class ControLLer {

    Services make;

    public ControLLer(Services make) {
        this.make = make;
    }


}
