package _java.Java8;

import java.util.List;
import java.util.stream.Collectors;

public class MethodAndConstructorReference {
    static void print(String s) {
        System.out.println(s);
    }

    void printUpperCase(String s) {
        System.out.println(s.toUpperCase());
    }

    public static void main(String[] args) {
        List<String> students = List.of("Vishal", "Vinod", "Arun");
        MethodAndConstructorReference methodAndConstructorReference = new MethodAndConstructorReference();

        // students.forEach(x -> System.out.println(x));
        // Method Reference
        students.forEach(MethodAndConstructorReference::print);

        // students.forEach(x -> System.out.println(x.toUpperCase()));
        students.forEach(methodAndConstructorReference::printUpperCase);

        // Constructor Reference
        // List<Employee> employees = students.stream().map(x -> new
        // Employee(x)).collect(Collectors.toList());
        List<Employee> employees = students.stream().map(Employee::new).collect(Collectors.toList());
        System.out.println(employees);
    }

    static class Employee {
        String name;

        Employee(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee - " + name;
        }
    }
}
