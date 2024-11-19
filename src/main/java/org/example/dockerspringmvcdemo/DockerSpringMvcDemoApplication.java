package org.example.dockerspringmvcdemo;

import lombok.RequiredArgsConstructor;
import org.example.dockerspringmvcdemo.dao.EmployeeDao;
import org.example.dockerspringmvcdemo.entity.Employees;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class DockerSpringMvcDemoApplication {

    private final EmployeeDao employeeDao;
    @Bean @Transactional
    public ApplicationRunner runner() {
        return args -> {
            List.of(new Employees(null,"Jack","neo","jack@gmail.com","09445265001"),
                    new Employees(null,"Peter","liy","liy@gmail.com","09445265001"),
                    new Employees(null,"John","shni","john@gmail.com","09445265001"))
            .forEach(employeeDao::save);
        } ;
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerSpringMvcDemoApplication.class, args);
    }

}
