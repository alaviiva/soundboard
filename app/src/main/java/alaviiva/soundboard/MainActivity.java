package alaviiva.soundboard;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    SoundPool sounds;

    int mooyadaa;
    int tindidi;
    int waay;
    int yadaa;
    int yatta;
    int haah;
    int ohoho;
    int otoosama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onStart() {
        super.onStart();

        AudioAttributes attributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_NOTIFICATION)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();

        sounds = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();

        sounds.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener(){
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                Log.d("kala", "load " + sampleId);
            }
        });

        mooyadaa = sounds.load(this, R.raw.iris_mooyyadaa, 1);
        tindidi = sounds.load(this, R.raw.iris_tindididiin, 1);
        waay = sounds.load(this, R.raw.iris_waywayyy, 1);
        yadaa = sounds.load(this, R.raw.iris_yaadaaa, 1);
        yatta = sounds.load(this, R.raw.iris_yatta, 1);
        haah = sounds.load(this, R.raw.sumire_haaaaaah, 1);
        ohoho = sounds.load(this, R.raw.sumire_ohohoho, 1);
        otoosama = sounds.load(this, R.raw.sumire_otoosama, 1);
    }

    @Override
    public void onStop() {
        super.onStop();
        sounds.release();
    }

    public void play(int id) {
        sounds.play(id, 1, 1, 1, 0, 1);
    }

    public void play_mooyadaa(View view) {
        play(mooyadaa);
    }
    public void play_tindidi(View view) {
        play(tindidi);
    }
    public void play_waay(View view) {
        play(waay);
    }
    public void play_yadaa(View view) {
        play(yadaa);
    }
    public void play_yatta(View view) {
        play(yatta);
    }
    public void play_ohoho(View view) {
        play(ohoho);
    }
    public void play_haah(View view) {
        play(haah);
    }
    public void play_otoosama(View view) {
        play(otoosama);
    }


}
