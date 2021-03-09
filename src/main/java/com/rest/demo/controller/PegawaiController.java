package com.rest.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.demo.model.Pegawai;
import com.rest.demo.service.PegawaiService;

@RestController
public class PegawaiController {

	@Autowired
	PegawaiService pegawaiService;

	@GetMapping("/pegawai/{Userid}")
	private Pegawai getPegawaiById(@PathVariable("Userid") int id) throws Exception {
		Pegawai pegawai = pegawaiService.getPegawaiById(id);
		
		if (pegawai != null) {
			return pegawai;
		} else {
			throw new Exception("User ID tidak ditemukan");
		}
	}

	@PostMapping("/pegawai/save")
	private String savePegawai(@RequestBody Pegawai pegawai) throws Exception {
		if (!pegawai.getNama().isEmpty() || !pegawai.getAlamat().isEmpty()) {
			pegawaiService.save(pegawai);
		} else {
			throw new Exception("Nama atau alamat kosong");
		}

		return "SUKSES";
	}
}
