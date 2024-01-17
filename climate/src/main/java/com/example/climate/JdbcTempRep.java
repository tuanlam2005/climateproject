package com.example.climate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcTempRep implements TempRep {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Temperature> findAllCities() {
        String sql = "select * from temperature where CityID is not null";
        return jdbcTemplate.query(
                sql,
                new TempRowMapper()
        );
    }
    @Override
    public List<Temperature> findFirstYear() {
      String sql = "select * from temperature limit 1;";
      return jdbcTemplate.query(sql, new TempRowMapper());
    }
    @Override
    public List<Temperature> findLastYear() {
        String sql = "select * from temperature order by Year desc limit 1;";
        return jdbcTemplate.query(sql, new TempRowMapper());
    }
}
