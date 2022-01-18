package workspace.mil.matmon.data.exercise.sampler.converter;

public class FileLimiter {
    public static int FILELIMITER = 50000;

    public static int FILECOUNT = 0;
    public static int FILEINDEX = 0;

    public void increment() {
        FILECOUNT++;
        isOverLimit();
    }

    /**
     * This function returns true if FILECOUNT is equal/bigger than FILELIMITER, else false.
     * @return true : FILECOUNT >= FILELIMITER
     * @return false: FILECOUNT < FILELIMITER
     */
    public boolean isOverLimit() {
        if (FILECOUNT >= FILELIMITER) {
            FILECOUNT = 0;
            FILEINDEX++;
            return true;
        }
        return false;
    }

    public int getFILECOUNT(){
        return FILECOUNT;
    }


}
