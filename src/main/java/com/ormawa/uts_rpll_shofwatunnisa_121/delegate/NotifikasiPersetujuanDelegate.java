package com.ormawa.uts_rpll_shofwatunnisa_121.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("notifikasiPersetujuanDelegate")
public class NotifikasiPersetujuanDelegate implements JavaDelegate {
    private final static Logger LOGGER = Logger.getLogger(NotifikasiPersetujuanDelegate.class.getName());

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String namaPeminjam = (String) execution.getVariable("namaPeminjam");
        String namaAlat = (String) execution.getVariable("namaAlat");

        LOGGER.info("==================================================");
        LOGGER.info(" STATUS: PEMINJAMAN DISETUJU!");
        LOGGER.info(" Peminjam : " + namaPeminjam);
        LOGGER.info(" Peralatan: " + namaAlat);
        LOGGER.info(" Pesan    : Silakan ambil alat di sekretariat.");
        LOGGER.info("==================================================");
    }
}