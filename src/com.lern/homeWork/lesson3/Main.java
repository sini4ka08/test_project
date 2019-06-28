package com.lern.homeWork.lesson3;

public class Main {

    public static void main(String[] args) {

        Student ivanov = new Student("Ivanov", 30);
        Student student = new Student();
        Student student2 = new Student(20);
        Student student3 = new Student("Vasia");
        // student.show();

        student.setName("sinicina");
        student.setAge(ivanov.getAge());
        student2=student;
        // student2.show();

        student.setCourse(3);
        // student.show();
        // student2.show(); раскаментировать эти строки.

        student2.balls=new int[10];
        student2.balls[0]=5;
        student2.show();

        Prepod prep=new Prepod("Ivan","proffesor",5);
        prep.addStudent(student);
        prep.addStudent(student2);
        prep.addStudent(student3);
        prep.addStudent(ivanov);

        System.out.println(prep.getCountStudent());
        System.out.println(prep.getMaxCount());
        System.out.println(prep);
        System.out.println(ivanov);
        student2.setAge(32);
        System.out.println(prep);
        System.out.println(student2.getCountStudent());

        Animals cat = new Animals();
        cat.setName("Marusia");
        cat.setAge(7);
        cat.setWeight(10);
        cat.setHeight(30);
        Animals dog = new Animals("Caezar", 9, 3, 15);
        Animals tiger = new Animals("Tigrulia", 5, 30, 50);
        cat.show();
        dog.show();
        tiger.show();

        System.out.println("cat == dog: " + cat.equals(dog));
        System.out.println("cat == tiger: " + cat.equals(tiger));

        System.out.println("Поля объекта в сравнении с пороговыми значениями - cat - " + cat.equalsPorog());
        System.out.println("Поля объекта в сравнении с пороговыми значениями - dog - " + dog.equalsPorog());
        System.out.println("Поля объекта в сравнении с пороговыми значениями - tiger - " + tiger.equalsPorog());
    }

}
