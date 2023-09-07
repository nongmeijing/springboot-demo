package com.example.springbootdemo.service;

import com.example.springbootdemo.app.domain.entity.Person;

/**
 * @description:
 * @author:meijing.nong@hand-china.com
 * @create:2023/9/7 11:33
 **/
public interface IPersonService {
    Person getPerson();
    String personBack(String name,String sex,int age);
    Person isMark(String name,String sex,int age);
}
