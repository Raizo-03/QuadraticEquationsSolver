package com.example.quadraticequationsolverapp;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.quadraticequationsolverapp.databinding.ActivityMainBinding;

public class MyEquation extends BaseObservable {
    String a,b,c;

    ActivityMainBinding binding;


    public MyEquation(ActivityMainBinding binding) {
        this.binding = binding;
    }
    public MyEquation(){

    }
    @Bindable // Makes the variable observable or to observe changes of the variable
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Bindable // Makes the variable observable or to observe changes of the variable
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }


    @Bindable // Makes the variable observable or to observe changes of the variable
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void SolveEquation(View view){
        int a = Integer.parseInt(getA());
        int b = Integer.parseInt(getB());
        int c = Integer.parseInt(getC());

        //Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        //Finding the roots
        double x1, x2;
        if (discriminant > 0) {
            //Two real & distinct roots
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            binding.tvResult.setText(x1 + ", " + x2);
        }else if(discriminant < 0){
            //no real roots/ complex roots
            binding.tvResult.setText("No real roots");
        }else{
            //one real solution
            x1 = -b / (2 * a);
            binding.tvResult.setText("One real solution: " + x1);
        }

    }
}
