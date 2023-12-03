package org.example.entity;

import lombok.Data;
import org.example.entity.commonFields.SystemFields;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@SequenceGenerator(
        name = "ITEM_SEQ_GENERATOR",
        sequenceName = "ITEM_SEQ", //매핑할 데이터베이스 시퀀스 이름
        initialValue = 1, allocationSize = 1)
@Data
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="ITEM_TYPE")
public abstract class Item extends SystemFields {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ITEM_SEQ_GENERATOR")
    private Long id;

    @ManyToMany(mappedBy = "items")
    private List<Category> categories = new ArrayList<>();
    private String name;

    private int price;

    private int stockQuantity;
}
