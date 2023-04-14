package com.example.demo.service;

import com.example.demo.modelo.Cita;
import com.example.demo.repositorio.RepoCita;
import com.example.demo.repositorio.RepoPrestador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class CitaService implements RepoCita {

    @Autowired
    private RepoCita repoCita;

    @Override
    public void flush() {

    }

    @Override
    public <S extends Cita> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Cita> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Cita> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Cita getOne(Long aLong) {
        return null;
    }

    @Override
    public Cita getById(Long aLong) {
        return null;
    }

    @Override
    public Cita getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Cita> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Cita> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Cita> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Cita> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Cita> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Cita> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Cita, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
    @Override
    public List<Cita> findAll() {
        return repoCita.findAll();
    }

    public List<Cita> findAllByCliente(Long id) {
        List<Cita> citasRespuesta = new ArrayList<>();
        List<Cita> citas = repoCita.findAll();
        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getCliente().getId() == id) {
                citasRespuesta.add(citas.get(i));
            }
        }
        return citasRespuesta;
    }

    public List<Cita> findAllByPrestador(Long id) {
        List<Cita> citasRespuesta = new ArrayList<>();
        List<Cita> citas = repoCita.findAll();
        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getPrestador().getId() == id) {
                citasRespuesta.add(citas.get(i));
            }
        }
        return citasRespuesta;
    }

    @Override
    public <S extends Cita> S save(S entity) {
        return repoCita.save(entity);
    }

    @Override
    public <S extends Cita> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Cita> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }



    @Override
    public List<Cita> findAllById(Iterable<Long> longs) {
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
    public void delete(Cita entity) {
        repoCita.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Cita> entities) {
        repoCita.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        repoCita.deleteAll();
    }

    @Override
    public List<Cita> findAll(Sort sort) {
        return repoCita.findAll(sort);
    }

    @Override
    public Page<Cita> findAll(Pageable pageable) {
        return null;
    }
}
