package com.group.flatline;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashSet;

public class NoteEditor extends AppCompatActivity {
    int noteId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_editor);

        EditText editText = findViewById(R.id.editText);


        Intent intent = getIntent();


        noteId = intent.getIntExtra("noteId", -1);
        if (noteId != -1) {
            editText.setText((CharSequence) MainActivityJournal.notes.get(noteId));
        } else {

            MainActivityJournal.notes.add("");
            noteId = MainActivityJournal.notes.size() - 1;
            MainActivityJournal.arrayAdapter.notifyDataSetChanged();

        }

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // add your code here
            }
            @SuppressWarnings("unchecked")
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                MainActivityJournal.notes.set(noteId, String.valueOf(charSequence));
                MainActivityJournal.arrayAdapter.notifyDataSetChanged();

                SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("com.example.notes", Context.MODE_PRIVATE);
                @SuppressWarnings("rawtypes") HashSet<String> set = new HashSet(MainActivityJournal.notes);
                sharedPreferences.edit().putStringSet("notes", set).apply();
            }

            @Override
            public void afterTextChanged(Editable editable) {
                // add your code here
            }
        });
    }
}


