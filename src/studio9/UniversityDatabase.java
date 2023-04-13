package studio9;

import assignment7.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UniversityDatabase {
	private final Map<String, Student> Database;
			
	public UniversityDatabase() {
		Database = new HashMap<String, Student>();
	}
	//TODO: Complete this class according to the studio instructions

	public void addStudent(String accountName, Student student) {
		Database.put(accountName, student);
	}

	public int getStudentCount() {
		return Database.size();
	}

	public String lookupFullName(String accountName) {
		if(Database.get(accountName)!=null) {
			Student s = Database.get(accountName);
			return s.getFullName();
		} else {
			return null;
		}
	}

	public double getTotalBearBucks() {
		double total = 0;
		for(Entry<String, Student> dbEntry : Database.entrySet()) {
			Student s = dbEntry.getValue();
			total += s.getBearBucksBalance();
		}
		return total;
	}
}
