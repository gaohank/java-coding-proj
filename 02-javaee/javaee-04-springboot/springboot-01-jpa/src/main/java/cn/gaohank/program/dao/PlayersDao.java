package cn.gaohank.program.dao;

import cn.gaohank.program.model.Players;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayersDao extends JpaRepository<Players, Integer> {
}
