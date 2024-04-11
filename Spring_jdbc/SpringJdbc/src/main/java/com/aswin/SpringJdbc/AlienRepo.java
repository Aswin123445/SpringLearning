package com.aswin.SpringJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.aswin.SpringJdbc.model.Alien;
@Repository  //as i want to spring to manage it//but this layer is repositor we can use @Repository
public class AlienRepo {
    private JdbcTemplate template;//this inbuild object of jdbc is uded connect jdbc with application
    //also we don't need to create the object of template as spring will take care of it
    //for that we can use auto wired;
    public JdbcTemplate getTemplate() {
        return template;
    }
    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
    public void save(Alien alien){
     String sql="insert into alien(id ,name, tech) values (?,?,?)";//method to save alien objects into the database
    int rows= template.update(sql, alien.getId(),alien.getName(),alien.getTech());
    System.out.println(rows+" affected");

    }
    public List<Alien> findAll(){
        //String sql="select * from alien";
       return new  ArrayList<Alien>();
    }
}
