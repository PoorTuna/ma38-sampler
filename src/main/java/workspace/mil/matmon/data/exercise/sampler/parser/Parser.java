package workspace.mil.matmon.data.exercise.sampler.parser;

import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public abstract class Parser {
    public abstract List<String[]> read(String path) throws IOException, CsvValidationException;

}
