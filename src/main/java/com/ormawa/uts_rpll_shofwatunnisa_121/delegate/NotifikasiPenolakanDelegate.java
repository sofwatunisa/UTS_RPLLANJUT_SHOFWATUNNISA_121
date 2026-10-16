package com.ormawa.uts_rpll_shofwatunnisa_121.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("notifikasiPenolakanDelegate")
public class NotifikasiPenolakanDelegate implements JavaDelegate {
    private final static Logger LOGGER = Logger.getLogger(NotifikasiPenolakanDelegate.class.getName());

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String namaPeminjam = (String) execution.getVariable("namaPeminjam");
        String namaAlat = (String) execution.getVariable("namaAlat");

        LOGGER.info("==================================================");
        LOGGER.info(" STATUS: PEMINJAMAN DITOLAK!");
        LOGGER.info(" Peminjam : " + namaPeminjam);
        LOGGER.info(" Peralatan: " + namaAlat);
        LOGGER.info(" Pesan    : Mohon maaf, alat sedang digunakan.");
        LOGGER.info("==================================================");
    }
}