package com.baron.myapp.business.service;

import com.baron.myapp.business.entity.model.Honey;
import com.baron.myapp.business.entity.repository.HoneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class HoneyService {

    private HoneyRepository repo;

    public List<Honey> listAll() {
        return repo.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    public void create(Honey honey) {
        honey.setId((int)(repo.count() + 1));
        repo.save(honey);
    }

    public void edit(Honey honey) {
        repo.save(honey);
    }

    public Honey get(int id) {
        return repo.findById(id).get();
    }

    public void delete(int id) {
        repo.deleteById(id);
    }

    @Autowired
    public void setRepo(HoneyRepository repo) {
        this.repo = repo;
    }
}
