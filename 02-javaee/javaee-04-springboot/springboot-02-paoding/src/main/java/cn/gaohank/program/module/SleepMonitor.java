package cn.gaohank.program.module;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="SleepMonitor")
@Data
public class SleepMonitor {
    private String _id;
}
