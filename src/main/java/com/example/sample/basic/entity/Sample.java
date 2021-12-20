package com.example.sample.basic.entity;

import lombok.*;

import javax.persistence.*;

/**
 * Sample Entity
 */

@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "sample1", schema = "test1")
public class Sample {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
