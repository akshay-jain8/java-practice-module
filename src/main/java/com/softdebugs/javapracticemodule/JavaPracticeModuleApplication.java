package com.softdebugs.javapracticemodule;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JavaPracticeModuleApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(JavaPracticeModuleApplication.class, args);
//        StudentRepository studentRepository = context.getBean(StudentRepository.class);
//
//        Student student = new Student();
//        String studentName = "Jimmy";
//
//        Book book1 = new Book();
//        String bookName = "Jam and honey";
//        book1.setBookName(bookName);
//        book1.setStudent(student);
//
//        Book book2 = new Book();
//        book2.setBookName("Cheers Joy");
//        book2.setStudent(student);
//
//        List<Book> bookList = new ArrayList<>();
//        bookList.add(book1);
//        bookList.add(book2);
//
//        student.setStudentName(studentName);
//        student.setBooks(bookList);
//
//        if(studentRepository.findByStudentName(studentName)==null){
//            studentRepository.save(student);
//            System.out.println(student);
//            System.out.println("\n"+student.getBooks());
//        }
//
//        Library library = new Library();
//        library.setLibraryId("LB-A4");
//        library.setLibrarian("Henry George");
//        book1.setLibrary(library);
//        book2.setLibrary(library);
//        library.setLibraryBooks(List.of(book1, book2));
//
//        LibraryRepository libraryRepository = context.getBean(LibraryRepository.class);
//        libraryRepository.save(library);

    }
}
