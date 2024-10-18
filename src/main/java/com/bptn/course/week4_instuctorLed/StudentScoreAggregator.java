package com.bptn.course.week4_instuctorLed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentScoreAggregator {

	public static Map<String, Double> calculateAverage(List<Student> students) {
		Map<String, Double> averagesMap = new HashMap<>();

		for (Student student : students) {
			Map<String, Double> subjectScores = student.getSubjectScores();
			Double studentAvg = 0.0;
			for (Double value : subjectScores.values()) {
				studentAvg += value;
			}
			studentAvg /= subjectScores.size();
			averagesMap.put(student.getName(), studentAvg);

		}
		return averagesMap;
	}

	public static void main(String[] args) {
		Map<String, Double> scores = new HashMap<>();
		scores.put("course1", 90.0);
		scores.put("course2", 75.5);
		scores.put("course3", 98.3);
		Student s1 = new Student("student1", scores);

		Map<String, Double> scores2 = new HashMap<>();
		scores2.put("course1", 70.0);
		scores2.put("course2", 65.5);
		scores2.put("course3", 98.3);
		Student s2 = new Student("student2", scores2);

		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);

		System.out.println("Student averages is: " + calculateAverage(students));

	}

}
