package com.rest.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.demo.model.Pegawai;
import com.rest.demo.repository.PegawaiRepository;

@Service
public class PegawaiService {

	@Autowired
	PegawaiRepository pegawaiRepository;

	public Pegawai getPegawaiById(int id) {
		return pegawaiRepository.findById(id).get();
	}

	public void save(Pegawai pegawai) {
		pegawaiRepository.save(pegawai);
	}
}
