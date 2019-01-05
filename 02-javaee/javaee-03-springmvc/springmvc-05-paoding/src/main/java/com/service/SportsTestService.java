package com.service;

import com.dao.SportsTestDao;
import com.module.Players;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SportsTestService {
    @Autowired
    private SportsTestDao sportsTestDao;

    public List<Players> getPlayers() {
        return sportsTestDao.getPlayers();
    }
}
