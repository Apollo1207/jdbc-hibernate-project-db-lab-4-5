package org.example.project.jdbc.controller;

import org.example.project.jdbc.service.GeneralServiceInterface;
import org.hibernate.Session;

import java.sql.SQLException;

public interface GeneralControllerInterface<T> {
    void create(T entity, Session session) throws SQLException;

    void update(T entity, Session session) throws SQLException;

    void delete(int id, Session session) throws SQLException;

    void getAll(Session session) throws SQLException;

    void getById(int id, Session session) throws SQLException;

    GeneralServiceInterface<T> getService();
}
