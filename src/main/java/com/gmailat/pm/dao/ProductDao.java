package com.gmailat.pm.dao;

import com.gmailat.pm.entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao {

    public List<Product> getAll() throws SQLException;

    public Product getById(int id) throws SQLException;

    public void save(Product product) throws SQLException;

    public void delete(int id) throws SQLException;

    public void update(Product product) throws SQLException;

}
