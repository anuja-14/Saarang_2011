package iitm.saarang;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Searchresults extends ListActivity {
	 public int t=0;
	 public int first=-1;
	 public String[] list;
	 //={"","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
     private Eventmanager e;
     private pplmanager p;
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.side);
	        String text=new String("");
	        int second=-1;
	        Bundle extras = getIntent().getExtras();
	        if (extras != null) {
	            first = extras.getInt("first");
	            second= extras.getInt("second");
	            text=extras.getString("third");
	            
	        }
	       
	        if(first==0)
	        {
	        	 Button b=(Button)findViewById(R.id.text2);
	             b.setText("Events");
	         if(second==3){	
	        	e=new Eventmanager();
	        	e.createData();
	        	char c;
	        	
	        	String dummy="";
	        	c=text.charAt(0);
	        	Character.toUpperCase(c);
	        	int i=0,j=0,k=0,flag1=0,flag2=0;
	        	
	        	
	        	for(i=0;i<e.allevents.length;i++)
	        	{
	        		flag1=0;
	        		dummy=e.allevents[i].name;
	        	  
	        		for(j=0;j<dummy.length();j++)
	        		{
	        		  if( dummy.charAt(j)==c ) 
	        		  {
	        		
	        		for(k=1;k<text.length() && (k+j)<dummy.length();k++) 
	        		if(text.charAt(k)!=(dummy.charAt(k+j)))
	        			break;
	                if(k==text.length())
	                	{//list[t]=dummy;
	                	t++;break;}
	        		  }
	        		  
	        		
	        		
	        		}
	        		
	        	
	        	}
	        	
	        	list=new String[t];
	        	t=0;
	        	for(i=0;i<e.allevents.length;i++)
	        	{
	        		flag1=0;
	        		dummy=e.allevents[i].name;
	        	  
	        		for(j=0;j<dummy.length();j++)
	        		{
	        		  if( dummy.charAt(j)==c ) 
	        		  {
	        		
	        		for(k=1;k<text.length() && (k+j)<dummy.length();k++) 
	        		if(text.charAt(k)!=(dummy.charAt(k+j)))
	        			break;
	                if(k==text.length())
	                	{list[t]=dummy;
	                	t++;break;}
	        		  }
	        		  
	        		
	        		
	        		}
	        		
	        	
	        	}
                setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,list));	        	
	       
	         
	         
	         }
	         
	         if(second==2)
	         {   
	        	    e=new Eventmanager();
		        	e.createData();
		        	char c;
		        	String dummy="";
		        	String dummy2="";
		        	int d;
		        	c=text.charAt(0);
		        	
		        	int i=0,j=0,k=0,flag1=0,flag2=0;
		        	
		        	for(i=0;i<e.allevents.length;i++)
		        	{
		        		flag1=0;
		        		dummy=e.allevents[i].name;
		        	    dummy2=e.allevents[i].description;
		        		d=t;
		        	    for(j=0;j<dummy.length();j++)
		        		{
		        		  if( dummy.charAt(j)==c ) 
		        		  {
		        		
		        		for(k=1;k<text.length() && (k+j)<dummy.length();k++) 
		        		if(text.charAt(k)!=(dummy.charAt(k+j)))
		        			break;
		                if(k==text.length())
		                	{//list[t]=dummy;
		                	t++;break;}
		        		  }
		        		
		        		
		        		}
		        		if(d==t)
		        		{for(j=0;j<dummy2.length();j++)
		        		{
		        		  if( dummy2.charAt(j)==c ) 
		        		  {
		        		
		        		for(k=1;k<text.length() && (k+j)<dummy2.length();k++) 
		        		if(text.charAt(k)!=(dummy2.charAt(k+j)))
		        			break;
		                if(k==text.length())
		                	{//list[t]=dummy;
		                	t++;break;}
		        		  }
		        		
		        		
		        		}}
		        	}

		        	list=new String[t];
		        	t=0;
		        	for(i=0;i<e.allevents.length;i++)
		        	{
		        		flag1=0;
		        		dummy=e.allevents[i].name;
		        	    dummy2=e.allevents[i].description;
		        		d=t;
		        	    for(j=0;j<dummy.length();j++)
		        		{
		        		  if( dummy.charAt(j)==c ) 
		        		  {
		        		
		        		for(k=1;k<text.length() && (k+j)<dummy.length();k++) 
		        		if(text.charAt(k)!=(dummy.charAt(k+j)))
		        			break;
		                if(k==text.length())
		                	{list[t]=dummy;t++;break;}
		        		  }
		        		
		        		
		        		}
		        		if(d==t)
		        		{for(j=0;j<dummy2.length();j++)
		        		{
		        		  if( dummy2.charAt(j)==c ) 
		        		  {
		        		
		        		for(k=1;k<text.length() && (k+j)<dummy2.length();k++) 
		        		if(text.charAt(k)!=(dummy2.charAt(k+j)))
		        			break;
		                if(k==text.length())
		                	{list[t]=dummy;t++;break;}
		        		  }
		        		
		        		
		        		}}
		        	}
		        	
		        	setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,list));
	        	    
	         
	         }
	         
	         if(second==1)
	         {
	        	    e=new Eventmanager();
		        	e.createData();
		        	char c;
		        	
		        	String dummy="";
		        	c=text.charAt(0);
		        	
		        	int i=0,j=0,k=0,flag1=0,flag2=0;
		        	
		        	for(i=0;i<e.allevents.length;i++)
		        	{
		        		flag1=0;
		        		dummy=e.allevents[i].name;
		        	  
		        		for(j=0;j<dummy.length();j++)
		        		{
		        		  if(Character.toUpperCase(dummy.charAt(j))==Character.toUpperCase(c)) 
		        		  {
		        		
		        		for(k=1;k<text.length() && (k+j)<dummy.length();k++) 
		        		if(Character.toUpperCase(text.charAt(k))!=Character.toUpperCase((dummy.charAt(k+j))))
		        			break;
		                if(k==text.length())
		                	{//list[t]=dummy;
		                	t++;break;}
		        		  }
		        		
		        		
		        		}}
		        	list=new String[t];
		        	t=0;
		        	for(i=0;i<e.allevents.length;i++)
		        	{
		        		flag1=0;
		        		dummy=e.allevents[i].name;
		        	  
		        		for(j=0;j<dummy.length();j++)
		        		{
		        		  if(Character.toUpperCase(dummy.charAt(j))==Character.toUpperCase(c)) 
		        		  {
		        		
		        		for(k=1;k<text.length() && (k+j)<dummy.length();k++) 
		        		if(Character.toUpperCase(text.charAt(k))!=Character.toUpperCase((dummy.charAt(k+j))))
		        			break;
		                if(k==text.length())
		                	{list[t]=dummy;t++;break;}
		        		  }
		        		
		        		
		        		}}
		        
	                setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,list));
	        	 
	         }
	         if(second==0)
	         {
	        	 
	        	    e=new Eventmanager();
		        	e.createData();
		        	char c;
		        	String dummy="";
		        	String dummy2="";
		        	int d;
		        	c=text.charAt(0);
		        	
		        	int i=0,j=0,k=0,flag1=0,flag2=0;
		        	
		        	for(i=0;i<e.allevents.length;i++)
		        	{
		        		flag1=0;
		        		dummy=e.allevents[i].name;
		        	    dummy2=e.allevents[i].description;
		        		d=t;
		        	    for(j=0;j<dummy.length();j++)
		        		{
		        		  if(Character.toUpperCase(dummy.charAt(j))==Character.toUpperCase(c)  ) 
		        		  {
		        		
		        		for(k=1;k<text.length() && (k+j)<dummy.length();k++) 
		        		if(Character.toUpperCase(text.charAt(k))!=Character.toUpperCase((dummy.charAt(k+j))))
		        			break;
		                if(k==text.length())
		                	{//list[t]=dummy;
		                	t++;break;}
		        		  }
		        		
		        		
		        		}
		        		if(d==t){
		        			for(j=0;j<dummy2.length();j++)
		        		{
		        		  if( Character.toUpperCase(dummy2.charAt(j))==Character.toUpperCase(c) ) 
		        		  {
		        		
		        		for(k=1;k<text.length() && (k+j)<dummy2.length();k++) 
		        		if(Character.toUpperCase(text.charAt(k))!=Character.toUpperCase((dummy2.charAt(k+j))))
		        			break;
		                if(k==text.length())
		                	{//list[t]=dummy;
		                	t++;break;}
		        		  }
		        		
		        		
		        		}}
		        	}
		        	list=new String[t];
		        	t=0;
		        	
		        	
		        	for(i=0;i<e.allevents.length;i++)
		        	{
		        		flag1=0;
		        		dummy=e.allevents[i].name;
		        	    dummy2=e.allevents[i].description;
		        		d=t;
		        	    for(j=0;j<dummy.length();j++)
		        		{
		        		  if(Character.toUpperCase(dummy.charAt(j))==Character.toUpperCase(c)  ) 
		        		  {
		        		
		        		for(k=1;k<text.length() && (k+j)<dummy.length();k++) 
		        		if(Character.toUpperCase(text.charAt(k))!=Character.toUpperCase((dummy.charAt(k+j))))
		        			break;
		                if(k==text.length())
		                	{list[t]=dummy;t++;break;}
		        		  }
		        		
		        		
		        		}
		        		if(d==t){
		        			for(j=0;j<dummy2.length();j++)
		        		{
		        		  if( Character.toUpperCase(dummy2.charAt(j))==Character.toUpperCase(c) ) 
		        		  {
		        		
		        		for(k=1;k<text.length() && (k+j)<dummy2.length();k++) 
		        		if(Character.toUpperCase(text.charAt(k))!=Character.toUpperCase((dummy2.charAt(k+j))))
		        			break;
		                if(k==text.length())
		                	{list[t]=dummy;
		                	t++;break;}
		        		  }
		        		
		        		
		        		}}
		        	}
		        	setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,list));
	         }
	         
	     }
	        if(first==1)
		    {   
		    	 Button b=(Button)findViewById(R.id.text2);
		         b.setText("People");
		    	if(second==3)
		    	{	
		        	p=new pplmanager();
		        	p.createdata();
		        	char c;
		        	
		        	String dummy="";
		        	c=text.charAt(0);
		        	Character.toUpperCase(c);
		        	int i=0,j=0,k=0,flag1=0,flag2=0;
		        	
		        	for(i=0;i<p.allppl.length;i++)
		        	{
		        		flag1=0;
		        		dummy=p.allppl[i].name;
		        	  
		        		for(j=0;j<dummy.length();j++)
		        		{
		        		  if( dummy.charAt(j)==c ) 
		        		  {
		        		
		        		for(k=1;k<text.length() && (k+j)<dummy.length();k++) 
		        		if(text.charAt(k)!=(dummy.charAt(k+j)))
		        			break;
		                if(k==text.length())
		                	{//list[t]=dummy;
		                	t++;break;}
		        		  }
		        		
		        		
		        		}}
		        	list=new String[t];
		        	t=0;
		        	for(i=0;i<p.allppl.length;i++)
		        	{
		        		flag1=0;
		        		dummy=p.allppl[i].name;
		        	  
		        		for(j=0;j<dummy.length();j++)
		        		{
		        		  if( dummy.charAt(j)==c ) 
		        		  {
		        		
		        		for(k=1;k<text.length() && (k+j)<dummy.length();k++) 
		        		if(text.charAt(k)!=(dummy.charAt(k+j)))
		        			break;
		                if(k==text.length())
		                	{list[t]=dummy;t++;break;}
		        		  }
		        		
		        		
		        		}}
	                setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,list));	        	
		         }
		    	
		    	

		         if(second==2)
		         {   
		        	    p=new pplmanager();
			        	p.createdata();
			        	char c;
			        	String dummy="";
			        	String dummy2="";
			        	int d;
			        	c=text.charAt(0);
			        	
			        	int i=0,j=0,k=0,flag1=0,flag2=0;
			        	
			        	for(i=0;i<p.allppl.length;i++)
			        	{
			        		flag1=0;
			        		dummy=p.allppl[i].name;
			        	    dummy2=p.allppl[i].department;
			        		d=t;
			        	    for(j=0;j<dummy.length();j++)
			        		{
			        		  if(dummy.charAt(j)==c  ) 
			        		  {
			        		
			        		for(k=1;k<text.length() && (k+j)<dummy.length();k++) 
			        		if(text.charAt(k)!=(dummy.charAt(k+j)))
			        			break;
			                if(k==text.length())
			                	{//list[t]=dummy;
			                	t++;break;}
			        		  }
			        		
			        		
			        		}
			        		if(d==t)
			        		{for(j=0;j<dummy2.length();j++)
			        		{
			        		  if( dummy2.charAt(j)==c ) 
			        		  {
			        		
			        		for(k=1;k<text.length() && (k+j)<dummy2.length();k++) 
			        		if(text.charAt(k)!=(dummy2.charAt(k+j)))
			        			break;
			                if(k==text.length())
			                	{//list[t]=dummy;
			                	t++;break;}
			        		  }
			        		
			        		
			        		}}
			        	}
			        	list=new String[t];
			        	t=0;
			        	for(i=0;i<p.allppl.length;i++)
			        	{
			        		flag1=0;
			        		dummy=p.allppl[i].name;
			        	    dummy2=p.allppl[i].department;
			        		d=t;
			        	    for(j=0;j<dummy.length();j++)
			        		{
			        		  if(dummy.charAt(j)==c  ) 
			        		  {
			        		
			        		for(k=1;k<text.length() && (k+j)<dummy.length();k++) 
			        		if(text.charAt(k)!=(dummy.charAt(k+j)))
			        			break;
			                if(k==text.length())
			                	{list[t]=dummy;t++;break;}
			        		  }
			        		
			        		
			        		}
			        		if(d==t)
			        		{for(j=0;j<dummy2.length();j++)
			        		{
			        		  if( dummy2.charAt(j)==c ) 
			        		  {
			        		
			        		for(k=1;k<text.length() && (k+j)<dummy2.length();k++) 
			        		if(text.charAt(k)!=(dummy2.charAt(k+j)))
			        			break;
			                if(k==text.length())
			                	{list[t]=dummy;t++;break;}
			        		  }
			        		
			        		
			        		}}
			        	}
			        	setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,list));
		        	    
		         
		         }
		         b.setText("People");
			    	if(second==1)
			    	{	
			            p=new pplmanager();
			        	p.createdata();
			        	char c;
			        	
			        	String dummy="";
			        	c=text.charAt(0);
			        	
			        	int i=0,j=0,k=0,flag1=0,flag2=0;
			        	
			        	for(i=0;i<p.allppl.length;i++)
			        	{
			        		flag1=0;
			        		dummy=p.allppl[i].name;
			        	  
			        		for(j=0;j<dummy.length();j++)
			        		{
			        		  if( Character.toUpperCase(dummy.charAt(j))==Character.toUpperCase(c)  ) 
			        		  {
			        		
			        		for(k=1;k<text.length() && (k+j)<dummy.length();k++) 
			        		if(Character.toUpperCase(text.charAt(k))!=Character.toUpperCase((dummy.charAt(k+j))))
			        			break;
			                if(k==text.length())
			                	{//list[t]=dummy;
			                	t++;break;}
			        		  }
			        		
			        		
			        		}}
			        	list=new String[t];
			        	t=0;
			        	for(i=0;i<p.allppl.length;i++)
			        	{
			        		flag1=0;
			        		dummy=p.allppl[i].name;
			        	  
			        		for(j=0;j<dummy.length();j++)
			        		{
			        		  if( Character.toUpperCase(dummy.charAt(j))==Character.toUpperCase(c)  ) 
			        		  {
			        		
			        		for(k=1;k<text.length() && (k+j)<dummy.length();k++) 
			        		if(Character.toUpperCase(text.charAt(k))!=Character.toUpperCase((dummy.charAt(k+j))))
			        			break;
			                if(k==text.length())
			                	{list[t]=dummy;t++;break;}
			        		  }
			        		
			        		
			        		}}
		                setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,list));	        	
			         }
			    	
			    	if(second==0)
			         {   
			        	   p=new pplmanager();
				        	p.createdata();
				        	char c;
				        	String dummy="";
				        	String dummy2="";
				        	int d;
				        	c=text.charAt(0);
				        	
				        	int i=0,j=0,k=0,flag1=0,flag2=0;
				        	
				        	for(i=0;i<p.allppl.length;i++)
				        	{
				        		flag1=0;
				        		dummy=p.allppl[i].name;
				        	    dummy2=p.allppl[i].department;
				        		d=t;
				        	    for(j=0;j<dummy.length();j++)
				        		{
				        		  if( Character.toUpperCase(dummy.charAt(j))==Character.toUpperCase(c)) 
				        		  {
				        		
				        		for(k=1;k<text.length() && (k+j)<dummy.length();k++) 
				        		if(Character.toUpperCase(text.charAt(k))!=Character.toUpperCase((dummy.charAt(k+j))))
				        			break;
				                if(k==text.length())
				                	{
				                	//list[t]=dummy;
				                	t++;break;}
				        		  }
				        		
				        		
				        		}
				        		if(d==t)
				        		{for(j=0;j<dummy2.length();j++)
				        		{
				        		  if( Character.toUpperCase(dummy2.charAt(j))==Character.toUpperCase(c) ) 
				        		  {
				        		
				        		for(k=1;k<text.length() && (k+j)<dummy2.length();k++) 
				        		if(Character.toUpperCase(text.charAt(k))!=Character.toUpperCase((dummy2.charAt(k+j))))
				        			break;
				                if(k==text.length())
				                	{//list[t]=dummy;
				                	t++;break;}
				        		  }
				        		
				        		
				        		}}
				        	}
				        	list=new String[t];
				        	t=0;
				        	for(i=0;i<p.allppl.length;i++)
				        	{
				        		flag1=0;
				        		dummy=p.allppl[i].name;
				        	    dummy2=p.allppl[i].department;
				        		d=t;
				        	    for(j=0;j<dummy.length();j++)
				        		{
				        		  if( Character.toUpperCase(dummy.charAt(j))==Character.toUpperCase(c)) 
				        		  {
				        		
				        		for(k=1;k<text.length() && (k+j)<dummy.length();k++) 
				        		if(Character.toUpperCase(text.charAt(k))!=Character.toUpperCase((dummy.charAt(k+j))))
				        			break;
				                if(k==text.length())
				                	{list[t]=dummy;
				                	t++;break;}
				        		  }
				        		
				        		
				        		}
				        		if(d==t)
				        		{for(j=0;j<dummy2.length();j++)
				        		{
				        		  if( Character.toUpperCase(dummy2.charAt(j))==Character.toUpperCase(c) ) 
				        		  {
				        		
				        		for(k=1;k<text.length() && (k+j)<dummy2.length();k++) 
				        		if(Character.toUpperCase(text.charAt(k))!=Character.toUpperCase((dummy2.charAt(k+j))))
				        			break;
				                if(k==text.length())
				                	{list[t]=dummy;t++;break;}
				        		  }
				        		
				        		
				        		}}
				        	}
				        	setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem,list));
			        	    
			         
			         }
		    	
		    }   
		     
	        }
	    
	    
	    @Override
	    protected void onListItemClick(ListView l, View v, int position, long id) {
	        super.onListItemClick(l, v, position, id);
	        if(position<=t)
	        {	
	        Intent i;
	        if(first==0)
	         {i = new Intent(this,Eventbody.class);
	         Bundle b = new Bundle(); 
	         b.putString("value",e.finddesbysub(list[position]));
	         b.putString("value2", list[position]);
	         i.putExtras(b);
	         startActivity(i);}
	        if(first==1)
	        {i = new Intent(this,pplinfo.class);
	        Bundle b = new Bundle(); 
		    b.putString("value",list[position]);
		    i.putExtras(b);
	        startActivity(i);;}
	        }
	    }
	    








}

