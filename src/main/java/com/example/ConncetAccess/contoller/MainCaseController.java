package com.example.ConncetAccess.contoller;

import com.example.ConncetAccess.dao.MainCaseDao;
import com.example.ConncetAccess.model.MainCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainCaseController {

    private MainCaseDao caseDao;

    public MainCaseController(MainCaseDao caseDao) {
        this.caseDao = caseDao;
    }

    @GetMapping("/allcases")
    public List<MainCase> cases() {
        return caseDao.getAll();
    }

}
