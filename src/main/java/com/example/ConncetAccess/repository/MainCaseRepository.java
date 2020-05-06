package com.example.ConncetAccess.repository;

import com.example.ConncetAccess.model.MainCase;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MainCaseRepository {

    List<MainCase> getAll();
}
