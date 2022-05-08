package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Entity.MemoEntity;
import com.example.demo.Model.PutMemoRequestBody;
import com.example.demo.Repository.TodoRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    public List<MemoEntity> getMemos() {
        
        return todoRepository.findAll();
    }

    public void postMemo(PutMemoRequestBody param) {
        MemoEntity entity = MemoEntity.builder().text(param.getText()).build();
        todoRepository.save(entity);
    }

    public void putMemo(Long id, PutMemoRequestBody param) {
        MemoEntity entity =  todoRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        entity.setText(param.getText());
        todoRepository.save(entity);
        
    }

    public void deleteMemo(Long id) {

        todoRepository.deleteById(id);
    }
    
}
