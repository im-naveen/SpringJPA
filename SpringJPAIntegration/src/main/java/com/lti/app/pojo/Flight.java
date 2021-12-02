package com.lti.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flightmaster")
public class Flight {
	
	@Id
	@Column(name = "flightno")
	private String fno;
	
	@Column(name = "flighttype")
	private String ftype;
	
	@Column(name = "source")
	private String source;
	
	@Column(name = "destination")
	private String dest;
	
	
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Flight(String fno, String ftype, String source, String dest) {
		super();
		this.fno = fno;
		this.ftype = ftype;
		this.source = source;
		this.dest = dest;
	}



	public String getFno() {
		return fno;
	}

	public void setFno(String fno) {
		this.fno = fno;
	}

	public String getFtype() {
		return ftype;
	}

	public void setFtype(String ftype) {
		this.ftype = ftype;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}



	@Override
	public String toString() {
		return "Flight [fno=" + fno + ", ftype=" + ftype + ", source=" + source + ", dest=" + dest + "]";
	}
	
	
}
