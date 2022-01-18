package workspace.mil.matmon.data.exercise.sampler.exceptions.exampleExceptions.converterExceptionExample.examples;

import workspace.mil.matmon.data.exercise.sampler.exceptions.exampleExceptions.converterExceptionExample.SamplerConverterErrorException;

public class SamplerInvalidInputErrorException extends SamplerConverterErrorException {
    public SamplerInvalidInputErrorException(String str) {
        super(str);
    }

    public SamplerInvalidInputErrorException() {
        super();
    }
}
