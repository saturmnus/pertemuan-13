package com.example.recyclerview;

public class Student {
    private String nim;
    private String name;
    private String email;
    private String birthDate;

    public Student(String nim, String name, String email, String birthDate) {
        this.nim = nim;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getNim() {
        return nim;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
