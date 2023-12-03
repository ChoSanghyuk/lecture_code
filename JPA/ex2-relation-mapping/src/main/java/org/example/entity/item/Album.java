package org.example.entity.item;

import lombok.Data;
import org.example.entity.Item;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@DiscriminatorValue("Album_ITEM")
public class Album extends Item {

    private String artist;
}
