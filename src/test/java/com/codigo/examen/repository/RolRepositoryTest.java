package com.codigo.examen.repository;

import com.codigo.examen.entity.Rol;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class RolRepositoryTest {

    @Autowired
    RolRepository rolRepository;

    @Autowired
    TestEntityManager testEntityManager;

    private Rol rol;

    @BeforeEach
    void setUp(){
        rol = Rol.builder()
                .nombreRol("ADMIN")
                .build();
    }

    @Test
    @DisplayName("Obtener username")
    void OntenerUsername(){
        Optional<Rol> rol = rolRepository.findByNombreRol("ADMiN");
        assertEquals(rol.get().getNombreRol(), "ADMiN");
    }
}