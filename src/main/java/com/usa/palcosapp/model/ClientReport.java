package com.usa.palcosapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Table;


@Table(name = "client")
@AllArgsConstructor
@Getter
@Setter
public class ClientReport {
    private Long total;
    private Client client;
}
