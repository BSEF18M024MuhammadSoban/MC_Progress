package com.example.myfirstapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PlayAlphabets extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_alphabet);
        mediaPlayer=MediaPlayer.create(this,R.raw.bg);
        mediaPlayer.setLooping(true);
        mediaPlayer.setVolume(0,0.2f);
        mediaPlayer.start();
    }
    @Override
    protected void onStop(){
        super.onStop();
        mediaPlayer.stop();
    }
    public void aClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.a1);
        mediaPlayer.start();
    }
    public void bClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.b1);
        mediaPlayer.start();
    }
    public void cClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.c1);
        mediaPlayer.start();
    }    public void dClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.d1);
        mediaPlayer.start();
    }    public void eClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.e1);
        mediaPlayer.start();
    }    public void fClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.f1);
        mediaPlayer.start();
    }    public void gClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.g1);
        mediaPlayer.start();
    }    public void hClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.h1);
        mediaPlayer.start();
    }    public void iClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.i1);
        mediaPlayer.start();
    }    public void jClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.j1);
        mediaPlayer.start();
    }    public void kClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.k1);
        mediaPlayer.start();
    }    public void lClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.l1);
        mediaPlayer.start();
    }    public void mClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.m1);
        mediaPlayer.start();
    }    public void nClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.n1);
        mediaPlayer.start();
    }    public void oClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.o1);
        mediaPlayer.start();
    }    public void pClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.p1);
        mediaPlayer.start();
    }    public void qClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.q1);
        mediaPlayer.start();
    }    public void rClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.r1);
        mediaPlayer.start();
    }    public void sClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.s1);
        mediaPlayer.start();
    }    public void tClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.t1);
        mediaPlayer.start();
    }    public void uClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.u1);
        mediaPlayer.start();
    }    public void vClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.v1);
        mediaPlayer.start();
    }    public void wClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.w1);
        mediaPlayer.start();
    }    public void xClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.x1);
        mediaPlayer.start();
    }    public void yClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.y1);
        mediaPlayer.start();
    }    public void zClicked(View view)
    {
        view.animate().rotationXBy(360).rotationYBy(360).setDuration(1000);
        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.z1);
        mediaPlayer.start();
    }


}
