package iitm.saarang;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import android.widget.AbsoluteLayout.LayoutParams;

public class map extends Activity {
	private static final int zoomin = Menu.FIRST;
    private static final int zoomout = Menu.FIRST + 1;
    private static final int  locate= Menu.FIRST + 2;
    private static final int  main= Menu.FIRST + 3;
    private static final int  event= Menu.FIRST + 4;
    private int option=-1;
    public ImageView[] i=new ImageView[14];;
	private float mx;
    private float my;
   private float displacement;
   private String[] venues={"ICSR","HSB","CHLT","CLT","PHLT","FA HUT","SANGAM","OAT","SANSKRITI","DOMS","sac","BINDAAS","INFORMALS","PAINTBALL"};;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        setContentView(R.layout.map2);
        
        int title=-1;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            title = extras.getInt("value");
            option=title;
        }
      
        
        
        
        AbsoluteLayout.LayoutParams layoutparams=new AbsoluteLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 265, 90);
        
        i[0]=(ImageView)findViewById(R.id.venue1);//icsr
        
        i[0].setLayoutParams(layoutparams);
        layoutparams=new AbsoluteLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 260, 165);
        i[1]=(ImageView)findViewById(R.id.venue2);//hsb
        i[1].setLayoutParams(layoutparams);
        layoutparams=new AbsoluteLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 270, 170);
        i[2]=(ImageView)findViewById(R.id.venue3);//chlt
        i[2].setLayoutParams(layoutparams);
        layoutparams=new AbsoluteLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 265, 195);
        i[3]=(ImageView)findViewById(R.id.venue4);//clt
        i[3].setLayoutParams(layoutparams);
        layoutparams=new AbsoluteLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 268, 235);
        i[4]=(ImageView)findViewById(R.id.venue5);//phlt
        i[4].setLayoutParams(layoutparams);
        layoutparams=new AbsoluteLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 290, 190);
        i[5]=(ImageView)findViewById(R.id.venue6);//fa hut
        i[5].setLayoutParams(layoutparams);
        layoutparams=new AbsoluteLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 340, 190);
        i[6]=(ImageView)findViewById(R.id.venue7);//sangam
        i[6].setLayoutParams(layoutparams);
        layoutparams=new AbsoluteLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 340, 235);
        i[7]=(ImageView)findViewById(R.id.venue8);//oat
        
        i[7].setLayoutParams(layoutparams);
        layoutparams=new AbsoluteLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 315, 255);
        i[8]=(ImageView)findViewById(R.id.venue9);//sanskriti
        i[8].setLayoutParams(layoutparams);
        layoutparams=new AbsoluteLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 373, 97);
        
        i[9]=(ImageView)findViewById(R.id.venue10);//doms
        
        i[9].setLayoutParams(layoutparams);
 layoutparams=new AbsoluteLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 530, 197);
        
        i[10]=(ImageView)findViewById(R.id.venue11);//sac
        
        i[10].setLayoutParams(layoutparams);
     layoutparams=new AbsoluteLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 503, 200);
        
        i[11]=(ImageView)findViewById(R.id.venue12);//bindaas
        
        i[11].setLayoutParams(layoutparams);
layoutparams=new AbsoluteLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 533, 217);
        
        i[12]=(ImageView)findViewById(R.id.venue13);//informals
        
        i[12].setLayoutParams(layoutparams);
