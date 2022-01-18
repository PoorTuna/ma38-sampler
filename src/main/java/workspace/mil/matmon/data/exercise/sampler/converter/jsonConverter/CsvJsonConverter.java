package workspace.mil.matmon.data.exercise.sampler.converter.jsonConverter;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import workspace.mil.matmon.data.exercise.sampler.converter.FileLimiter;
import workspace.mil.matmon.data.exercise.sampler.exceptions.exampleExceptions.converterExceptionExample.SamplerConverterErrorException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CsvJsonConverter {
    public void write(String src, String dest) throws SamplerConverterErrorException {
        try {
            FileLimiter fileLimiter = new FileLimiter();
            FileWriter fileWriter = new FileWriter(dest + FileLimiter.FILEINDEX + ".json");
            File input = new File(dest + FileLimiter.FILEINDEX + ".json");
            ObjectMapper objectMapper = new ObjectMapper();
            CsvSchema csv = CsvSchema.emptySchema().withHeader();
            CsvMapper csvMapper = new CsvMapper();
            MappingIterator<Map<?, ?>> mappingIterator = csvMapper.reader().forType(Map.class).with(csv).readValues(new File(src));
            List<Map<?, ?>> temp = new ArrayList<>();

            for (MappingIterator<Map<?, ?>> it = mappingIterator; it.hasNext(); ) {
                Map<?, ?> obj = it.next();
                temp.add(obj);
                if (fileLimiter.isOverLimit()) {
                    objectMapper.writeValue(input, temp);
                    temp = new ArrayList<>();
                }
                fileLimiter.increment();
            }
            objectMapper.writeValue(input, temp);
        }catch (IOException e){
            throw new SamplerConverterErrorException();
        }
    }

}

