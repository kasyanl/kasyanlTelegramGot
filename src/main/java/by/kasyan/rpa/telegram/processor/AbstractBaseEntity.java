package by.kasyan.rpa.telegram.processor;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
// Аннотация, которая говорит нам, что это суперкласс для всех Entity
// https://vladmihalcea.com/how-to-inherit-properties-from-a-base-class-entity-using-mappedsuperclass-with-jpa-and-hibernate/
@MappedSuperclass

@Access(AccessType.FIELD)

@Getter
@Setter
public abstract class AbstractBaseEntity {
    @Id
    @SequenceGenerator(name = "global_seq", sequenceName = "global_seq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "global_seq")

    protected Integer id;

    protected AbstractBaseEntity() {
    }
}
