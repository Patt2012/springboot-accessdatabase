package com.example.ConncetAccess.dao;

import com.example.ConncetAccess.model.MainCase;
import com.example.ConncetAccess.repository.MainCaseRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class MainCaseDao implements MainCaseRepository {

    private JdbcTemplate template;

    public MainCaseDao(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public List<MainCase> getAll() {
        return template.query("SELECT * FROM [แผนกรับฟ้อง]", new RowMapper<MainCase>() {
            @Override
            public MainCase mapRow(ResultSet rs, int row) throws SQLException {
                MainCase cases = new MainCase(rs.getString("หมายเลขดำที่/พศ"),
                        rs.getString("โจทก์"),
                        rs.getString("จำเลย")
                );
                return cases;
            }
        });
    }
}






























