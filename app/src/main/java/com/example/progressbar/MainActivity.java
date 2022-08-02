package com.example.progressbar;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.progressbar.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;

    public void download(View view) {
        long millisInFuture;
        CountDownTimer countDownTimer = new CountDownTimer(millisInFuture; Object countDownInterval;
        10000, countDownInterval);

        int current = progressBar.getProgress();
        int secondsCurrent = progressBar.getSecondaryProgress();
        if (current < progressBar.getMax()) {

           progressBar.setProgress(current + 10);
        } else {
            progressBar.setProgress(0);
        }
        if (secondsCurrent < progressBar.getMax()) {
            progressBar.setSecondaryProgress(current + 5);
        } else {
            progressBar.setSecondaryProgress(0);

        }

        Toast.makeText(MainActivity.this, "Finish",Toast.LENGTH_SHORT ).show();

        countDownTimer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        @NonNull ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        progressBar = findViewById(R.id.progressBar);


    }
}