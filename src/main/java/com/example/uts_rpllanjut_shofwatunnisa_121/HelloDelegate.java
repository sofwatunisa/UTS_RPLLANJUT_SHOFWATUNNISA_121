package com.example.uts_rpllanjut_shofwatunnisa_121;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("helloDelegate")
public class HelloDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("==================================================");
        System.out.println(" Hello World! Konfigurasi Camunda + Spring Boot Berhasil!");
        System.out.println(" Pengembang: Shofwatunnisa (11210910000121)");
        System.out.println("==================================================");
    }
}