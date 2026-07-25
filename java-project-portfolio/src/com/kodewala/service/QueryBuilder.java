package com.kodewala.service;

import com.kodewala.model.Employee;

public class QueryBuilder {
	public String buildQuery(Employee emp) {
		StringBuffer query = new StringBuffer("Select *  from Employee");
		boolean whereAdded = false;
		if (emp.getempId() > 0) {
			query.append("\nwhere emp_id = ").append(emp.getempId());
			whereAdded = true;

		}
		if (!emp.getempName().isEmpty()) {
			if (whereAdded) {
				query.append("\nAND");
			} else {
				query.append("where");
				whereAdded = true;

			}
			query.append(" \nemp_name = ").append(emp.getempName()).append(" ");
		}
		if (emp.getsalary() > 0) {
			if (whereAdded) {
				query.append("\nAND");
			} else {
				query.append("where");
				whereAdded = true;
			}
			query.append("\nsalary >= ").append(emp.getsalary());

		}
		if (!emp.getdepartment().isEmpty()) {
			if (whereAdded) {
				query.append("\nAND");
			} else {
				query.append("\nWHERE");
			}
			query.append("\ndepartment = ").append(emp.getdepartment()).append(" ");
		}
		query.append("; ");
		return query.toString();
	}

}
