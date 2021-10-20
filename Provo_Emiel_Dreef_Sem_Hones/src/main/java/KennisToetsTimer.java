public class KennisToetsTimer {
    private final long NANO_SECS_PER_SEC = 1000000000;
    private long stopWatchStartTime = 0;
    private long stopWatchStopTime = 0;
    private boolean stopWatchRunning = false;

    public void start() {
        stopWatchStartTime = 0;
        this.stopWatchStartTime = System.nanoTime();
        this.stopWatchRunning = true;
    }

    public void stop() {
        this.stopWatchStopTime = System.nanoTime();
        this.stopWatchRunning = false;
    }

    public long getVerlopenSeconden() {
        long elapsedTime;
        if (stopWatchRunning)
            elapsedTime = (System.nanoTime() - stopWatchStartTime);
        else
            elapsedTime = (stopWatchStopTime - stopWatchStartTime);

        return elapsedTime / NANO_SECS_PER_SEC;
    }
}
