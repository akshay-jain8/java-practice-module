package com.softdebugs.javapracticemodule.repository;

import com.softdebugs.javapracticemodule.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<Library, String> {
}
