package workspace.mil.matmon.data.exercise.sampler.exceptions.exampleExceptions.parserExceptionExample.examples;

import workspace.mil.matmon.data.exercise.sampler.exceptions.exampleExceptions.parserExceptionExample.SamplerParserErrorException;

public class SamplerCsvValidationErrorException extends SamplerParserErrorException {
    public SamplerCsvValidationErrorException(String str) {
        super(str);
    }

    public SamplerCsvValidationErrorException() {
        super();
    }
}
