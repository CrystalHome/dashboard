package cn.crystal.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"cn.crystal.dashboard"})
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
