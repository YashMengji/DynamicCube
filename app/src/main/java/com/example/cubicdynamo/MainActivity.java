package com.example.cubicdynamo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    Button xButton,yButton,zButton,sButton,tButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xButton = findViewById(R.id.xButton);
        yButton = findViewById(R.id.yButton);
        zButton = findViewById(R.id.zButton);
        sButton = findViewById(R.id.sButton);
        tButton = findViewById(R.id.tButton);
        videoView = findViewById(R.id.videoView);// Ge-+t a reference to the videoView in your layout

        xButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.x;// Define the path to your MP4 video file
                videoView.setVideoURI(Uri.parse(videoPath1));// Set the video URI
                videoView.start();  // Start video playback
            }
        });

        yButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String videoPath2 = "android.resource://" + getPackageName() + "/" + R.raw.y;// Define the path to your MP4 video file
                videoView.setVideoURI(Uri.parse(videoPath2));// Set the video URI
                videoView.start();  // Start video playback
            }
        });

        zButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String videoPath3 = "android.resource://" + getPackageName() + "/" + R.raw.z;// Define the path to your MP4 video file
                videoView.setVideoURI(Uri.parse(videoPath3));// Set the video URI
                videoView.start();  // Start video playback
            }
        });

        sButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String videoPath4 = "android.resource://" + getPackageName() + "/" + R.raw.s;// Define the path to your MP4 video file
                videoView.setVideoURI(Uri.parse(videoPath4));// Set the video URI
                videoView.start();  // Start video playback
            }
        });

        tButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String videoPath5 = "android.resource://" + getPackageName() + "/" + R.raw.t;// Define the path to your MP4 video file
                videoView.setVideoURI(Uri.parse(videoPath5));// Set the video URI
                videoView.start();  // Start video playback
            }
        });


    }
}