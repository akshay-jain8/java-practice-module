package com.softdebugs.javapracticemodule.repository;

import com.softdebugs.javapracticemodule.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByStudentName(String studentName);

    //or (JPQL Query)
    @Query("Select s from Student s where s.studentName = :n")
    Student searchByStudentName(@Param("n") String studentName);

    //Or (Native Query)
    @Query(value = "Select * from Student s where s.studentName = :n", nativeQuery = true)
    Student getByStudentName(@Param("n") String studentName);

}
