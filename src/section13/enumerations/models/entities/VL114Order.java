package section13.enumerations.models.entities;

import java.util.Date;

import section13.enumerations.models.enums.VL114OrderStatus;

public class VL114Order {

	private Integer id;
	private Date moment;
	private VL114OrderStatus status;

	public VL114Order() {
	}

	public VL114Order(Integer id, Date moment, VL114OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public VL114OrderStatus getStatus() {
		return status;
	}

	public void setStatus(VL114OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "VL113Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	

}
