package workspace.mil.matmon.data.exercise.sampler.exceptions.exampleExceptions.converterExceptionExample.examples;

import workspace.mil.matmon.data.exercise.sampler.exceptions.exampleExceptions.converterExceptionExample.SamplerConverterErrorException;

public class SamplerFileNotFoundErrorException extends SamplerConverterErrorException {
    public SamplerFileNotFoundErrorException(String str) {
        super(str);
    }

    public SamplerFileNotFoundErrorException() {
        super();
    }
}
