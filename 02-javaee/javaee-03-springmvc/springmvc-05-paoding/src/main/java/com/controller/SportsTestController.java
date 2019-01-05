package com.controller;

import com.module.Players;
import com.service.SportsTestService;
import net.paoding.rose.web.annotation.Path;
import net.paoding.rose.web.annotation.rest.Get;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Path("/sports")
public class SportsTestController {
    @Autowired
    private SportsTestService sportsTestService;

    @Get("/players")
    public List<Players> getPlayers() {
        return sportsTestService.getPlayers();
    }
}
