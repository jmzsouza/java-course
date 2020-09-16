package section13.composition.models.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import section13.composition.models.enums.VL120OrderStatus;

public class VL120Order {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private VL120OrderStatus status;

	private VL120Client client;

	private List<VL120OrderItem> items = new ArrayList<>();

	public VL120Order() {
	}

	public VL120Order(Date moment, VL120OrderStatus status, VL120Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public VL120OrderStatus getStatus() {
		return status;
	}

	public void setStatus(VL120OrderStatus status) {
		this.status = status;
	}

	public VL120Client getClient() {
		return client;
	}

	public void setClient(VL120Client client) {
		this.client = client;
	}

	public void addItem(VL120OrderItem item) {
		items.add(item);
	}

	public void removeItem(VL120OrderItem item) {
		items.remove(item);
	}

	public Double total() {
		double sum = 0.0;
		for (VL120OrderItem it : items) {
			sum += it.subTotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order Status: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (VL120OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
