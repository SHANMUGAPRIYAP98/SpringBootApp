package com.srm.child2;

import com.srm.child1.Employee;



public class SalPercent {
   
	public static void main(String[] args) {
		Employee e=new Employee();
		e.display();
		if(e.salary>=50000)
		{
			e.salary=e.salary+(e.salary*0.5);
		}
		else if(e.salary>=40000&& e.salary<50000)
		{
			e.salary=e.salary+(e.salary*0.3);
		}
		else if(e.salary<4000)
		{
			e.salary=e.salary+(e.salary*0.2);
		}
		else
		{
			e.salary=e.salary+(e.salary*1.0);
		}
		System.out.println("New Salary : "+e.salary);
	}

}
