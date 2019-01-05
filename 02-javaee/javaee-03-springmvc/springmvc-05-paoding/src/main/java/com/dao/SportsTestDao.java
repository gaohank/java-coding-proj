package com.dao;

import com.module.Players;
import net.paoding.rose.jade.annotation.DAO;
import net.paoding.rose.jade.annotation.SQL;

import java.util.List;

@DAO(catalog = "dataSource")
public interface SportsTestDao {
    @SQL("select * from players")
    List<Players> getPlayers();
}
