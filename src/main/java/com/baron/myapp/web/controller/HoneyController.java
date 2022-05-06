package com.baron.myapp.web.controller;

import com.baron.myapp.business.entity.model.Honey;
import com.baron.myapp.business.service.HoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/honey")
public class HoneyController {

    private HoneyService service;

    @GetMapping("")
    public ModelAndView showMyTable(){
        ModelAndView mav = new ModelAndView("honey_table");
        mav.addObject("allHoney", service.listAll());
        return mav;
    }

    @GetMapping("create")
    public ModelAndView createHoney(){
        ModelAndView mav = new ModelAndView("honey_create");
        Honey honey = new Honey();
        mav.addObject("honey", honey);
        return mav;
    }

    @GetMapping("edit/{id}")
    public ModelAndView editHoney(@PathVariable("id") int id){
        ModelAndView mav = new ModelAndView("honey_edit");
        mav.addObject("honey", service.get(id));
        return mav;
    }

    @GetMapping("delete/{id}")
    public String deleteHoney(@PathVariable("id") int id){
        service.delete(id);
        return "redirect:/honey";
    }

    @PostMapping("saveCreate")
    public String saveCreatedHoney(@ModelAttribute("honey") Honey honey){
        service.create(honey);
        return "redirect:/honey";
    }

    @PostMapping("saveEdit")
    public String saveEditedHoney(@ModelAttribute("honey") Honey honey){
        service.edit(honey);
        return "redirect:/honey";
    }

    @Autowired
    public void setService(HoneyService service) {
        this.service = service;
    }
}
