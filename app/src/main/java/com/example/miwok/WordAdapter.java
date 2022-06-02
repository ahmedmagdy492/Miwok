package com.example.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;

import java.util.List;


public class WordAdapter extends ArrayAdapter<Word> {

    private final Context context;
    private List<Word> words;

    public WordAdapter(Context context, List<Word> words) {
        super(context, 0, words);
        this.context = context;
        this.words = words;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Word word = getItem(position);

        if(convertView == null) {
            // check if we are using an already created view or not
            convertView = LayoutInflater.from(context).inflate(R.layout.miwok_listview_item, parent, false);
        }

        TextView miwokTxtView = convertView.findViewById(R.id.miwok_word);
        miwokTxtView.setText(word.getMiwokTranslation());

        TextView defaultTxtView = convertView.findViewById(R.id.eng_word);
        defaultTxtView.setText(word.getDefaultTranslation());

        ImageView imgView = convertView.findViewById(R.id.word_img);
        imgView.setImageResource(word.getImage());

        return convertView;
    }
}
