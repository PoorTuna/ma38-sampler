package workspace.mil.matmon.data.exercise.sampler.etl.etl;

import workspace.mil.matmon.data.exercise.sampler.converter.Converter;
import workspace.mil.matmon.data.exercise.sampler.parser.Parser;
import workspace.mil.matmon.data.exercise.sampler.writer.Writer;

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
