package workspace.mil.matmon.data.exercise.sampler.exceptions.exampleExceptions.parserExceptionExample.examples;

import workspace.mil.matmon.data.exercise.sampler.exceptions.exampleExceptions.parserExceptionExample.SamplerParserErrorException;

public class SamplerFileNotFoundErrorException extends SamplerParserErrorException {
    public SamplerFileNotFoundErrorException(String str) {
        super(str);
    }
}
