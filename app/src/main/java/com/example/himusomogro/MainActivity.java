package com.example.himusomogro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    ShapeableImageView Himur_Biye,Himur_moddodupur,Himusomgro,Nil_joshona,Himusomgro2,Mouirakkhi;

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Himur_Biye=findViewById(R.id.himurBiyeID);
        Himur_moddodupur= findViewById(R.id.moddodupurId);
        Himusomgro=findViewById(R.id.himusomgroId);
        Nil_joshona=findViewById(R.id.nilljonsonaId);
        Himusomgro2= findViewById(R.id.himusomgroId2);
        Mouirakkhi= findViewById(R.id.mouirakkhiId);

        drawerLayout = findViewById(R.id.drawerLayoutID);
        navigationView = findViewById(R.id.navigation_drawerId);

        //drawerLayout

        toggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.start,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);









        //Book number = 1;

        Himur_Biye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("Book","Himur_Biye.pdf");
                startActivity(intent);

            }
        });

        //Book number = 2;
        Himur_moddodupur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("Book","HimurModdo_Dupur.pdf");
                startActivity(intent);

            }
        });

        //Book number = 3;

        Himusomgro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("Book","himusomgro1.pdf");
                startActivity(intent);

            }
        });


        //Book number = 4;
        Nil_joshona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("Book","HimurNil_Joshona.pdf");
                startActivity(intent);

            }
        });




        //Book number = 5;
        Himusomgro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("Book","Himusomgro2.pdf");
                startActivity(intent);

            }
        });


        //Book number = 6;
        Mouirakkhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("Book","Moyurakkhi.pdf");
                startActivity(intent);

            }
        });




    }

     // option menu

 /*   public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.navigation_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
/*




  /*  //@Override
   public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.AboutId:
                Intent intent = new Intent(this, OptionActivity.class);
                startActivity(intent);
                return true;


            default:
                return super.onOptionsItemSelected(item);
        }
    }

   */
   public boolean onOptionItemSelected(MenuItem item){

       if(toggle.onOptionsItemSelected(item))
       {
           return true;
       }
       return super.onOptionsItemSelected(item);
   }




}