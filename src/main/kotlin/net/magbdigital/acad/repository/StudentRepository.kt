package net.magbdigital.acad.repository


import net.magbdigital.acad.model.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository:JpaRepository<Student, Long> {
}