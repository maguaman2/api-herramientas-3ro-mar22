package net.magbdigital.acad.service

import net.magbdigital.acad.model.Student
import net.magbdigital.acad.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService {

    @Autowired
    lateinit var studentRepository: StudentRepository

    fun list ():List<Student>{
        return studentRepository.findAll()
    }
}