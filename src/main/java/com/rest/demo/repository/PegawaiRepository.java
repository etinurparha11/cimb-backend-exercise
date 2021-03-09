package com.rest.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.rest.demo.model.Pegawai;

public interface PegawaiRepository extends CrudRepository<Pegawai, Integer> {
}
