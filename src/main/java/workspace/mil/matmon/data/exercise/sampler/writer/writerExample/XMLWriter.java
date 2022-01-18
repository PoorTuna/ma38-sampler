package workspace.mil.matmon.data.exercise.sampler.writer.writerExample;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import workspace.mil.matmon.data.exercise.sampler.converter.FileLimiter;
import workspace.mil.matmon.data.exercise.sampler.exceptions.exampleExceptions.writerExceptionExample.SamplerWriterErrorException;
import workspace.mil.matmon.data.exercise.sampler.writer.Writer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class XMLWriter extends Writer {

    /**
     * This function Writes into separate xml files the mapped content.
     * @param path : the path where the files will be created
     * @param mappingIterator : the mapped content to be written into the xml files.
     * @throws SamplerWriterErrorException
     */
    public void write(String path, MappingIterator<Map<?, ?>> mappingIterator) throws SamplerWriterErrorException {
        try {
            FileLimiter fileLimiter = new FileLimiter();
            File input = new File(path + FileLimiter.FILEINDEX + ".xml");
            XmlMapper xmlMapper = new XmlMapper();

            List<Map<?, ?>> temp = new ArrayList<>();
            while (mappingIterator.hasNext()) {
                Map<?, ?> obj = mappingIterator.next();
                temp.add(obj);
                if (fileLimiter.isOverLimit()) {
                    xmlMapper.writeValue(input, temp);
                    temp = new ArrayList<>();
                }
                fileLimiter.increment();
            }
            xmlMapper.writeValue(input, temp);
        } catch (IOException e) {
            throw new SamplerWriterErrorException();
        }
    }


    @Override
    public void write(String path) {

    }
}
