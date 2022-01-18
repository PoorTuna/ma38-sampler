package workspace.mil.matmon.data.exercise.sampler.etl.etlManager;

import lombok.AllArgsConstructor;
import lombok.Data;
import workspace.mil.matmon.data.exercise.sampler.etl.etl.ETL;

import java.util.Map;

@AllArgsConstructor
@Data
public class ETLManager {
    public Map<String, ETL> etlManager;

}