layoutparams=new AbsoluteLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 514, 227);
        
        i[13]=(ImageView)findViewById(R.id.venue14);//paintball
        
        i[13].setLayoutParams(layoutparams);
        final AbsoluteLayout switcherView = (AbsoluteLayout) this.findViewById(R.id.myLayout);
        displacement=-62;
        
        if(title!=-1)
        {
         for(int t=0;t<14;t++)
         {
        	 i[t].setImageResource(R.drawable.venuemarker);
         }
         i[title].setImageResource(R.drawable.highlightpin);
        
        if(title<10)
        	switcherView.scrollTo(150, 50);
        else
        	switcherView.scrollTo(300, 50);
        
        
        }
        ImageView f=(ImageView)findViewById(R.id.im);
        switcherView.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View arg0, MotionEvent event) {

                float curX, curY;

                switch (event.getAction()) {

                    case MotionEvent.ACTION_DOWN:
                        mx = event.getX();
                        my = event.getY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        curX = event.getX();
                        curY = event.getY();
                        switcherView.scrollBy((int) (mx - curX), (int) (my - curY));
                        mx = curX;
                        my = curY;
                        break;
                    case MotionEvent.ACTION_UP:
                        curX = event.getX();
                        curY = event.getY();
                        switcherView.scrollBy((int) (mx - curX), (int) (my - curY));
                        break;
                }

                return true;
            }
        });
        	
        i[0].setOnClickListener(new View.OnClickListener() {
           
				@Override
				public void onClick(View v) {
					option=0;
					i[0].setImageResource(R.drawable.highlightpin);
					for(int t=0;t<14;t++)
				        if(t!=0)
				        	i[t].setImageResource(R.drawable.venuemarker);
				}}
        			);
        i[1].setOnClickListener(new View.OnClickListener() {
            
			@Override
			public void onClick(View v) {
				option=1;
				i[1].setImageResource(R.drawable.highlightpin);
				for(int t=0;t<14;t++)
			        if(t!=1)
			        	i[t].setImageResource(R.drawable.venuemarker);
			}});
 i[2].setOnClickListener(new View.OnClickListener() {
            
			@Override
			public void onClick(View v) {
				option=2;
				i[2].setImageResource(R.drawable.highlightpin);
				for(int t=0;t<14;t++)
			        if(t!=2)
			        	i[t].setImageResource(R.drawable.venuemarker);
			}});
 i[3].setOnClickListener(new View.OnClickListener() {
     
		@Override
		public void onClick(View v) {
			option=3;
			i[3].setImageResource(R.drawable.highlightpin);
			for(int t=0;t<14;t++)
		        if(t!=3)
		        	i[3].setImageResource(R.drawable.venuemarker);
		}});
 i[4].setOnClickListener(new View.OnClickListener() {
     
		@Override
		public void onClick(View v) {
			option=4;
			i[4].setImageResource(R.drawable.highlightpin);
			for(int t=0;t<14;t++)
		        if(t!=4)
		        	i[t].setImageResource(R.drawable.venuemarker);
		}});
 i[5].setOnClickListener(new View.OnClickListener() {
     
		@Override
		public void onClick(View v) {
			option=5;
			i[5].setImageResource(R.drawable.highlightpin);
			for(int t=0;t<14;t++)
		        if(t!=5)
		        	i[t].setImageResource(R.drawable.venuemarker);
		}});
 i[6].setOnClickListener(new View.OnClickListener() {
     
		@Override
		public void onClick(View v) {
			option=6;
			i[6].setImageResource(R.drawable.highlightpin);
			for(int t=0;t<14;t++)
		        if(t!=6)
		        	i[t].setImageResource(R.drawable.venuemarker);
		}}
    			);
 i[7].setOnClickListener(new View.OnClickListener() {
     
		@Override
		public void onClick(View v) {
			option=7;
			i[7].setImageResource(R.drawable.highlightpin);
			for(int t=0;t<14;t++)
		        if(t!=7)
		        	i[t].setImageResource(R.drawable.venuemarker);
		}}
 			);
 i[8].setOnClickListener(new View.OnClickListener() {
     
		@Override
		public void onClick(View v) {
			option=8;
			i[8].setImageResource(R.drawable.highlightpin);
			for(int t=0;t<14;t++)
		        if(t!=8)
		        	i[t].setImageResource(R.drawable.venuemarker);
		}}
 			);
 i[9].setOnClickListener(new View.OnClickListener() {
     
		@Override
		public void onClick(View v) {
			option=9;
			i[9].setImageResource(R.drawable.highlightpin);
			for(int t=0;t<14;t++)
		        if(t!=9)
		        	i[t].setImageResource(R.drawable.venuemarker);
		}}
 			);
 i[10].setOnClickListener(new View.OnClickListener() {
     
		@Override
		public void onClick(View v) {
			option=10;
			i[10].setImageResource(R.drawable.highlightpin);
			for(int t=0;t<14;t++)
		        if(t!=10)
		        	i[t].setImageResource(R.drawable.venuemarker);
		}}
 			);
 i[11].setOnClickListener(new View.OnClickListener() {
     
		@Override
		public void onClick(View v) {
			option=11;
			if(i[11].getDrawable().equals(R.drawable.venuemarker))
			{i[11].setImageResource(R.drawable.highlightpin);
			for(int t=0;t<14;t++)
		        if(t!=11)
		        	i[t].setImageResource(R.drawable.venuemarker);}
		}}
 			);
 i[12].setOnClickListener(new View.OnClickListener() {
     
		@Override
		public void onClick(View v) {
			option=12;
			i[12].setImageResource(R.drawable.highlightpin);
			for(int t=0;t<14;t++)
		        if(t!=12)
		        	i[t].setImageResource(R.drawable.venuemarker);
		}}
 			);
 i[13].setOnClickListener(new View.OnClickListener() {
     
		@Override
		public void onClick(View v) {
			option=13;
			i[13].setImageResource(R.drawable.highlightpin);
			for(int t=0;t<14;t++)
		        if(t!=13)
		        	i[t].setImageResource(R.drawable.venuemarker);
		}}
 			);
 
        
        switcherView.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View arg0, MotionEvent event) {

                float curX, curY;

                switch (event.getAction()) {

                    case MotionEvent.ACTION_DOWN:
                        mx = event.getX();
                        my = event.getY();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        curX = event.getX();
                        curY = event.getY();
                        switcherView.scrollBy((int) (mx - curX), (int) (my - curY));
                        mx = curX;
                        my = curY;
                        break;
                    case MotionEvent.ACTION_UP:
                        curX = event.getX();
                        curY = event.getY();
                        switcherView.scrollBy((int) (mx - curX), (int) (my - curY));
                        break;
                }

                return true;
            }
        });
        switcherView.setOnKeyListener(new View.OnKeyListener() {

			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				if(keyCode==KeyEvent.KEYCODE_DPAD_UP)
				switcherView.scrollBy(-10, 0);
				if(keyCode==KeyEvent.KEYCODE_DPAD_DOWN)
					switcherView.scrollBy(10, 0);
				if(keyCode==KeyEvent.KEYCODE_DPAD_LEFT)
					switcherView.scrollBy(0, -10);
				if(keyCode==KeyEvent.KEYCODE_DPAD_RIGHT)
					switcherView.scrollBy(0, 10);
				return true;
			}

           
        });
       /* KeyboardView.setOnKeyboardActionListener(new OnKeyboardActionListener() {

		
			@Override
			public void onKey(int primaryCode, int[] keyCodes) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onPress(int primaryCode) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onRelease(int primaryCode) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onText(CharSequence text) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void swipeDown() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void swipeLeft() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void swipeRight() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void swipeUp() {
				// TODO Auto-generated method stub
				
			}

           
        });*/
        
     
    }
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        
        menu.add(0, zoomin, 0, "Zoom in");
        menu.add(0, zoomout, 0, "Zoom out");
        menu.add(0,locate,0,"Locate Venue");
        menu.add(0,main,0,"Mainmenu");
        menu.add(0,event,0,"Events");
        return true;
    }   
    
    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        switch(item.getItemId()) {
        case zoomin:
        	
        	ImageView l=(ImageView)findViewById(R.id.im);
            AbsoluteLayout.LayoutParams layoutParams=(LayoutParams) l.getLayoutParams();
        	int x=layoutParams.width;
        	int y=layoutParams.height;
        	displacement=(float) (displacement*1.5);
        	AbsoluteLayout.LayoutParams layoutparams=new AbsoluteLayout.LayoutParams((int)(x*1.5), (int)(y*1.5), 0, (int)displacement);
            l.setLayoutParams(layoutparams);
            
            for(int t=0;t<14;t++)
            {AbsoluteLayout.LayoutParams venueParams=(LayoutParams) i[t].getLayoutParams();
        	x=venueParams.x;
        	y=venueParams.y;
        	AbsoluteLayout.LayoutParams venueparams=new AbsoluteLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, (int) (x*1.5), (int) (y*1.5));
        	i[t].setLayoutParams(venueparams);
            }
        	
        	
        	
            AbsoluteLayout switcherView = (AbsoluteLayout) this.findViewById(R.id.myLayout);
            int posx=switcherView.getScrollX();
        	int posy=switcherView.getScrollY();
            switcherView.scrollTo((int)(posx*1.5), (int)(posy*1.5));
            
            
            
            
            break;
        case zoomout:
        	
        	ImageView f=(ImageView)findViewById(R.id.im);
        	
            
        	AbsoluteLayout.LayoutParams layoutParams2=(LayoutParams) f.getLayoutParams();
        	x=layoutParams2.width;
        	y=layoutParams2.height;
        	displacement=(float) (displacement/1.5);
        	
        	AbsoluteLayout.LayoutParams layoutparams2=new AbsoluteLayout.LayoutParams((int)(x/1.5), (int)(y/1.5), 0, (int)displacement);
            f.setLayoutParams(layoutparams2);
            AbsoluteLayout switcherView2 = (AbsoluteLayout) this.findViewById(R.id.myLayout);
            posx=switcherView2.getScrollX();
        	posy=switcherView2.getScrollY();
            switcherView2.scrollTo((int)(posx/1.5), (int)(posy/1.5));
            for(int t=0;t<14;t++)
            {AbsoluteLayout.LayoutParams venueParams=(LayoutParams) i[t].getLayoutParams();
        	x=venueParams.x;
        	y=venueParams.y;
        	AbsoluteLayout.LayoutParams venueparams=new AbsoluteLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, (int) (x/1.5), (int) (y/1.5));
        	i[t].setLayoutParams(venueparams);
            }
        	break; 	
        
        case locate:
        	 Intent in = new Intent(this,venue.class);
        	 startActivity(in);
             break;
        case main:
        	in=new Intent(this,saarangmain.class);
        	startActivity(in);
        	break;
        case event:
        	if(option!=-1)
        	{in=new Intent(this,Eventsub.class);
        	Bundle b=new Bundle();
        	b.putString("value",venues[option]);
        	b.putInt("value1", 1);
        	in.putExtras(b);
        	startActivity(in);
        	}
        	break;
    	}
      return true;  
    }




}

