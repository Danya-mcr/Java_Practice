package org.example.SolutionToTheCloneProblem;

public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();

        try {
            Singleton s2 = (Singleton) s1.clone();

            System.out.println("Singleton клонировался");
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }
}