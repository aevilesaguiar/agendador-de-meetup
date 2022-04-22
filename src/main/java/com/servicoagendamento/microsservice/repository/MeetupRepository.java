package com.servicoagendamento.microsservice.repository;

import com.servicoagendamento.microsservice.model.Meetup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetupRepository extends JpaRepository<Meetup, Integer> {


}
