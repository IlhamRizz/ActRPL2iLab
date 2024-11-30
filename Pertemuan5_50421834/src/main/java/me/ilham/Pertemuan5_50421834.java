/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.ilham;

import me.ilham.controller.MahasiswaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 *
 * @author ilhamrizkiadi
 */
@SpringBootApplication
public class Pertemuan5_50421834 implements CommandLineRunner{
    
    @Autowired
    private MahasiswaController mhsController;
    
    public static void main(String[] args) {
        SpringApplication.run(Pertemuan5_50421834.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception {
        mhsController.tampilkanMenu();
    }
}
