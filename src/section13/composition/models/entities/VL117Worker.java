package section13.composition.models.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import section13.composition.models.enums.VL117WorkerLevel;

public class VL117Worker {

	private String name;
	private VL117WorkerLevel level;
	private Double baseSalary;

	private VL117Department department;
	private List<VL117HourContract> contracts = new ArrayList<>();

	public VL117Worker() {
	}

	public VL117Worker(String name, VL117WorkerLevel level, Double baseSalary, VL117Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VL117WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(VL117WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public VL117Department getDepartment() {
		return department;
	}

	public void setDepartment(VL117Department department) {
		this.department = department;
	}

	public List<VL117HourContract> getContracts() {
		return contracts;
	}

	public void addContract(VL117HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(VL117HourContract contract) {
		contracts.remove(contract);
	}

	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (VL117HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}

}
