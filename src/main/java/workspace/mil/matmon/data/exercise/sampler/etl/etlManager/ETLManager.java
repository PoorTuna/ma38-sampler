package workspace.mil.matmon.data.exercise.sampler.etl.etlManager;

import lombok.AllArgsConstructor;
import lombok.Data;
import workspace.mil.matmon.data.exercise.sampler.etl.etl.ETL;

import java.util.List;

@AllArgsConstructor
@Data
public class ETLManager {
    public List<ETL> etlManager;

}
