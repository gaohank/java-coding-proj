package cn.gaohank.program.dao;

import cn.gaohank.program.model.Players;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PlayersDao extends JpaRepository<Players, Integer> {
    @Transactional(readOnly = true)
    @Query(value = "select name from players where playerno = ?1", nativeQuery = true)
    String getName(Integer id);
}
