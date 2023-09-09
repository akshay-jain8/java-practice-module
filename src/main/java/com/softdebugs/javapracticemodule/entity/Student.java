package com.softdebugs.javapracticemodule.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String studentName;

    @OneToMany(mappedBy = "student",
    cascade = CascadeType.ALL,
    orphanRemoval = true)
    private List<Book> books;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName +
                "'}";
    }
}

