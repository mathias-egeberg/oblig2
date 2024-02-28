package com.example.oblig2data1700;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BilettController {

    private final List<Biletter> alleBiletter = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagreBiletter(Biletter innBilett){
        alleBiletter.add(innBilett);
    }

    @GetMapping("/hentAlle")
    public List<Biletter> hentAlle(){
        return alleBiletter;
    }
}
