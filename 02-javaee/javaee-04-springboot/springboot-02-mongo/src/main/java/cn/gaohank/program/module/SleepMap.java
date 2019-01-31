package cn.gaohank.program.module;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "map")
public class SleepMap {
    private ObjectId _id;
    private Gis gis;

    private class Gis {
        private Double x;
        private Double y;
    }
}
