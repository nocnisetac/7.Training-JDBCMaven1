package project.maven.jdbc;

import project.maven.jdbc.dao.DaoImplementation;
import project.maven.jdbc.domain.Person;

public class JdbcDemo {

	public static void main(String[] args) {
		Person person = new DaoImplementation().getPerson(2);
		System.out.println("Name: "+person.getPerson_name()+", Age: "+person.getPerson_age());
	}
}
