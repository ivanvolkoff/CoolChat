package com.comany.coolchat.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.comany.coolchat.R;
import com.comany.coolchat.model.AwesomeMessage;

import java.util.List;

public class MessageAdapter extends ArrayAdapter<AwesomeMessage> {
    public MessageAdapter(Context context, int resource, List<AwesomeMessage> messages) {
        super(context, resource);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        if(convertView == null){
            convertView = ((Activity)getContext()).getLayoutInflater().inflate(R.layout.message_item,parent,false);
        }
        ImageView photoImageView = convertView.findViewById(R.id.photoImageView);
        TextView textView = convertView.findViewById(R.id.text1TextView);
        TextView nameTextView = convertView.findViewById(R.id.text2TextView);

        AwesomeMessage message = getItem(position);
        boolean isText = message.getImageUrl() == null;
        if(isText){
            textView.setVisibility(View.VISIBLE);
            photoImageView.setVisibility(View.GONE);
            textView.setText(message.getText());
        }
        else{
            textView.setVisibility(View.GONE);
            photoImageView.setVisibility(View.VISIBLE);
            Glide.with(photoImageView.getContext()).load(message.getImageUrl()).into(photoImageView);
        }
        nameTextView.setText(message.getName());
        return convertView;
    }
}
