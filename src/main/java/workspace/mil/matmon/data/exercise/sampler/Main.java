package workspace.mil.matmon.data.exercise.sampler;

import workspace.mil.matmon.data.exercise.sampler.converter.jsonConverter.CsvJsonConverter;
import workspace.mil.matmon.data.exercise.sampler.converter.xmlConverter.CsvXmlConverter;
import workspace.mil.matmon.data.exercise.sampler.exceptions.exampleExceptions.converterExceptionExample.SamplerConverterErrorException;
import workspace.mil.matmon.data.exercise.sampler.exceptions.exampleExceptions.writerExceptionExample.SamplerWriterErrorException;
import workspace.mil.matmon.data.exercise.sampler.parser.parserExample.CSVParser;
import workspace.mil.matmon.data.exercise.sampler.parser.parserExample.JsonParser;
import workspace.mil.matmon.data.exercise.sampler.writer.writerExample.JsonWriter;
import workspace.mil.matmon.data.exercise.sampler.writer.writerExample.XMLWriter;


public class Main {

    public static void main(String[] args) throws SamplerConverterErrorException, SamplerWriterErrorException {

        CsvJsonConverter csvJsonConverter = new CsvJsonConverter();
        CsvXmlConverter csvXmlConverter = new CsvXmlConverter();

        JsonWriter jsonWriter = new JsonWriter();
        XMLWriter xmlWriter = new XMLWriter();

        CSVParser csvParser = new CSVParser();
        JsonParser jsonParser = new JsonParser();

        jsonWriter.write("C:\\Users\\Oren\\Desktop\\Works\\Military\\2021-2022\\matmon\\code\\sampler\\src\\main\\mada_reports\\", csvJsonConverter.convert(jsonParser.readFile("C:\\Users\\Oren\\Desktop\\Works\\Military\\2021-2022\\matmon\\code\\sampler\\src\\main\\resources\\MadaReports.csv")));
        //xmlWriter.write("C:\\Users\\Oren\\Desktop\\Works\\Military\\2021-2022\\matmon\\code\\sampler\\src\\main\\LABTESTS\\", csvXmlConverter.convert(csvParser.readFile("C:\\Users\\Oren\\Desktop\\Works\\Military\\2021-2022\\matmon\\code\\sampler\\src\\main\\resources\\MadaReports.csv")));

    }
}
