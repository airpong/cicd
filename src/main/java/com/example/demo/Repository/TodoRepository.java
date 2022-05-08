package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import com.example.demo.Entity.MemoEntity;

@Repository
public interface TodoRepository extends JpaRepository<MemoEntity, Long> {
    // public MemoEntity findById(String id);
    
    
}