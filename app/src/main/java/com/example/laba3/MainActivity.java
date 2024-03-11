package com.example.laba3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private Button buttonLog;
    private TextView textViewLogs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLog = findViewById(R.id.buttonLog);
        textViewLogs = findViewById(R.id.textViewLogs);

        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showLogs();
            }
        });
    }

    private void showLogs() {
        Log.v(TAG, "This is a verbose message");
        Log.d(TAG, "This is a debug message");
        Log.i(TAG, "This is an informational message");
        Log.w(TAG, "This is a warning message");
        Log.e(TAG, "This is an error message");

        StringBuilder sbLogs = new StringBuilder();
        sbLogs.append("Logs:");
        sbLogs.append("\n");
        appendLog(sbLogs, "Verbose", TAG, "This is a verbose message");
        appendLog(sbLogs, "Debug", TAG, "This is a debug message");
        appendLog(sbLogs, "Information", TAG, "This is an informational message");
        appendLog(sbLogs, "Warning", TAG, "This is a warning message");
        appendLog(sbLogs, "Error", TAG, "This is an error message");

        textViewLogs.setText(sbLogs.toString());
    }

    private void appendLog(StringBuilder sbLogs, String level, String tag, String message) {
        sbLogs.append(level);
        sbLogs.append(": ");
        sbLogs.append(tag);
        sbLogs.append(" - ");
        sbLogs.append(message);
        sbLogs.append("\n");
    }
}