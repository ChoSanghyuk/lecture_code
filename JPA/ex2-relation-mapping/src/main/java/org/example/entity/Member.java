package org.example.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Entity
@SequenceGenerator(
        name = "MEMBER_SEQ_GENERATOR",
        sequenceName = "MEMBER_SEQ", //매핑할 데이터베이스 시퀀스 이름
        initialValue = 1, allocationSize = 1)
@Data
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEMBER_SEQ_GENERATOR")
    private Long id;
    private String name;
    private String city;
    private String street;

    private String zipcode;

    @OneToMany(mappedBy = "member")
    private List<Order> orders;
}
