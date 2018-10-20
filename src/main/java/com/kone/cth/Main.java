package com.kone.cth;

public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        Person p1 = FakeFrameWork.newInstance(Person.class);
        System.out.println("p1 :" + p1.getName());

        Person p2 = new Person();
        System.out.println("p2 :" + p2.getName());

        Employee e1 = FakeFrameWork.newInstance(Employee.class);
        System.out.println("e1 :" + e1.getName());

        Employee e2 = new Employee();
        System.out.println("e2 :" + e2.getName());


    }
}
