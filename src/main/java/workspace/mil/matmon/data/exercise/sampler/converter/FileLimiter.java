package workspace.mil.matmon.data.exercise.sampler.converter;

public class FileLimiter {
    public static int FILELIMITER = 50000;

    public static int FILECOUNT = 0;
    public static int FILEINDEX = 0;

    public void increment() {
        FILECOUNT++;
        isOverLimit();
    }

    public void isOverLimit() {
        if (FILECOUNT >= FILELIMITER) {
            FILECOUNT = 0;
            FILEINDEX++;
        }
    }


}
