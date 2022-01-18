package workspace.mil.matmon.data.exercise.sampler.parser.parserExample;

import workspace.mil.matmon.data.exercise.sampler.parser.Parser;

import java.io.File;
import java.util.List;

public class JsonParser extends Parser {
    @Override
    public List<String[]> read(String path) {
        return null;
    }

    public File readFile(String path) {
        return new File(path);
    }
}
