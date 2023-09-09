package com.softdebugs.javapracticemodule.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Library {
    @Id
    private String libraryId;
    private String librarian;
    @OneToMany (mappedBy = "library",
    cascade = CascadeType.ALL)
    private List<Book> libraryBooks;

    @Override
    public String toString() {
        return "Library{" +
                "libraryId='" + libraryId + '\'' +
                ", librarian='" + librarian + '\'' +
                '}';
    }
}
