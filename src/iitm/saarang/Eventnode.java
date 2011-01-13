package iitm.saarang;

public class Eventnode{
 public int id;
 public String name;
 public String type;
 public long bookid=-1;
 pplnode[] coords;
 //public String subtype;
 public String description;
 Eventnode(int id, String name,String type,String description,pplnode[] coords)
 {
	this.id=id;
	this.name=name;
	this.type=type;
	this.description=description;
    this.coords=coords;	
 }
}
