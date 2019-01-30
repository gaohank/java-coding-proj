package cn.gaohank.program.service;

import cn.gaohank.program.module.SleepMonitor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SleepService extends MongoRepository<SleepMonitor, String> {
}
