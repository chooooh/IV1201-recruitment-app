package se.kth.recruitmentapp.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Domain model representing the competence profile of a person
 */
@Data
@Entity
@Table(name = "competence_profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "competence_profile_id")
    private int id;
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;
    @ManyToOne
    @JoinColumn(name = "competence_id")
    private Competence competence;
    @Column(name = "years_of_experience")
    private BigDecimal yoe;
}

