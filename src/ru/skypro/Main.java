package ru.skypro;

import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();


    public static void main(String[] args) {
        GriffindorStudent harry = new GriffindorStudent("����� ������", generate(), generate(), generate(), generate(), generate());
        GriffindorStudent ron = new GriffindorStudent("��� �����", generate(), generate(), generate(), generate(), generate());
        RavenclawStudent luna = new RavenclawStudent("������� ������", generate(), generate(), generate(), generate(), generate(), generate());
        SlytherinStudent draco = new SlytherinStudent("����� ������", generate(), generate(), generate(), generate(), generate(), generate(), generate());
        HufflepuffStudent sedric = new HufflepuffStudent("������ �������", generate(), generate(), generate(), generate(), generate());

        System.out.println(harry);
        System.out.println(ron);
        System.out.println(luna);
        System.out.println(draco);
        System.out.println(sedric);

        harry.compareHogwarts(draco);
        harry.compareGriffindor(ron);


    }


    private static int generate() {
        return RANDOM.nextInt(100);
    }
}