package com.cgblearn.extend.exercise;

public class ExtendExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("intel",16,500,"ibm");
        pc.printInfo();
        NotePad notePad = new NotePad("intel",16,500,"green");
        notePad.printInfo();
    }
}

