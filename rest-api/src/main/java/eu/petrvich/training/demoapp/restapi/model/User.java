package eu.petrvich.training.demoapp.restapi.model;

import jakarta.persistence.Id;

public class User {

    @Id
    private Long id;

    private String name;
}
