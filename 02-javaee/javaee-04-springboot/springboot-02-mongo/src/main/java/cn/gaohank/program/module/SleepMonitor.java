package cn.gaohank.program.module;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="SleepMonitor")
@Data
public class SleepMonitor {
//    @Id
//    private String _id;
    private String SleepStage;
}
