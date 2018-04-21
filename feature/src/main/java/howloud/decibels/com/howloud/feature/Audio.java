package howloud.decibels.com.howloud.feature;

import android.media.MediaRecorder;

import java.io.File;
import java.io.IOException;

public final class Audio {
    private MediaRecorder recorder;

    public Audio() throws IOException {
        recorder = new MediaRecorder();
        recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
        recorder.setAudioEncoder(MediaRecorder.OutputFormat.AMR_NB);
        //File temp = File.createTempFile("dec", "dec");
        recorder.setOutputFile("/dev/null");//temp.getAbsolutePath());
        recorder.prepare();
    }

    public void start() {
        recorder.start();
    }

    public void stop() {
        try {
            recorder.stop();
        } catch (RuntimeException e) {

        }
    }

    public void release() {
        recorder.release();
    }

    //public

    //public void ondataavailable() {
 //       recorder.ondataavailable();
  //  }

//    private int getMaximumAmplitude() {
//        return recorder.getMaxAmplitude();
//    }


    // not sure about the 2700.0 thing but I found it on stackoverflow
    public double getVolume() {
        return 20 * Math.log10(recorder.getMaxAmplitude() / 2700.0);
    }
}
