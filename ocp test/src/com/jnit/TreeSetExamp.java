
	package com.jnit;
	import java.util.Set;
	public class TreeSetExamp {
	    public static void main(String a[]) {
	        Set<Employee> ts = new TreeSet<Employee>();
	        ts.add(new Employee(101, "Anne"));
	        ts.add(new Employee(102, "Esh"));
	        
	        // adding duplicate entry
	        ts.add(new Employee(103, "POlk"));
	        // check if duplicate entry is there or not
	        for (Employee e : ts) {
	            System.out.println(e);
	        }
	    }
	}

	class Employee implements Comparable<Employee> {
	      private int empId;
	      private String empName;
	    

	      public Employee(int id, String name) {
	          this.empId = id;
	          this.empName = name;
	          
	      }

	      public int getEmpId() {
	          return empId;
	      }

	      public void setEmpId(int empId) {
	         this.empId = empId;
	      }

	      public String getEmpName() {
	         return empName;
	      }

	      public void setEmpName(String empName) {
	         this.empName = empName;
	      }

	    

	     

	      public String toString() {
	         return empId + " : " + empName + " : " ;
	      }

	      @Override
	      public int compareTo(Employee emp) {
	         if (this.empId == emp.getEmpId()) {
	             return 0;
	         } else if (this.empId < emp.getEmpId()) {
	             return -1;
	         }
	         return 1;
	      }
