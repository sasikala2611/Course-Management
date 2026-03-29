package com.cms.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cms.entity.Course;

@Repository
public class CourseDAO {
	
	private static List<Course> list = new ArrayList<>();
	
	static {
		Course c = new Course();
		c.setId(1);
		c.setName("Java");
		c.setInstructor("Abi");
		list.add(c);
	}
	
	public List<Course> GetCourse(){
		return list;
	}
	

    // ✅ SAVE
    public void save(Course c) {
        list.add(c);
    }
    
    // ✅ DELETE
    public void delete(int id) {
        list.removeIf(course -> course.getId() == id);
    }
    
    // ✅ GET BY ID
    public Course getById(int id) {
        for (Course c : list) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }
    
    // ✅ UPDATE
    public void update(Course updated) {
        for (Course c : list) {
            if (c.getId() == updated.getId()) {
                c.setName(updated.getName());
                c.setInstructor(updated.getInstructor());
            }
        }
    }

	

}
