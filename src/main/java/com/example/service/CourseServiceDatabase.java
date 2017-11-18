package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CourseMapper;
import com.example.model.CourseModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CourseServiceDatabase implements CourseService{
	
	@Autowired
	private CourseMapper courseMapper;
	
	@Override
	public CourseModel selectCourse(String idCourse) {
		CourseModel courseModel = courseMapper.selectCourse(idCourse);
		return courseModel;
	}

}
