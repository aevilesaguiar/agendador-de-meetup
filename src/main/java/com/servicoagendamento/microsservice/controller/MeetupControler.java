package com.servicoagendamento.microsservice.controller;

import com.servicoagendamento.microsservice.model.Meetup;
import com.servicoagendamento.microsservice.repository.MeetupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class MeetupControler {

    @Autowired
    private MeetupRepository meetupRepository;

    @RequestMapping(value = "/cadastrarMeetup", method = RequestMethod.GET)
    public String form(){
        return "meetup/formMeetup";
    }


    @RequestMapping(value = "/cadastrarMeetup", method = RequestMethod.POST)
    public String form(Meetup meetup){
        meetupRepository.save(meetup);

        return "redirect:/cadastrarMeetup";
    }

    @RequestMapping("/meetups")
    public ModelAndView listaMeetups(){
        ModelAndView mv = new ModelAndView("index");
        Iterable<Meetup> meetups = meetupRepository.findAll();
        mv.addObject("meetups", meetups);
        return mv;
    }



}
