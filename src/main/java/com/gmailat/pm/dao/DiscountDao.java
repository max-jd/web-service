package com.gmailat.pm.dao;

import com.gmailat.pm.entity.Discount;

import java.sql.SQLException;
import java.util.List;

public interface DiscountDao {

    public List<Discount> getAll() throws SQLException;

    public Discount getById(int id) throws SQLException;

    public void save(Discount discount) throws SQLException;

    public void delete(int id) throws SQLException;

    public void update(Discount discount) throws SQLException;

}
