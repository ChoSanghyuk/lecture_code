package org.example.entity.item;

import lombok.Data;
import org.example.entity.Item;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "Movies")
public class Movie extends Item {

    private String director;
    private String actor;
}
