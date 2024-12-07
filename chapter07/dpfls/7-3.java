public class ExpenseReportDAO {
	MealExpenses getMeals(int employeeID) {
		...
		if(meals are expensed)
			return a MealExpense object;
		else
			throw MealExpensesNotFound;
	}
}


try {
	MealExpenses expenses = expenseReportDAO.getMeals(employee.getID());
	m_total += expenses.getTotal();
} catch(MealExpensesNotFound e) {
	m_total += getMealPerDiem();
}