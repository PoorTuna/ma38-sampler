package workspace.mil.matmon.data.exercise.sampler.parser.parserExample;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import workspace.mil.matmon.data.exercise.sampler.exceptions.exampleExceptions.parserExceptionExample.examples.SamplerCsvValidationErrorException;
import workspace.mil.matmon.data.exercise.sampler.exceptions.exampleExceptions.parserExceptionExample.examples.SamplerFileNotFoundErrorException;
import workspace.mil.matmon.data.exercise.sampler.parser.Parser;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVParser extends Parser {

    /**
     * This function gets a file path and returns it formatted in a list
     * that contains each line which is represented as a string array.
     * @param path : the path to file that will be read.
     * @return List<String[]> : The list of string array that represents the file.
     * @throws SamplerCsvValidationErrorException
     * @throws SamplerFileNotFoundErrorException
     */
    @Override
    public List<String[]> read(String path) throws SamplerCsvValidationErrorException, SamplerFileNotFoundErrorException {
        List<String[]> newFile = new ArrayList<String[]>();

        try (CSVReader reader = new CSVReader(new FileReader(path))) {
            String[] lineInArray;
            while ((lineInArray = reader.readNext()) != null) {
                newFile.add(lineInArray);
            }
        } catch (IOException e) {
            throw new SamplerFileNotFoundErrorException();
        } catch (CsvValidationException e) {
            throw new SamplerCsvValidationErrorException();
        }

        return newFile;
    }

    public File readFile(String path) {
        return new File(path);
    }
}
