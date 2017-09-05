package com.example.joeribes.joeribes_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import static com.example.joeribes.joeribes_pset1.R.drawable.arms;




public class MainActivity extends AppCompatActivity {

    private ImageView arms, ears, eyebrows, eyes, glasses, hat, mouth, mustache, nose, shoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize values
        ImageView arms = (ImageView) findViewById(R.id.arms);
        
    }

    public void checkboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox1:
                if (checked) {
                    ImageView imgView = (ImageView) findViewById(R.id.arms);
                    imgView.setVisibility(View.VISIBLE);
                }
                else {
                    ImageView imgView = (ImageView) findViewById(R.id.arms);
                    imgView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox2:
                if (checked) {
                    ImageView imgView = (ImageView) findViewById(R.id.ears);
                    imgView.setVisibility(View.VISIBLE);
                }
                else {
                    ImageView imgView = (ImageView) findViewById(R.id.ears);
                    imgView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox3:
                if (checked) {
                    ImageView imgView = (ImageView) findViewById(R.id.eyebrows);
                    imgView.setVisibility(View.VISIBLE);
                }
                else {
                    ImageView imgView = (ImageView) findViewById(R.id.eyebrows);
                    imgView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox4:
                if (checked) {
                    ImageView imgView = (ImageView) findViewById(R.id.eyes);
                    imgView.setVisibility(View.VISIBLE);
                }
                else {
                    ImageView imgView = (ImageView) findViewById(R.id.eyes);
                    imgView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox5:
                if (checked) {
                    ImageView imgView = (ImageView) findViewById(R.id.glasses);
                    imgView.setVisibility(View.VISIBLE);
                }
                else {
                    ImageView imgView = (ImageView) findViewById(R.id.glasses);
                    imgView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox6:
                if (checked) {
                    ImageView imgView = (ImageView) findViewById(R.id.hat);
                    imgView.setVisibility(View.VISIBLE);
                }
                else {
                    ImageView imgView = (ImageView) findViewById(R.id.hat);
                    imgView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox7:
                if (checked) {
                    ImageView imgView = (ImageView) findViewById(R.id.mouth);
                    imgView.setVisibility(View.VISIBLE);
                }
                else {
                    ImageView imgView = (ImageView) findViewById(R.id.mouth);
                    imgView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox8:
                if (checked) {
                    ImageView imgView = (ImageView) findViewById(R.id.mustache);
                    imgView.setVisibility(View.VISIBLE);
                }
                else {
                    ImageView imgView = (ImageView) findViewById(R.id.mustache);
                    imgView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox9:
                if (checked) {
                    ImageView imgView = (ImageView) findViewById(R.id.nose);
                    imgView.setVisibility(View.VISIBLE);
                }
                else {
                    ImageView imgView = (ImageView) findViewById(R.id.nose);
                    imgView.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox10:
                if (checked) {
                    ImageView imgView = (ImageView) findViewById(R.id.shoes);
                    imgView.setVisibility(View.VISIBLE);
                }
                else {
                    ImageView imgView = (ImageView) findViewById(R.id.shoes);
                    imgView.setVisibility(View.INVISIBLE);
                }
                break;


        }
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ImageView Arms = (ImageView) findViewById(R.id.arms);
        int armsVisibility = Arms.getVisibility();
        outState.putInt("nose", armsVisibility);


    }

    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);
        ImageView Arms = (ImageView) findViewById(R.id.arms);
        int armsVisibility = inState.getInt("arms");
        Arms.setVisibility(armsVisibility);
    }


}
