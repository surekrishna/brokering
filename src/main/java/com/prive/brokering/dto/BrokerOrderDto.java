package com.prive.brokering.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.prive.brokering.enums.OrdersType;
import com.prive.brokering.enums.Status;

public class BrokerOrderDto implements Serializable {
	/**
	 * added generated serialVersionUID
	 */
	private static final long serialVersionUID = -2913763638101534424L;
	
	private String id;
	private String req_id;
	private OrdersType type;
	private Integer qty;
	private String code;
	private BigDecimal price;
	private Status status;
	
	//getters and setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getReq_id() {
		return req_id;
	}
	public void setReq_id(String req_id) {
		this.req_id = req_id;
	}
	public OrdersType getType() {
		return type;
	}
	public void setType(OrdersType type) {
		this.type = type;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "BrokerOrderDto [id=" + id + ", req_id=" + req_id + ", type=" + type + ", qty=" + qty + ", code=" + code
				+ ", price=" + price + ", status=" + status + "]";
	}
	
}
