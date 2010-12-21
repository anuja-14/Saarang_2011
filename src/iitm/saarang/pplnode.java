package iitm.saarang;

public class pplnode {
	 public int id;
	 public String name;
	 public String type;
	 public String nick;
	 public String department;
	 public String phno;
	 pplnode(int id, String name,String nick,String no,String department)
	 {
		this.id=id;
		this.name=name;
		this.nick=nick;
		this.department=department;
		this.phno=no;
		
	 }	 
	 void settype(int a)
	 {
		 if(a==0)
			 this.type="Coordinators";
		 if(a==1)
			 this.type="Cores";
		 
		 
	 }
	 
	 

}
