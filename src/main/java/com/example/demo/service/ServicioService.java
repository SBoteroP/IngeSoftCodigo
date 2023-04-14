package com.example.demo.service;

import com.example.demo.modelo.Servicio;
import com.example.demo.repositorio.RepoServicio;
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
public class ServicioService implements RepoServicio {

    @Autowired
    private RepoServicio repoServicio;

    @Override
    public void flush() {

    }

    @Override
    public <S extends Servicio> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Servicio> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Servicio> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Servicio getOne(Long aLong) {
        return null;
    }

    @Override
    public Servicio getById(Long aLong) {
        return null;
    }

    @Override
    public Servicio getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Servicio> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Servicio> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Servicio> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Servicio> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Servicio> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Servicio> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Servicio, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Servicio> S save(S entity) {
        return repoServicio.save(entity);
    }

    @Override
    public <S extends Servicio> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Servicio> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Servicio> findAll() {
        return repoServicio.findAll();
    }

    @Override
    public List<Servicio> findAllById(Iterable<Long> longs) {
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
    public void delete(Servicio entity) {
        repoServicio.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Servicio> entities) {
        repoServicio.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        repoServicio.deleteAll();
    }

    @Override
    public List<Servicio> findAll(Sort sort) {
        return repoServicio.findAll(sort);
    }

    @Override
    public Page<Servicio> findAll(Pageable pageable) {
        return null;
    }
}
