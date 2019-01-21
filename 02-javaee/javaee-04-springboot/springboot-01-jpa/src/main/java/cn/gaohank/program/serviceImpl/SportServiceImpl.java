package cn.gaohank.program.serviceImpl;

import cn.gaohank.program.dao.PlayersDao;
import cn.gaohank.program.model.Players;
import cn.gaohank.program.service.SportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SportServiceImpl implements SportService {
    @Autowired
    private PlayersDao playersDao;

    public void logPlayersData(int id) {
        Players players = playersDao.findOne(id);
        System.out.println(players.toString());
    }

    public String getName(int id) {
        return playersDao.getName(id);
    }
}
