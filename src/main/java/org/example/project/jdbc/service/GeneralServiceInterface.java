package org.example.project.jdbc.service;

import org.example.project.jdbc.DAO.GeneralDAOInterface;

import java.sql.SQLException;
import java.util.List;

public interface GeneralServiceInterface<T> {
    GeneralDAOInterface<T, Integer> getDAO();

    List<T> getAll() throws SQLException;

    T getById(Integer id) throws SQLException;

    int create(T entity) throws SQLException;

    int update(T entity) throws SQLException;

    int delete(Integer id) throws SQLException;
}
