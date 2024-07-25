package com.qianscode.qiancode.student;


import org.springframework.jdbc.core.JdbcTemplate;


import org.springframework.jdbc.core.RowMapper;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

@Repository
public class StudentDataAccessService {
    private final JdbcTemplate jdbcTemplate;

    @Autowired(required = false)
    public StudentDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    List<Student> getStudentList() throws SQLException {
        String sql = ""+
                " SELECT "+
                " student_id, "+
                " first_name, "+
                " last_name, " +
                " email, "+
                " gender " +
                " FROM student";

        return jdbcTemplate.query(sql, getRowMapper());
    }

    private static RowMapper<Student> getRowMapper() {
        return (resultSet,i) -> {  // <----- add second parameter `i`
            UUID id = UUID.fromString(resultSet.getString("id"));
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String email = resultSet.getString("email");
            String genderstr = resultSet.getString("gender");
            Student.Gender gender = Student.Gender.valueOf(genderstr);
            return new Student(id, firstName, lastName, email, gender);
        };
    }


}
