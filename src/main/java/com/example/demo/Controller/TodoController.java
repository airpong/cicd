package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

import java.util.List;



import com.example.demo.Entity.MemoEntity;
import com.example.demo.Model.PutMemoRequestBody;
import com.example.demo.Service.TodoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequiredArgsConstructor
public class TodoController {
    
    private final TodoService todoService;

    @GetMapping(value="/memos")
    public List<MemoEntity> getMemos() {
        return todoService.getMemos();
    }

    @PostMapping(value="/memo")
    public void postMemo(@RequestBody PutMemoRequestBody param) {
        
        todoService.postMemo(param);
    }

    @PutMapping(value="/memo/{id}")
    public void putMemo(@PathVariable Long id, @RequestBody PutMemoRequestBody param) {
        todoService.putMemo(id,param);
    }

    @DeleteMapping(value="/memo/{id}")
    public void deleteMemo(@PathVariable Long id) {
        todoService.deleteMemo(id);
    }
    
}
