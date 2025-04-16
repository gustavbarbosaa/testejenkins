package br.edu.catolica.workshop.service;

import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

@Service
public class ValidName {
    public void testeName(String name) {
        if (Strings.isBlank(name)) {
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
    }
}
