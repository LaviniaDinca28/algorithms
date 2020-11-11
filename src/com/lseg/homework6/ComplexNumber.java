package com.lseg.homework6;

public class ComplexNumber {

 private double real;
 private double imaginary;

 //constructor
    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){return real;}

    public double getImaginary(){return imaginary;}

    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;
        return temp;
    }

    public static ComplexNumber substract(ComplexNumber c1, ComplexNumber c2) {

        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.real = c1.real - c2.real;
        temp.imaginary = c1.imaginary - c2.imaginary;
        return temp;
    }
}
