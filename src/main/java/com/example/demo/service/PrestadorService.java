package com.example.demo.service;

import com.example.demo.modelo.Prestador;
import com.example.demo.repositorio.RepoPrestador;
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
public class PrestadorService implements  RepoPrestador{

    @Autowired
    private RepoPrestador repoPrestador;

    @Override
    public void flush() {

    }

    @Override
    public <S extends Prestador> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Prestador> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Prestador> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Prestador getOne(Long aLong) {
        return null;
    }

    @Override
    public Prestador getById(Long aLong) {
        return null;
    }

    @Override
    public Prestador getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Prestador> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Prestador> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Prestador> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Prestador> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Prestador> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Prestador> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Prestador, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Prestador> S save(S entity) {
        return repoPrestador.save(entity);
    }

    @Override
    public <S extends Prestador> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Prestador> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Prestador> findAll() {
        return repoPrestador.findAll();
    }

    @Override
    public List<Prestador> findAllById(Iterable<Long> longs) {
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
    public void delete(Prestador entity) {
repoPrestador.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Prestador> entities) {
repoPrestador.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
repoPrestador.deleteAll();
    }

    @Override
    public List<Prestador> findAll(Sort sort) {
        return repoPrestador.findAll(sort);
    }

    @Override
    public Page<Prestador> findAll(Pageable pageable) {
        return null;
    }
}
