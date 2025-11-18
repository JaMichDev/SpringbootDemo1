package com.mjprogramming.restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
	 @Column(name = "stuid")
	    private Long stuid;
	    @Column(name = "stuname", nullable = false, unique = true, length = 50)
	    private String stuname;
	    @Column(name = "stufname", length = 60)
	    private String stufname;
	    @Column(name = "stulname", length = 60)
	    private String stulname;
	    @Column(name = "stuemail", nullable = false, unique = true, length = 120)
	    private String stuemail;
	    @Column(name = "stuphone", length = 30)
	    private String stuphone;
		public Long getStuid() {
			return stuid;
		}
		public void setStuid(Long stuid) {
			this.stuid = stuid;
		}
		public String getStuname() {
			return stuname;
		}
		public void setStuname(String stuname) {
			this.stuname = stuname;
		}
		public String getStufname() {
			return stufname;
		}
		public void setStufname(String stufname) {
			this.stufname = stufname;
		}
		public String getStulname() {
			return stulname;
		}
		public void setStulname(String stulname) {
			this.stulname = stulname;
		}
		public String getStuemail() {
			return stuemail;
		}
		public void setStuemail(String stuemail) {
			this.stuemail = stuemail;
		}
		public String getStuphone() {
			return stuphone;
		}
		public void setStuphone(String stuphone) {
			this.stuphone = stuphone;
		}
	    
	    
}
