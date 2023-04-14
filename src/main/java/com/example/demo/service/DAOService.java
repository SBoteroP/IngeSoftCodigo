/*package com.example.demo.service;

import com.example.demo.modelo.Cita;
import com.example.demo.modelo.DAO;
import com.example.demo.repositorio.RepoCliente;
import com.example.demo.repositorio.RepoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class DAOService implements RepoDAO {

    @Autowired
    private RepoDAO repoDAO;

    public DAO authenticateUser(String email, String password) {
        DAO dao = repoDAO.findByEmail(email);

        if (dao == null) {
            throw new IllegalArgumentException("User not found");
        }

        if (!dao.getPassword().equals(password)) {
            throw new IllegalArgumentException("Incorrect password");
        }

        return dao;
    }
    @Override
    public void flush() {

    }

    @Override
    public <S extends DAO> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends DAO> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<DAO> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public DAO getOne(Long aLong) {
        return null;
    }

    @Override
    public DAO getById(Long aLong) {
        return null;
    }

    @Override
    public DAO getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends DAO> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends DAO> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends DAO> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends DAO> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends DAO> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends DAO> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends DAO, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends DAO> S save(S entity) {
        return null;
    }

    @Override
    public <S extends DAO> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<DAO> findById(Long aLong) {
        return Optional.empty();
    }

    public List<DAO> findAllByEmail(String email) {
        List<DAO> daoRespuesta = new ArrayList<>();
        List<DAO> dao = repoDAO.findAll();
        for (int i = 0; i < dao.size(); i++) {
            if ((dao.get(i).getEmail()).equals(email)) {
                daoRespuesta.add(dao.get(i));
            }
        }
        return daoRespuesta;
    }
    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<DAO> findAll() {
        return repoDAO.findAll();
    }

    @Override
    public List<DAO> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(DAO entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends DAO> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<DAO> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<DAO> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public DAO findByEmail(String email) {
        return null;
    }
}
*/