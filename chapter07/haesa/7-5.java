List<Employee> employees = getEmployees();
if(employees != null) {
	for(Employee e : employees) {
		totalPay += e.getPay();
	}
}