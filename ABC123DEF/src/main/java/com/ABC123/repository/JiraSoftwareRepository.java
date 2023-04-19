package com.ABC123.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ABC123.model.JiraSoftware;

@Repository
public interface JiraSoftwareRepository extends JpaRepository<JiraSoftware, Long> {
    JiraSoftware findByUserName(String userName);
    JiraSoftware findByUrl(String url);
    Boolean existsByUserName(String userName);
    Boolean existsByUrl(String url);
    void deleteByUserName(String userName);
    void deleteByUrl(String url);
}