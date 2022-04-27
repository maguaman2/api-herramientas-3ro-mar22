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

    fun getById (id: Long?):Student?{
        return studentRepository.findById(id)
    }
    fun save (student:Student):Student{
        return studentRepository.save(student)
    }

    fun update (student:Student):Student{
        studentRepository.findById(student.id) ?: throw Exception()

        return studentRepository.save(student)
    }

    fun updateName(student:Student):Student{
        //busca el id del objeto a actulizar
        //si existe le asigna a la variable a response
        val response=studentRepository.findById(student.id)
                ?: throw Exception()
        //actulizo el nombre unicamente
        response.apply {
            name=student.name
        }

        return studentRepository.save(response)
    }


    fun delete (id:Long): Boolean{
        studentRepository.deleteById(id)
        return true
    }


}