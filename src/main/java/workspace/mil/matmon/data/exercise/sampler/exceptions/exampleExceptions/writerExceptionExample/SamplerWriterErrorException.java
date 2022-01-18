package workspace.mil.matmon.data.exercise.sampler.exceptions.exampleExceptions.writerExceptionExample;

import workspace.mil.matmon.data.exercise.sampler.exceptions.SamplerException;

public class SamplerWriterErrorException extends SamplerException {
    public SamplerWriterErrorException(String str) {
        super(str);
    }

    public SamplerWriterErrorException() {
        super();
    }
}
