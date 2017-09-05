package com.example.joeribes.joeribes_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;






public class MainActivity extends AppCompatActivity {

    private View Arms, Ears, Eyebrows, Eyes, Glasses, Hat, Mouth, Mustache, Nose, Shoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize objects
        Arms = (ImageView) findViewById(R.id.arms);
        Ears = (ImageView) findViewById(R.id.ears);
        Eyebrows = (ImageView) findViewById(R.id.eyebrows);
        Eyes =  (ImageView) findViewById(R.id.eyes);
        Glasses = (ImageView) findViewById(R.id.glasses);
        Hat = (ImageView) findViewById(R.id.hat);
        Mouth = (ImageView) findViewById(R.id.mouth);
        Mustache = (ImageView) findViewById(R.id.mustache);
        Nose = (ImageView) findViewById(R.id.nose);
        Shoes = (ImageView) findViewById(R.id.shoes);


    }

    public void checkboxClicked(View view) {
        // Check whether a checkBox is checked
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox1:
                if (checked) {
                    Arms.setVisibility(View.VISIBLE);
                }
                else {
                    Arms.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox2:
                if (checked) {
                    Ears.setVisibility(View.VISIBLE);
                }
                else {
                    Ears.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox3:
                if (checked) {
                    Eyebrows.setVisibility(View.VISIBLE);
                }
                else {
                    Eyebrows.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox4:
                if (checked) {
                    Eyes.setVisibility(View.VISIBLE);
                }
                else {
                    Eyes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox5:
                if (checked) {
                    Glasses.setVisibility(View.VISIBLE);
                }
                else {
                    Glasses.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox6:
                if (checked) {
                    Hat.setVisibility(View.VISIBLE);
                }
                else {
                    Hat.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox7:
                if (checked) {
                    Mouth.setVisibility(View.VISIBLE);
                }
                else {
                    Mouth.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox8:
                if (checked) {
                    Mustache.setVisibility(View.VISIBLE);
                }
                else {
                    Mustache.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox9:
                if (checked) {
                    Nose.setVisibility(View.VISIBLE);
                }
                else {
                    Nose.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox10:
                if (checked) {
                    Shoes.setVisibility(View.VISIBLE);
                }
                else {
                    Shoes.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Check if the Images/Views are visible
        int armsVisibility = Arms.getVisibility();
        int earsVisibility = Ears.getVisibility();
        int eyebrowsVisibility = Eyebrows.getVisibility();
        int eyesVisibility = Eyes.getVisibility();
        int glassesVisibility = Glasses.getVisibility();
        int hatVisibility = Hat.getVisibility();
        int mouthVisibility = Mouth.getVisibility();
        int mustacheVisibility = Mustache.getVisibility();
        int noseVisibility = Nose.getVisibility();
        int shoesVisibility = Shoes.getVisibility();

        // Use states for visibility
        outState.putInt("arms", armsVisibility);
        outState.putInt("ears", earsVisibility);
        outState.putInt("eyebrows", eyebrowsVisibility);
        outState.putInt("eyes", eyesVisibility);
        outState.putInt("glasses", glassesVisibility);
        outState.putInt("hat", hatVisibility);
        outState.putInt("mouth", mouthVisibility);
        outState.putInt("mustache", mustacheVisibility);
        outState.putInt("nose", noseVisibility);
        outState.putInt("shoes", shoesVisibility);
    }

    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        // Check if the View is in a state
        int armsVisibility = inState.getInt("arms");
        int earsVisibility = inState.getInt("ears");
        int eyebrowsVisibility = inState.getInt("eyebrows");
        int eyesVisibility = inState.getInt("eyes");
        int glassesVisibility = inState.getInt("glasses");
        int hatVisibility = inState.getInt("hat");
        int mouthVisibility = inState.getInt("mouth");
        int mustacheVisibility = inState.getInt("mustache");
        int noseVisibility = inState.getInt("nose");
        int shoesVisibility = inState.getInt("shoes");

        // Set the visibility of the old state
        Arms.setVisibility(armsVisibility);
        Ears.setVisibility(earsVisibility);
        Eyebrows.setVisibility(eyebrowsVisibility);
        Eyes.setVisibility(eyesVisibility);
        Glasses.setVisibility(glassesVisibility);
        Hat.setVisibility(hatVisibility);
        Mouth.setVisibility(mouthVisibility);
        Mustache.setVisibility(mustacheVisibility);
        Nose.setVisibility(noseVisibility);
        Shoes.setVisibility(shoesVisibility);
    }


}
