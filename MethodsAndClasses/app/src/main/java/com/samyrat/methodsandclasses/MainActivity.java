package com.samyrat.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("on create called");
        TestMethod();

        System.out.println(math(3,5));

        System.out.println(newMethod("Sammy"));

        username = "";

        System.out.println(username);

        mekaMusicians();
        makeSimpsons();
    }

    public void makeSimpsons(){

        Simpsons homer = new Simpsons("Homer",50,"Nucler");

        homer.setAge(51);
        homer.setJob("Atom");
        homer.setName("Homer Simpson");
        System.out.println(homer.getAge());
        System.out.println(homer.getJob());
        System.out.println(homer.getName());

    }

    public void mekaMusicians(){
        //instance

        Musicinas james = new Musicinas("James","Guitar",50);
        System.out.println(james.age);
        System.out.println(james.instrument);
        System.out.println(james.name);

        // yukardaki aynisi
        james.age = 50;
        james.instrument = "Guitar";
        james.name = "James";


    }




    public void TestMethod(){
        username = "Lars";
        System.out.println(username);
        int a = 4+4;
        System.out.println("value of a:" + a);
        
    }
    public int math(int a, int b){
        username = "Kirk";
        System.out.println(username);

        return a+b;
    }

    public String newMethod(String string ){
        username = "Rob";
        System.out.println(username);
       return string +" new Method";
    }



    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on resume called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("on stop called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("on pause called");
    }
}