package workspace.mil.matmon.data.exercise.sampler.etl.etl;

import lombok.AllArgsConstructor;
import lombok.Data;

import workspace.mil.matmon.data.exercise.sampler.converter.Converter;
import workspace.mil.matmon.data.exercise.sampler.parser.Parser;
import workspace.mil.matmon.data.exercise.sampler.writer.Writer;

@AllArgsConstructor
@Data
public class ETL {
    private Parser parser;
    private Writer writer;
    private Converter converter;

    public void transformExecute(){
        //this.writer.write(this.converter(this.parser));
    }

    public void execute(){
        //this.writer.write(this.parser);
    }

}
