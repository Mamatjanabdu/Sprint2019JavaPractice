package day54;

public abstract class SalariedEmployee extends Employee {

	int monthlySalary;
	@Override
	public void calculateAnnualSalary() {
		
		System.out.println(monthlySalary*12);
	}

public void SalariedEmployee() {
	
}
}/*HourlyEmployee class 

private instance fields 
	id 
	name
	MonthlyHourWorked
	hourlyRate

constructor to set all 
add getters and setters 
add toString method 

method 
calculateAnualSalary()

SalariedEmployee

private instance fields 
	id 
	name
	monthlySalary 
method 
calculateAnualSalary()
add getters and setters 
add toString method 

TASKS : 
ABSTRACT out an Employee class out of these two classes 
to make it abstract to provide reusable fields 
and abstract method to provide the idea rather than implementation detail 
*/