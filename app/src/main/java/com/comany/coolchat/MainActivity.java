package com.comany.coolchat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.comany.coolchat.adapter.MessageAdapter;
import com.comany.coolchat.model.AwesomeMessage;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private ListView messageListView;
private MessageAdapter messageAdapter;
private ProgressBar progressBar;
private ImageButton sendImageButton;
private Button sendMessageButton;
private EditText messageEditText;
private String userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = findViewById(R.id.progressBar);
        sendImageButton = findViewById(R.id.sendPhotoButton);
        sendMessageButton = findViewById(R.id.sendMessageButton);
        messageEditText = findViewById(R.id.messageEditText);



        userName = "Default User";
        messageListView = findViewById(R.id.messageListView);
        List <AwesomeMessage> messages = new ArrayList<>();
        messageAdapter = new MessageAdapter(this,R.layout.message_item,messages);
        progressBar.setVisibility(ProgressBar.INVISIBLE);


    }
}