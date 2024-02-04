package com.example.SSJWT.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "estudiantes")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long   id;
    @NotNull
    @Pattern(regexp = "^[a-zA-Z]+$", message = "El campo solo debe contener letras.")
    private String name;
    @NotNull
    @Pattern(regexp = "^[a-zA-Z]+$", message = "El campo solo debe contener letras.")
    private String lastName;
    @NotNull
    private String classroom;
    @NotNull
    private int    age;
    @NotNull
    private LocalDate birthdate;
    @NotNull
    private String gender;
    @NotNull
    private String email;
    @NotNull
    private String address;
    @NotNull
    private String contactNumber;
    @NotNull
    private String degree;
    @NotNull
    private String notes;
    @NotNull
    @Pattern(regexp = "^[a-zA-Z]+$", message = "El campo solo debe contener letras.")
    private String conduct;
    private LocalDateTime registrationDate;

    @PrePersist
    private void registrationDate() {
        registrationDate = LocalDateTime.now();
    }
}
