package com.example.uts_rpllanjut_shofwatunnisa_121;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("emailRevisiService")
public class EmailRevisiService implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String namaMhs = (String) execution.getVariable("namaMahasiswa");
        if (namaMhs == null) {
            namaMhs = "Mahasiswa TI UIN";
        }
        System.out.println("[NOTIFIKASI EMAIL] Yth. " + namaMhs + ", proposal skripsi Anda dinyatakan BELUM LAYAK oleh Sekprodi. Silakan lakukan perbaikan.");
    }
}