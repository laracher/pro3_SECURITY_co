package com.example.demo.mapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.demo.model.Users;
import org.springframework.jdbc.core.RowMapper;
public class AppUserMapper implements RowMapper<Users>{
    public static final String BASE_SQL //
            = "Select u.User_Id, u.First_Name, u.Last_Name, u.Email, " +
            "u.Password, u.Active, u.Birthday From Users u";

    @Override
    public Users mapRow(ResultSet rs, int rowNum) throws SQLException {

        Long user_id = rs.getLong("User_Id");
        String first_name = rs.getString("First_Name");
        String last_name = rs.getString("Last_Name");
        String email = rs.getString("Email");
        String password = rs.getString("Password");
        Boolean active = rs.getBoolean("Active");
        Date birthday = rs.getDate("Birthday");

        return new Users(user_id, first_name, last_name, email, password, active, birthday);
    }
}
