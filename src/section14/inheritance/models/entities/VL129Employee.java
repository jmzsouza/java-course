package section14.inheritance.models.entities;

public class VL129Employee {
	
	private String name;
	private Integer hours;
	private Double valuePerHour;
	
	public VL129Employee() {
	}

	public VL129Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuPerHour() {
		return valuePerHour;
	}

	public void setValuPerHour(Double valuPerHour) {
		this.valuePerHour = valuPerHour;
	}
	
	public Double payment() {
		return hours * valuePerHour;
	}

}
