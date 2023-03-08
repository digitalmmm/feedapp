package com.bptn.feedapp.jdbc;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<UserBean> {

    @Override
    public UserBean mapRow(ResultSet rs, int rowNum) throws SQLException {
        // TODO Auto-generated method stub

    
        UserBean user = new UserBean();

       
        user.setUserId(rs.getInt("userId"));
        user.setFirstName(rs.getString("firstName"));
        user.setLastName(rs.getString("lastName"));
        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        user.setPhone(rs.getString("phone"));
        user.setEmailId(rs.getString("emailId"));
        user.setEmailVerified(rs.getBoolean("emailVerified"));
        user.setCreatedOn(rs.getTimestamp("createdOn"));

       
        return user;

    }

}
