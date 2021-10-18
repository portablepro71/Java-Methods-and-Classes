package com.example.methods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//THESE ALL CODES FOR JUST TRAINING.
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("On create section");
        System.out.println(plus(5,19));
        Sınıf ogrenci = new Sınıf("Mehmet","Yılmaz",69);
        Sınıf ogrenci1 = new Sınıf("Selahattin","Tutkun",89);
        Sınıf ogrenci2 = new Sınıf("Ahmet Berke","Tekerci",50);
        Sınıf ogrenci3 = new Sınıf("Ismail","Sanlav",12);

        System.out.println(ogrenci.getIsim());
        ogrenci.setIsim("Mahmut");
        System.out.println(ogrenci.getIsim());

    }

    public int plus(int a,int b){
        return a+b;
    }
    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("On start section");
    }
    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("On resume section");
    }
    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("On pause section");
    }
    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("On stop section");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("On destroy section");
    }
}