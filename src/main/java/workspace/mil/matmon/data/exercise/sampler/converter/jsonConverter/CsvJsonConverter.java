package workspace.mil.matmon.data.exercise.sampler.converter.jsonConverter;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import workspace.mil.matmon.data.exercise.sampler.exceptions.exampleExceptions.converterExceptionExample.SamplerConverterErrorException;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class CsvJsonConverter {
    public MappingIterator<Map<?, ?>> convert(String src) throws SamplerConverterErrorException {
        try {
            CsvSchema csv = CsvSchema.emptySchema().withHeader();
            CsvMapper csvMapper = new CsvMapper();

            return csvMapper.reader().forType(Map.class).with(csv).readValues(new File(src));
        } catch (IOException e) {
            throw new SamplerConverterErrorException();
        }
    }

}

