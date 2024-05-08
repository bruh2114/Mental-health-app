package com.group.flatline;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashSet;

public class MainActivityJournal extends AppCompatActivity {

    static ArrayList<Object> notes = new ArrayList<>();
    static ArrayAdapter<Object> arrayAdapter;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.add_note_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);

        if (item.getItemId() == R.id.add_note) {

            // Going from MainActivity to NotesEditorActivity
            Intent intent = new Intent(getApplicationContext(), NoteEditorActivity.class);
            startActivity(intent);
            return true;
        }

        return false;
    }
    @SuppressWarnings("unchecked")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_journal);

        ListView listView = findViewById(R.id.listView);
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("com.example.notes", Context.MODE_PRIVATE);
        HashSet<String> set = (HashSet<String>) sharedPreferences.getStringSet("notes", null);

        if (set == null) {

            notes.add("Example note");
        } else {
            notes = new ArrayList<>(set);
        }

        // Using custom listView Provided by Android Studio
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, notes);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {

            // Going from MainActivity to NotesEditorActivity
            Intent intent = new Intent(getApplicationContext(), NoteEditorActivity.class);
            intent.putExtra("noteId", i);
            startActivity(intent);

        });

        listView.setOnItemLongClickListener((adapterView, view, i, l) -> {

            final int itemToDelete = i;
            // To delete the data from the App
            new AlertDialog.Builder(MainActivityJournal.this)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .setTitle("Are you sure?")
                    .setMessage("Do you want to delete this note?")
                    .setPositiveButton("Yes", (dialogInterface, i1) -> {
                        notes.remove(itemToDelete);
                        arrayAdapter.notifyDataSetChanged();
                        SharedPreferences sharedPreferences1 = getApplicationContext().getSharedPreferences("com.example.notes", Context.MODE_PRIVATE);
                        @SuppressWarnings("rawtypes") HashSet<String> set1 = new HashSet(MainActivityJournal.notes);
                        sharedPreferences1.edit().putStringSet("notes", set1).apply();
                    }).setNegativeButton("No", null).show();
            return true;
        });
    }
}
