package workspace.mil.matmon.data.exercise.sampler.converter.jsonConverter;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import workspace.mil.matmon.data.exercise.sampler.converter.FileLimiter;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class CsvJsonConverter {
    public void write(String src, String dest) throws IOException {
        FileLimiter fileLimiter = new FileLimiter();
        File input = new File(dest + "0.json");
        ObjectMapper objectMapper = new ObjectMapper();
        CsvSchema csv = CsvSchema.emptySchema().withHeader();
        CsvMapper csvMapper = new CsvMapper();
        MappingIterator<Map<?, ?>> mappingIterator = csvMapper.reader().forType(Map.class).with(csv).readValues(new File(src));

        objectMapper.writeValue(input, mappingIterator.readAll());
    }


    public static void main(String[] args) throws IOException {
        CsvJsonConverter jsonWriter = new CsvJsonConverter();
        jsonWriter.write("C:\\Users\\Oren\\Desktop\\Works\\Military\\2021-2022\\matmon\\code\\sampler\\src\\main\\resources\\MadaReports.csv", "C:\\Users\\Oren\\Desktop\\Works\\Military\\2021-2022\\matmon\\code\\sampler\\src\\main\\mada_reports\\");
    }
}

