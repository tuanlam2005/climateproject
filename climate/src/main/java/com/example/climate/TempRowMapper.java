package com.example.climate;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TempRowMapper implements RowMapper<Temperature> {

    @Override
    public Temperature mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Temperature(
                rs.getInt("Year"),
                rs.getFloat("AverageTemperature"),
                rs.getFloat("MinimumTemperature"),
                rs.getFloat("MaximumTemperature")
        );
    }
}
