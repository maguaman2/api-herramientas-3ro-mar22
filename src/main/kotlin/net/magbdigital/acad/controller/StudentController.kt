package net.magbdigital.acad.controller

import net.magbdigital.acad.model.Student
import net.magbdigital.acad.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/students")
class StudentController {

    @Autowired
    lateinit var studentService: StudentService

    @GetMapping
    fun list ():List <Student>{
        return studentService.list()
    }

    @PostMapping
    fun save (@RequestBody student: Student): Student{
        return studentService.save(student)
    }

    @PutMapping
    fun update (@RequestBody student: Student): Student{
        return studentService.update(student)
    }

    @PatchMapping
    fun updateName(@RequestBody student: Student): Student {
        return studentService.update(student)
    }
}