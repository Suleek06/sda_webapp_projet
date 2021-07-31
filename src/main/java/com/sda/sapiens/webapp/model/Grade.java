package com.sda.sapiens.webapp.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double gradeValue;

    @Enumerated(EnumType.STRING)
    private GradeSubject subject;

    @ManyToOne
    @ToString.Exclude
    private Student student;
}
