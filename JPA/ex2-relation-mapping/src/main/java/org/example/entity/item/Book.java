package org.example.entity.item;

import lombok.Data;
import org.example.entity.Item;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@DiscriminatorValue("BOOK_ITEM")
public class Book extends Item {

    private String author;
    private String isbn;


}
