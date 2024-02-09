package com.tobeto.java3a.homework2.oop.oopdersi;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager{
    @Override
    public void calculate() {
        System.out.println("Öğretmen kredisi hesaplandi.");
    }
}
