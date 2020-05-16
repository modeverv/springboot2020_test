package com.dreamjack.amaterasdemo.controller

import com.dreamjack.amaterasdemo.model.Employee
import org.springframework.web.bind.annotation.*


@RestController
class SampleRest {

    // 全件取得
    @GetMapping("test")
    fun getList(): List<Employee> {
        var lst =  mutableListOf<Employee>()
        lst.add(Employee(1,1,1))
        lst.add(Employee(1,1,1))
        lst.add(Employee(1,1,1))
        lst.add(Employee(1,1,1))
        return lst
    }

}