package com.webbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webbot.model.Url;


public interface url_repo extends JpaRepository<Url, Integer> {

}
