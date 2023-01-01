
public class Employee {

	String name ;
	double salary ;
	int workHours ;
	int hireYear ;
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public double tax(double salary) {
		if (salary > 1000) {
			return (salary*3)/100;
		}
		else {
			return 0;
		}
	}
	
	public double bonus(int workHours) {
		if (workHours > 40) {
			return 30*(workHours-40);
		}
		else {
			return 0;
		}
	}
	
	public double raiseSalary(int hireYear) {
		
		if ((2021-hireYear)<10) {
			return (salary*5)/100;
		} 
		else if ((2021-hireYear)>9 && (2021-hireYear)<19) {
			return (salary*10)/100;
		} 
		else {
			return (salary*15)/100;
		}
	}
	
	public void toString(Employee employee) {
		System.out.println("Adı : " + employee.name);
		System.out.println("Maaşı : " + employee.salary);
		System.out.println("Çalışma Saati : " + employee.workHours);
		System.out.println("Başlangıç Yılı : " + employee.hireYear);
		System.out.println("Vergi : " + employee.tax(salary));
		System.out.println("Bonus : " + employee.bonus(workHours));
		System.out.println("Maaş Artışı : " + employee.raiseSalary(hireYear));
		System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (employee.salary-employee.tax(salary)+employee.bonus(workHours)));
		System.out.println("Toplam Maaş : " + (employee.salary+employee.raiseSalary(hireYear)));
		
	}

}
