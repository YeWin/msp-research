package com.example.msp;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@Configuration
@SpringBootTest
@PropertySource("classpath:application-test.properties")
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
public abstract class TestAbstract {

}
