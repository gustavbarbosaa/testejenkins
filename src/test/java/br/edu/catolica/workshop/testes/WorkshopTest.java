package br.edu.catolica.workshop.testes;

import br.edu.catolica.workshop.service.ValidName;
import jakarta.validation.Valid;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;


public class WorkshopTest {
    @Autowired
    ValidName validName;

    @Test
    void testeName() {

        String name = "";
        Assertions.assertDoesNotThrow(() ->validName.testeName(name));
    }
}
