package com.ng.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ng.spring.orm.dao.StudentDAO;
import com.ng.spring.orm.entity.Student;

public class MenuDrivenApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/ng/spring/orm/orm_config.xml");

		StudentDAO dao = context.getBean(StudentDAO.class);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean more = true;

		while (more) {
			
			System.out.println("\n----Options to Select----\n");
			System.out.println("Press 1 to add new student");
			System.out.println("Press 2 to get a student detail");
			System.out.println("Press 3 to get all student detail");
			System.out.println("Press 4 to delete a student");
			System.out.println("Press 5 to update a student");
			System.out.println("Press 6 to exit");
			System.out.println("\nInput Here:");

			try {

				int option = Integer.parseInt(br.readLine());
				System.out.println("\n");

				switch (option) {

				case 1:

					System.out.println("Please provide student id");

					int id = Integer.parseInt(br.readLine());

					System.out.println("Please provide student name");

					String name = br.readLine();

					System.out.println("Please provide student address");

					String address = br.readLine();

					Student std = new Student(id,name, address);

					dao.insert(std);

					System.out.println("\nStudent is saved successfully");

					break;

				case 2:

					System.out.println("Please provide student id");

					id = Integer.parseInt(br.readLine());

					std = dao.get(id);

					System.out.println("\nStudent details as below:");

					System.out.println(std);

					break;

				case 3:

					List<Student> stdlist = dao.getAll();

					System.out.println("\nStudents details are as below:\n");

					for(Student temp : stdlist ) {

						System.out.println(temp);

					}

					break;

				case 4:
					
					System.out.println("Please provide student id");

					id = Integer.parseInt(br.readLine());

					dao.delete(id);

					System.out.println("\nStudent deleted successfully");

					break;

				case 5:
					
					System.out.println("Please provide student id");

					id = Integer.parseInt(br.readLine());

					System.out.println("Please provide student name");

					name = br.readLine();

					System.out.println("Please provide student address");

					address = br.readLine();

					std = new Student(id,name, address);

					dao.update(std);

					System.out.println("\nStudent is updated successfully");

					break;

				case 6:

					System.out.println("\nThank you for using application.");

					more = false;

					break;

				default:

					System.out.println("Invalid Selection, please provide proper input");
				}

			} catch (Exception e) {

				System.out.println("Invalid Entry, please provide proper input");
			}

		}

	}

}
