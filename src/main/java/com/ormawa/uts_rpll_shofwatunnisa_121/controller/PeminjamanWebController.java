package com.ormawa.uts_rpll_shofwatunnisa_121.controller;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class PeminjamanWebController {

    private final RuntimeService runtimeService;

    public PeminjamanWebController(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    @GetMapping("/")
    public String index() {
        return "index"; // Memanggil file index.html di folder resources/templates/
    }

    @PostMapping("/submit-peminjaman")
    public String submitPeminjaman(@RequestParam("namaPeminjam") String namaPeminjam,
                                   @RequestParam("namaAlat") String namaAlat,
                                   @RequestParam("jumlahAlat") Integer jumlahAlat,
                                   @RequestParam("tanggalPinjam") String tanggalPinjam,
                                   Model model) {

        Map<String, Object> variables = new HashMap<>();
        variables.put("namaPeminjam", namaPeminjam);
        variables.put("namaAlat", namaAlat);
        variables.put("jumlahAlat", jumlahAlat);
        variables.put("tanggalPinjam", tanggalPinjam);

        runtimeService.startProcessInstanceByKey("Process_PeminjamanAlat", variables);

        model.addAttribute("successMessage", "Pengajuan peminjaman untuk " + namaAlat + " oleh " + namaPeminjam + " berhasil dikirim ke sistem.");
        return "index";
    }
}