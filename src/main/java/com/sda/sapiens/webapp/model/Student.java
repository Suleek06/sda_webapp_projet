package com.sda.sapiens.webapp.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//@Setter
//@Getter
//@ToString
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String indeks;
    private LocalDate birthDate;

    @OneToMany(mappedBy = "student")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Grade> grades;
}
