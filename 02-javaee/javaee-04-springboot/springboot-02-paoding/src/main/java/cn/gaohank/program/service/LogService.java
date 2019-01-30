package cn.gaohank.program.service;

import cn.gaohank.program.module.SleepMonitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<SleepMonitor> findAll() {
        return mongoTemplate.findAll(SleepMonitor.class);
    }
}
