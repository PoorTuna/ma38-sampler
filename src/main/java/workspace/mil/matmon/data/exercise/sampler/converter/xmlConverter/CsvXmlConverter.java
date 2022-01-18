package workspace.mil.matmon.data.exercise.sampler.converter.xmlConverter;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fasterxml.jackson.dataformat.xml.*;
import workspace.mil.matmon.data.exercise.sampler.exceptions.exampleExceptions.converterExceptionExample.SamplerConverterErrorException;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class CsvXmlConverter {

    /**
     * This function returns the csv file formatted to mapping iterator, and can be referenced as xml.
     * @param file : The csv file to be converted
     * @return MappingIterator<Map?, ?>> : the csv file formatted in a way which can be written to xml files.
     * @throws SamplerConverterErrorException
     */
    public MappingIterator<Map<?, ?>> convert(File file) throws SamplerConverterErrorException {
        try {
            CsvSchema csv = CsvSchema.emptySchema().withHeader();
            CsvMapper csvMapper = new CsvMapper();

            return csvMapper.reader().forType(Map.class).with(csv).readValues(file);
        } catch (IOException e) {
            throw new SamplerConverterErrorException();
        }
    }

}
