package workspace.mil.matmon.data.exercise.sampler.exceptions.exampleExceptions.writerExceptionExample.examples;

import workspace.mil.matmon.data.exercise.sampler.exceptions.exampleExceptions.writerExceptionExample.SamplerWriterErrorException;

public class SamplerAppendingErrorException extends SamplerWriterErrorException {
    public SamplerAppendingErrorException(String str) {
        super(str);
    }
}
