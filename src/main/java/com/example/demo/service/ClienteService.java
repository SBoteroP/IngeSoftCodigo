package com.example.demo.service;

import com.example.demo.modelo.Cliente;
import com.example.demo.repositorio.RepoCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class ClienteService implements RepoCliente {

    @Autowired
    private RepoCliente repoCliente;

    @Override
    public void flush() {

    }

    @Override
    public <S extends Cliente> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Cliente> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Cliente> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Cliente getOne(Long aLong) {
        return null;
    }

    @Override
    public Cliente getById(Long aLong) {
        return null;
    }

    @Override
    public Cliente getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Cliente> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Cliente> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Cliente> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Cliente> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Cliente> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Cliente> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Cliente, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Cliente> S save(S entity) {
        return repoCliente.save(entity);
    }

    @Override
    public <S extends Cliente> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Cliente> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Cliente> findAll() {
        return repoCliente.findAll();
    }

    @Override
    public List<Cliente> findAllById(Iterable<Long> longs) {
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
    public void delete(Cliente entity) {
        repoCliente.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Cliente> entities) {
        repoCliente.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        repoCliente.deleteAll();
    }

    @Override
    public List<Cliente> findAll(Sort sort) {
        return repoCliente.findAll(sort);
    }

    @Override
    public Page<Cliente> findAll(Pageable pageable) {
        return null;
    }
}
