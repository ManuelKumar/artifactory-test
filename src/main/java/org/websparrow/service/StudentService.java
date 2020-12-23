package org.websparrow.service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;
import org.websparrow.model.Student;

@Service
public class StudentService {

	Hashtable<Integer, Student> ht = new Hashtable<>();

	public StudentService() {
		Student student = new Student("1", "Atul Rai", "MCA", "RSMT");
		ht.put(1, student);

		student = new Student("2", "Sandeep Sharma", "BCA", "MIT");
		ht.put(2, student);

		student = new Student("3", "Prince", "B.Sc", "AKG");
		ht.put(3, student);

		student = new Student("4", "Abhinav", "B.Pharma", "Amity");
		ht.put(4, student);
	}

	public Student findByRollNo(String rollNo) {

		if (ht.containsKey(rollNo)) {
			return ht.get(rollNo);
		} else {
			return null;
		}
	}

	public Hashtable<String, Student> findAll() {
		return ht;
	}

}
