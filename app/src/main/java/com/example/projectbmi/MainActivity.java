package com.example.projectbmi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText tinggi;
    private EditText bobot;
    private EditText umur;
    private EditText goal;
    private RadioGroup rgGender;
    private RadioButton rdGender;
    private ImageButton btn_tambah_tinggi, btn_kurang_tinggi, btn_tambah_berat,btn_kurang_berat, btn_tambah_goal, btn_kurang_goal, btn_tambah_umur, btn_kurang_umur;

    int tampilBerat, tampilTinggi, tampilUmur, tampilGoal, tes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tinggi = (EditText) findViewById(R.id.inputTinggi);
        bobot = (EditText) findViewById(R.id.inputBerat);
        umur = (EditText) findViewById(R.id.inputUmur);
        goal = (EditText) findViewById(R.id.inputGoal);
        setBtnTinggiVisible();
        setBtnBeratVisible();
        setBtnGoalVisible();
        setBtnUmurVisible();
    }

    private void setBtnUmurVisible() {
        btn_tambah_umur = (ImageButton) findViewById(R.id.tambahUmur);
        btn_tambah_umur.setVisibility(View.INVISIBLE);
        btn_kurang_umur = (ImageButton) findViewById(R.id.kurangUmur);
        btn_kurang_umur.setVisibility(View.INVISIBLE);

        umur.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if(hasFocus) {
                    btn_tambah_tinggi.setVisibility(View.INVISIBLE);
                    btn_kurang_tinggi.setVisibility(View.INVISIBLE);
                    btn_tambah_berat.setVisibility(View.INVISIBLE);
                    btn_kurang_berat.setVisibility(View.INVISIBLE);
                    btn_tambah_umur.setVisibility(View.VISIBLE);
                    btn_kurang_umur.setVisibility(View.VISIBLE);
                    btn_tambah_goal.setVisibility(View.INVISIBLE);
                    btn_kurang_goal.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    private void setBtnGoalVisible() {
        btn_tambah_goal = (ImageButton) findViewById(R.id.tambahGoal);
        btn_tambah_goal.setVisibility(View.INVISIBLE);
        btn_kurang_goal = (ImageButton) findViewById(R.id.kurangGoal);
        btn_kurang_goal.setVisibility(View.INVISIBLE);

        goal.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if(hasFocus) {
                    btn_tambah_tinggi.setVisibility(View.INVISIBLE);
                    btn_kurang_tinggi.setVisibility(View.INVISIBLE);
                    btn_tambah_berat.setVisibility(View.INVISIBLE);
                    btn_kurang_berat.setVisibility(View.INVISIBLE);
                    btn_tambah_umur.setVisibility(View.INVISIBLE);
                    btn_kurang_umur.setVisibility(View.INVISIBLE);

                    btn_tambah_goal.setVisibility(View.VISIBLE);
                    btn_kurang_goal.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    private void setBtnBeratVisible() {
        btn_tambah_berat = (ImageButton) findViewById(R.id.tambahBerat);
        btn_tambah_berat.setVisibility(View.INVISIBLE);
        btn_kurang_berat = (ImageButton) findViewById(R.id.kurangBerat);
        btn_kurang_berat.setVisibility(View.INVISIBLE);

        bobot.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if(hasFocus) {
                    btn_tambah_tinggi.setVisibility(View.INVISIBLE);
                    btn_kurang_tinggi.setVisibility(View.INVISIBLE);
                    btn_tambah_berat.setVisibility(View.VISIBLE);
                    btn_kurang_berat.setVisibility(View.VISIBLE);
                    btn_tambah_umur.setVisibility(View.INVISIBLE);
                    btn_kurang_umur.setVisibility(View.INVISIBLE);
                    btn_tambah_goal.setVisibility(View.INVISIBLE);
                    btn_kurang_goal.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    private void setBtnTinggiVisible() {
        btn_tambah_tinggi = (ImageButton) findViewById(R.id.tambahTinggi);
        btn_tambah_tinggi.setVisibility(View.INVISIBLE);
        btn_kurang_tinggi = (ImageButton) findViewById(R.id.kurangTinggi);
        btn_kurang_tinggi.setVisibility(View.INVISIBLE);

        tinggi.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if(hasFocus) {
                    btn_tambah_tinggi.setVisibility(View.VISIBLE);
                    btn_kurang_tinggi.setVisibility(View.VISIBLE);
                    btn_tambah_berat.setVisibility(View.INVISIBLE);
                    btn_kurang_berat.setVisibility(View.INVISIBLE);
                    btn_tambah_umur.setVisibility(View.INVISIBLE);
                    btn_kurang_umur.setVisibility(View.INVISIBLE);
                    btn_tambah_goal.setVisibility(View.INVISIBLE);
                    btn_kurang_goal.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    public void krgBerat(View view)
    {
        tampilBerat = tampilBerat - 1;
        displayBerat(tampilBerat);
    }

    public void tmbBerat(View view)
    {
        tampilBerat = tampilBerat + 1;
        displayBerat(tampilBerat);
    }

    private void displayBerat(int number) {
        EditText inputBerat = (EditText) findViewById(R.id.inputBerat);
        inputBerat.setText(""+number);
    }

    public void krgTinggi(View view)
    {
        tampilTinggi = tampilTinggi - 1;
        displayTinggi(tampilTinggi);
    }

    public void tmbTinggi(View view)
    {
        tampilTinggi = tampilTinggi + 1;
        displayTinggi(tampilTinggi);
    }

    private void displayTinggi(int number) {
        EditText inputTinggi = (EditText) findViewById(R.id.inputTinggi);
        inputTinggi.setText(""+number);
    }

    public void krgGoal(View view)
    {
        tampilGoal = tampilGoal - 1;
        displayGoal(tampilGoal);
    }

    public void tmbGoal(View view)
    {
        tampilGoal = tampilGoal + 1;
        displayGoal(tampilGoal);
    }

    private void displayGoal(int number) {
        EditText inputGoal = (EditText) findViewById(R.id.inputGoal);
        inputGoal.setText(""+number);
    }

    public void krgUmur(View view)
    {
        tampilUmur = tampilUmur - 1;
        displayUmur(tampilUmur);
    }

    public void tmbUmur(View view)
    {
        tampilUmur = tampilUmur + 1;
        displayUmur(tampilUmur);
    }

    private void displayUmur(int number) {
        EditText inputUmur = (EditText) findViewById(R.id.inputUmur);
        inputUmur.setText(""+number);
    }

    public void calculateBMI(View view){
        String tinggiStr = tinggi.getText().toString();
        String bobotStr = bobot.getText().toString();
        if(tinggiStr != null && !"".equals(tinggiStr) && bobotStr != null && !"".equals(bobotStr)){
            float tinggiValue = Float.parseFloat(tinggiStr) / 100;
            float bobotValue = Float.parseFloat(bobotStr);

            float bmi = bobotValue / (tinggiValue * tinggiValue);
            displayBMI(bmi);
        }
    }

    private void displayBMI(float bmi){
        rgGender = (RadioGroup) findViewById(R.id.pilihGender);
        int pilihGender = rgGender.getCheckedRadioButtonId();
        rdGender = (RadioButton) findViewById(pilihGender);

        String bmiLabel = "";
        String infoUmur = umur.getText().toString();
        String infoGoal = goal.getText().toString();
        if(Float.compare(bmi, 15f) <= 0){
            bmiLabel = getString(R.string.terlalu_sangat_kurus);
        }else if(Float.compare(bmi, 15f) > 0 && Float.compare(bmi, 16f) <= 0){
            bmiLabel = getString(R.string.sangat_kurus);
        }else if(Float.compare(bmi, 16f) > 0 && Float.compare(bmi, 18.5f) <= 0){
            bmiLabel = getString(R.string.kurus);
        }else if(Float.compare(bmi, 18.5f) > 0 && Float.compare(bmi, 25f) <= 0){
            bmiLabel = getString(R.string.normal);
        }else if(Float.compare(bmi, 25f) > 0 && Float.compare(bmi, 30f) <= 0){
            bmiLabel = getString(R.string.gemuk);
        }else if(Float.compare(bmi, 30f) > 0 && Float.compare(bmi, 35f) <= 0){
            bmiLabel = getString(R.string.cukup_gemuk);
        }else if(Float.compare(bmi, 35f) > 0 && Float.compare(bmi, 40f) <= 0){
            bmiLabel = getString(R.string.sangat_gemuk);
        }else{
            bmiLabel = getString(R.string.terlalu_sangat_gemuk);
        }
        bmiLabel = "Jenis kelamin: " +  rdGender.getText() + "\n\n" + "Hasil Penghitungan BMI : " + bmi + " --- " +  "Kategori: " + "(" + bmiLabel + ")" + "\n\n"     + "Umur : " + infoUmur + "\n\n" + "Goal : " + infoGoal ;
        AlertDialog.Builder tampilBMI = new AlertDialog.Builder(this);

        tampilBMI.setTitle("Hasil Penghitunan BMI");

        tampilBMI.setMessage(bmiLabel).setNeutralButton("Tutup", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        AlertDialog alertDialog = tampilBMI.create();
        alertDialog.show();
    }

    public void refreshValue(View view){
        displayTinggi(0);
        displayBerat(0);
        displayUmur(0);
        displayGoal(0);
    }
}