package howloud.decibels.com.howloud.feature;

import android.media.MediaRecorder;

import java.io.IOException;

public final class Audio {
    private MediaRecorder recorder = new MediaRecorder();

    public Audio() throws IOException {
        recorder.prepare();
    }

    public void start() {
        recorder.start();
    }

    public void stop() {
        recorder.stop();
    }

    public void release() {
        recorder.release();
    }

    private int getMaximumAmplitude() {
        return recorder.getMaxAmplitude();
    }

    // dummy function
    public double getVolume() {
        return 99999;
    }
}
