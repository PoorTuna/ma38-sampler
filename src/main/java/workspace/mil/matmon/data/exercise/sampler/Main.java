package workspace.mil.matmon.data.exercise.sampler;

import workspace.mil.matmon.data.exercise.sampler.converter.jsonConverter.CsvJsonConverter;
import workspace.mil.matmon.data.exercise.sampler.etl.etl.ETL;
import workspace.mil.matmon.data.exercise.sampler.etl.etlManager.ETLManager;
import workspace.mil.matmon.data.exercise.sampler.exceptions.exampleExceptions.converterExceptionExample.SamplerConverterErrorException;
import workspace.mil.matmon.data.exercise.sampler.exceptions.exampleExceptions.writerExceptionExample.SamplerWriterErrorException;
import workspace.mil.matmon.data.exercise.sampler.writer.writerExample.JsonWriter;

import java.util.HashMap;


public class Main {

    public static void main(String[] args) throws SamplerConverterErrorException, SamplerWriterErrorException {

        CsvJsonConverter csvJsonConverter = new CsvJsonConverter();
        JsonWriter jsonWriter = new JsonWriter();
        jsonWriter.write("C:\\Users\\Oren\\Desktop\\Works\\Military\\2021-2022\\matmon\\code\\sampler\\src\\main\\mada_reports\\", csvJsonConverter.convert("C:\\Users\\Oren\\Desktop\\Works\\Military\\2021-2022\\matmon\\code\\sampler\\src\\main\\resources\\MadaReports.csv"));

    }
}
