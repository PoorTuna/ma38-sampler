package workspace.mil.matmon.data.exercise.sampler.parser;

import com.opencsv.exceptions.CsvValidationException;
import workspace.mil.matmon.data.exercise.sampler.exceptions.exampleExceptions.parserExceptionExample.examples.SamplerCsvValidationErrorException;
import workspace.mil.matmon.data.exercise.sampler.exceptions.exampleExceptions.parserExceptionExample.examples.SamplerFileNotFoundErrorException;

import java.io.IOException;
import java.util.List;

public abstract class Parser {
    public abstract List<String[]> read(String path) throws SamplerCsvValidationErrorException, SamplerFileNotFoundErrorException;

}
