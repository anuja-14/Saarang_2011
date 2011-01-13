package iitm.saarang;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import org.apache.http.util.ByteArrayBuffer;

import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
public class Schedule extends ListActivity {
private SaarangDbAdapter mDbhelper;
private String temp="anu";
private String[] DayList={"Day0","Day1","Day2","Day3","Day4"};   
private static final int update = Menu.FIRST;
private static int update_number=5;
private Button t;
/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) 
{
	
super.onCreate(savedInstanceState);
setContentView(R.layout.side);
mDbhelper=new SaarangDbAdapter(this);
mDbhelper.open();
 t=(Button)findViewById(R.id.text2);
//t.setText("Events");
//prepdb();
 Cursor c=mDbhelper.fetchAllEvents("1");
 if(c.getCount()<5)
 {
 String data="-1,0,Kamal Haasan & Gautham Menon Lectures,5,1,900,1200,ICSR Main Auditorium\n-1,1,A Cappella,16,1,900,1400,CLT\n-1,2,Biz Quiz Prelims,22,1,900,1100,PhLT & ChLT\n-1,3,Classical Dance Prelims,31,1,900,1130,HSB 333 & 334\n-1,4,Tarang,9,1,900,1700,Bindaas Park\n-1,5,Colorz,41,1,900,1230,FA Hut\n-1,6,Saarang Village (Gujarat),4,1,900,1700,Sanskriti\n-1,7,Dreams on Canvas - Exhibition,0,1,900,1700,ICSR Exhibition Hall\n-1,8,Sand Sculpture Workshop,55,1,900,1700,Sangam\n-1,9,Paintball,51,1,900,1700,Paintball Arena\n-1,10,Essence Changemakers Workshop,2,1,1000,1600,ICSR Hall 2\n-1,11,Whose Line Prelims,45,1,1000,1200,HSB 357\n-1,12,Dance Workshop 1,55,1,1000,1200,SAC\n-1,13,SFM Finals,28,1,1100,1200,ICSR Hall 1\n-1,14,Radio Play,21,1,1100,1400,HSB 133\n-1,15,Potpourri Prelims,44,1,1100,1400,PhLT & ChLT\n-1,16,Oopali Ooparajitha Dance LecDem,5,1,1200,1400,ICSR Main Auditorium\n-1,17,Debate Prelims,34,1,1200,1400,HSB 333 & 334\n-1,18,Fine Arts Workshop,55,1,1230,1430,FA Hut\n-1,19,Puppet Musings Workshop,55,1,1300,1500,ICSR Hall 1\n-1,20,Etude (WM Instrumental),15,1,1400,1600,CLT\n-1,21,Anjali Menon Lecture,5,1,1400,1600,ICSR Main Auditorium\n-1,22,Photography Workshop,55,1,1400,1700,HSB 133\n-1,23,SpEnt Quiz Prelims,23,1,1400,1600,PhLT & ChLT\n-1,24,Extempore Prelims,36,1,1400,1800,HSB 333 & 334\n-1,25,Fourth Estate Round 1,27,1,1500,1800,ICSR Hall 1\n-1,26,Mono Acting,19,1,1600,1800,CLT\n-1,27,Crossie Prelims,38,1,1600,1800,PhLT & ChLT\n-1,28,T. Raumschmiere (World Music Festival),56,1,1600,2400,SAC\n-1,29,Choreo Nite,30,1,1730,2400,OAT\n-1,30,Soap Carving,41,1,1430,1800,FA Hut\n-1,31,Dramatics,18,2,900,1200,CLT\n-1,32,Main Quiz Prelims,24,2,900,1100,PhLT & ChLT\n-1,33,Classical Vocals Prelims,11,2,900,1300,HSB 356 & 357\n-1,34,Saarang Village (Gujarat),4,2,900,1700,Sanskriti\n-1,35,Dreams on Canvas - Exhibition,0,2,900,1700,ICSR Exhibition Hall\n-1,36,Sand Sculpture Workshop,55,2,900,1700,Sangam\n-1,37,Decibels,13,2,900,1700,Bindaas Park\n-1,38,Shades of Grey,41,2,900,1100,FA Hut\n-1,39,Dance Workshop 2,55,2,900,1200,SAC\n-1,40,2HBC - Hip Hop Challenge,58,2,1300,1600,SAC\n-1,41,JAM Prelims,33,2,1000,1200,ICSR Main Auditorium\n-1,42,Antakshari Prelims,42,2,1000,1600,HSB 133\n-1,43,Creative Writing 1,39,2,1000,1200,HSB 333 & 334\n-1,44,Scavenger Hunt Begins,49,2,1000,2400,Informals Stage\n-1,45,Scavenger Hunt Ends,49,2,1600,1630,HSB 356\n-1,46,India Quiz Prelims,25,2,1100,1300,PhLT & ChLT\n-1,47,DJ Zen \"Rhythms on Disk\" Workshop,55,2,1000,1200,DOMS Seminar Hall\n-1,48,Fine Arts Workshop,55,2,1000,1330,FA Hut\n-1,49,Kavitha Seth LecDem,5,2,1400,1600,ICSR Main Auditorium\n-1,50,Scrabble Prelims,40,2,1400,1600,HSB 333 & 334\n-1,51,Whose Line Finals,45,2,1400,1630,HSB 357\n-1,52,Arty-Stiks,41,2,1330,1530,FA Hut\n-1,53,Fourth Estate Round 2,27,2,1500,1800,ICSR Hall 1\n-1,54,Personality Workshop,55,2,1300,1500,ICSR Hall 1\n-1,55,Photography Contest,29,2,1600,1700,HSB 133\n-1,56,Geo-Genius Prelims,26,2,1600,1800,HSB 333 & 334\n-1,57,Ziskakan (World Music Festival),56,2,1600,2400,SAC\n-1,58,Decibels Finals,13,2,1730,2400,OAT\n-1,59,Tarang Finals,9,2,1730,2400,OAT\n-1,60,SpEnt Quiz Finals,23,2,2200,2400,OAT\n-1,61,Scrabble Finals,40,2,2200,2400,OAT\n-1,62,Classical Instrumental (Non-Percussion),10,2,1300,2400,DOMS Seminar Hall\n-1,63,Paintball,51,2,900,1700,Paintball Arena\n-1,64,Cluedo Prelims,43,3,1000,1200,HSB 357\n-1,65,Saarang Village (Gujarat),4,3,900,1700,Sanskriti\n-1,66,Dreams on Canvas - Exhibition,0,3,900,1700,ICSR Exhibition Hall\n-1,67,Sand Sculpture Workshop,55,3,900,1700,Sangam\n-1,68,Classical Instrumental (Percussion),10,3,900,1200,DOMS Seminar Hall\n-1,69,Powerchords,14,3,900,1700,Bindaas Park\n-1,70,Face Me,41,3,900,1100,FA Hut\n-1,71,Classical Dance Finals,31,3,1000,1200,CLT\n-1,72,Arun Shourie Lecture,5,3,1000,1200,ICSR Main Auditorium\n-1,73,The Great Hunt Begins,50,3,1000,2400,Informals Stage\n-1,74,Fourth Estate Finals,27,3,930,1230,ICSR Hall 1\n-1,75,Antakshari Finals,42,3,1000,1400,HSB 133\n-1,76,Main Quiz Semis 1 & 2,24,3,1000,1300,HSB 356\n-1,77,Junk Craft Workshop,55,3,1100,1300,HSB 357\n-1,78,LM Solo Prelims,8,3,1100,1800,PhLT & ChLT\n-1,79,Dance Workshop 3,55,3,1000,1200,SAC\n-1,80,Extempore Finals,36,3,1200,1500,CLT\n-1,81,Essence Workshop,2,3,1200,1800,ICSR Hall 2\n-1,82,Bombay Jayashri LecDem,5,3,1200,1400,ICSR Main Auditorium\n-1,83,Cluedo Finals,43,3,1230,1530,ICSR Hall 1\n-1,84,WTGW Prelims,37,3,1400,1600,HSB 333 & 334\n-1,85,Sabu Cyril Lecture,5,3,1400,1600,ICSR Main Auditorium\n-1,86,Pottery Making Workshop,55,3,1130,1430,FA Hut\n-1,87,Klay Kraft,41,3,1430,1700,FA Hut\n-1,88,Debate Semis & Finals,34,3,1500,1800,CLT\n-1,89,Classical Vocals Finals,11,3,1500,1800,DOMS Seminar Hall\n-1,90,Culture Show,7,3,1200,1530,SAC\n-1,91,Five Point Someone,56,3,1500,1800,SAC\n-1,92,Photography Contest,29,3,1600,1800,HSB 133\n-1,93,Geo-Genius Finals,26,3,1600,1800,HSB 357\n-1,94,The Great Hunt Ends,50,3,1530,1600,OAT\n-1,95,Shankar-Ehsaan-Loy (Popular Night),56,3,1830,2400,OAT\n-1,96,Main Quiz Finals,24,3,2200,2400,OAT\n-1,97,Paintball,51,3,900,1700,Paintball Arena\n-1,98,Chocolate Making Workshop,55,4,900,1700,HSB 133\n-1,99,Elocution,35,4,1200,1500,DOMS Seminar Hall\n-1,100,Acoustyx,17,4,900,1430,CLT\n-1,101,India Quiz Finals,25,4,900,1100,ICSR Main Auditorium\n-1,102,Dreams on Canvas - Exhibition,0,4,900,1700,ICSR Exhibition Hall\n-1,103,Sand Sculpture Workshop,55,4,900,1700,Sangam\n-1,104,Freestyle Solo Dance,32,4,900,1700,Bindaas Park\n-1,105,Comic Strip,41,4,900,1100,FA Hut\n-1,106,Dance Workshop 4,55,4,900,1300,SAC\n-1,107,Essence Finals,2,4,1000,1300,ICSR Hall 2\n-1,108,Potpourri Finals,44,4,1000,1300,HSB 357\n-1,109,Street Play,20,4,1000,1800,Sanskriti\n-1,110,Creative Writing 2,39,4,1100,1500,HSB 333 & 334\n-1,111,Biz Quiz Finals,22,4,1100,1400,ICSR Main Auditorium\n-1,112,Fine Arts Workshop,55,4,1130,1430,FA Hut\n-1,113,Crossie Finals,38,4,1300,1500,DOMS Seminar Hall\n-1,114,STEP,58,4,1300,1500,SAC\n-1,115,SFM Finals Screening and Judging,28,4,1100,1400,ICSR Hall 1\n-1,116,Padma Subramaniam & Neena Prasad Dance LecDem,5,4,1400,1600,ICSR Main Auditorium\n-1,117,LM Solo Finals,8,4,1430,1700,CLT\n-1,118,Expressions,41,4,1400,1700,FA Hut\n-1,119,WTGW Finals,37,4,1500,1700,HSB 357\n-1,120,JAM Finals,33,4,1600,2400,ICSR Main Auditorium\n-1,122,Paintball,51,4,900,1700,Paintball Arena\n-1,123,Mr & Ms Saarang Finals,6,4,1430,1730,OAT\n-1,124,Hurricane Bells & HammerFall (The Rock Show),56,4,1730,2400,OAT\n-1,125,Classical Night,56,0,1730,2400,OAT\n-1,126,Elocution,35,4,1300,1600,HSB 356\n-2,1,Vox-A-Cappella\n-6,3,1200\n-6,4,1730\n-6,6,1730\n-6,7,1730\n-6,8,1730\n-6,9,1730\n-8,10,HSB 356\n-6,24,1730\n-6,25,1730\n-6,26,1730\n-6,27,1730\n-6,28,1730\n-6,30,1730\n-6,31,1730\n-6,33,1400\n-8,33,HSB 357\n-6,34,1730\n-6,35,1730\n-6,36,1730\n-6,37,1730\n-6,38,1130\n-6,39,1300\n-6,41,1400\n-6,43,1400\n-6,44,1030\n-8,45,OAT\n-7,47,1100,1300\n-7,48,1130,1430\n-8,51,HSB 356\n-7,52,1430,1700\n-6,53,1730\n-6,56,1730\n-6,57,1730\n-6,62,1730\n-6,63,1730\n-8,64,HSB 333 & 334\n-6,64,1300\n-6,65,1730\n-6,66,1730\n-6,67,1730\n-6,69,1730\n-6,70,1130\n-6,73,1030\n-6,76,1400\n-6,78,1730\n-6,81,1730\n-6,88,1730\n-6,89,1730\n-7,91,1530,1730\n-6,92,1700\n-6,93,1730\n-5,95,1730\n-6,97,1730\n-6,98,1730\n-4,99,3\n-6,102,1730\n-6,103,1730\n-6,104,1730\n-6,105,1130\n-6,106,1200\n-6,109,1730\n-7,114,1200,1600\n-5,118,1430\n-6,120,1730\n-6,122,1730\n-7,86,0900,1730\n-1,127,Pottery Making Workshop,55,2,0900,1730,FA Hut\n-1,128,Fine Arts Workshop,55,3,1130,1430,FA Hut";
get_update(data);
 }
 setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem, DayList));

}

@Override
protected void onListItemClick(ListView l, View v, int position, long id) {
    super.onListItemClick(l, v, position, id);
    Intent i = new Intent(this,DaySub.class);
    Bundle b = new Bundle(); 
    b.putString("value",DayList[position]);
    i.putExtras(b);
    startActivity(i);
}
public boolean onCreateOptionsMenu(Menu menu) {
    super.onCreateOptionsMenu(menu);
    
    
    menu.add(0, update, 0, "Update");
     return true;
}  


public void prepdb()

{
	String day0="Classical Night#17:30 onwards#OAT#0#57#$%^";
String day1="Dreams on Canvas - Exhibition#9:00-17:30#ICSR Exhibition Hall#1#49#$%Paintball#9:00-17:30#Paintball Arena#1#44#$%Saarang Village(Gujarat)#9:00-17:30#Sanskriti#1#53#$%Sand Sculpture Workshop#9:00-17:30#Sangam#1#48#$%Vox-A-Capella#9:00-14:00#CLT#1#7#$%Etude(WM Instrumental)#14:00-16:00#CLT#1#6#$%Monoacting#16:00-17:30#CLT#1#12#$%Kamal Hassan and Gautham Menon Lecture#9:00-12:00#ICSR Main Auditorium#1#54#$%Oopali Operajitha dance LceDem#12:00-14:00#ICSR Main Auditorium#1#54#$%Anjali Menon Lecture#14:00-16:00#ICSR Main Auditorium#1#54#$%SFM Finals Begins#11:00-12:00#ICSR Hall 1#1#21#$%Puppet Musing Workshop#13:00-15:00#ICSR Hall 1#1#48#$%Fourth Estate-Round One#15:00-17:30#ICSR Hall 1#1#20#$%Radio Play#11:00-14:00#HSB 133#1#14#$%Photography Workshop#14:00-17:00#HSB 133#1#48#$%BiZ Quiz(Prelims)#9:00-11:00#PhLT & ChLT#1#15#$%Potpourri(Prelims)#11:00-14:00#PhLT & ChLT#1#37#$%SpEnt Quiz(Prelims)#14:00-16:00#PhLT & ChLT#1#16#$%Crossie(Prelims)#16:00-17:30#PhLT & ChLT#1#31#$%Essence Changemakers WS#10:00-16:00#HSB 356#1#51#$%Whose Line(Prelims)#10:00-12:00#HSB 357#1#38#$%Classical Dance Prelims#9:00-12:00#HSB 333 & 334#1#24#$%Debate Prelims#12:00-14:00#HSB 333 & 334#1#27#$%Extempore (Prelims)#14:00-17:30#HSB 333 & 334#1#29#$%Tarang#9:00-17:30#Bindass Park#1#2#$%Colorz#9:00-12:30#FA Hut#1#34#$%Fine Arts Workshop#12:30-14:30#FA Hut#1#48#$%Soap Carving#14:30-17:30#FA Hut#1#34#$%Dance Workshop 1#10:00-12:00#SAC#1#48#$%T.Raumschmiere (World Music Festival)#16:00-17:30#SAC#1#57#$%Choreo Nite#17:30 onwards#OAT#1#23#$%^ ";
String day2="Pottery Making Workshop#9:00-17:30#FA Hut#2#48#$%Dreams on Canvas - Exhibition#9:00-17:30#ICSR Exhibition Hall#2#49#$%Paintball#9:00-17:30#Paintball Arena#2#44#$%Saarang Village(Gujarat)#9:00-17:30#Sanskriti#2#53#$%Sand Sculpture Workshop#9:00-17:30#Sangam#2#48#$%Dramatics#9:00-17:30#CLT#2#11#$%JAM Prelims#10:00-14:00#ICSR Main Auditorium#2#26#$%Kavitha Seth#1        4:00-16:00#ICSR Main Auditorium#2#54#$%Personality Workshop#13:00-15:00#ICSR Hall 1#2#48#$%Fouth Estate-Round two#15:00-17:30#ICSR Hall 1#2#20#$%Antakshari(Prelims)#10:00-16:00#HSB133#2#35#$%Photography Contest#16:00-17:00#HSB 133#2#22#$%Main Quiz Prelims#9:00-11:00#PhLT & ChLT#2#17#$%India Quiz Prelims#11:00-13:00#PhLT  & ChLT#2#18#$%DJ Zen 'Rhythms on disk'Workshop#11:00-13:00#DoMS Seminar Hall#2#48#$%Classical Instrumental(Non-Precussion)#13:00-17:30#DoMS Seminar Hall#2#10#$%Whose Line Finals#14:00-16:30#HSB 356#2#38#$%Classical Vocals Prelims#9:00-14:00#HSB 357#2#9#$%Creative Writing 1#10:00-14:00#HSB 333 & 334#2#32#$%Scrabble Prelims#14:00-16:00#HSB 333 & 334#2#33#$%Geo-Genius Prelims#16:00-17:30#HSB 333 & 334#2#19#$%Decibels#9:00-17:30#Bindass Park#2#4#$%Shades of Grey#9:00-11:30#FA Hut#2#34#$%Fine Arts WS#11:30-14:30#FA Hut#2#48#$%Arty-Stiks#14:30-17:00#FA Hut#2#34#$%Dance Workshop 2#9:00-13:00#SAC#2#48#$%2HBC-Hip Hop Challenge#13:00-16:00#SAC#2#94#$%Ziskakan(World Music Festival)#16:00-17:30#SAC#2#57#$%Scavenger Hunt Begins#10:00-10:30#Informals Stage#2#42#$%Scavenger Hunt Ends#16:00-16:30#OAT#2#42#$%Decibels Finals#17:30 onwards#OAT#2#4#$%Tarang Finals#17:30 onwards#OAT#2#2#$%SpEnt quiz finals#22:00 onwards#OAT#2#16#$%Scrabble Finals#22 :00 onwards#OAT#2#33#$%^";
String day3=" Pottery Making Workshop#9:00-17:30#FA Hut#3#48#$%Dreams on Canvas - Exhibition#9:00-17:30#ICSR Exhibition Hall#3#49#$%Paintball#9:00-17:30#Paintball Arena#3#44#$%Saarang Village(Gujarat)#9:00-17:30#Sanskriti#3#53#$%Sand Sculpture Workshop#9:00-17:30#Sangam#3#48#$%Classical Dance(finals)#10:00-12:00#CLT#3#24#$%Extempore Finals#12:00-15:00#CLT#3#29#$%Debate(Semis + Finals)#15:00-17:30#CLT#3#27#$%Arun Shourie#10:00-12:00#ICSR Main Auditorium#3#54#$%Bombay Jayshree#12:00-14:00#ICSR Main Auditorium#3#54#$%Sabu Cyril#14:00-16:00#ICSR Main Auditorium#3#54#$%Fourth Estate(finals)#9:30-12:30#ICSR Hall 1#3#20#$%Cleudo(Finals)#12:30-15:30#ICSR Hall 1#3#36#$%Essence Workshop#12:00-17:30#ICSR Hall 2#3#51#$%Antakshari finals#10:00-14:00#HSB 133#3#35#$%Photography Contest#16:00-17:00#HSB 133#3#22#$%LM Solo Prelims#11:00-17:30#PhLT & ChLT#3#1#$%Classical Instruments(Precurssion)#9:00-12:00#DoMS Seminar Hall#3#10#$%Elocution#12:30-15:00#DoMS Seminar Hall#3#28#$%Classical Vocals(Finals)#15:00-17:30#DoMS Seminar Hall#3#9#$%Main QuiZ Semi 1 & 2#10:00-14:00#HSB 357#3#17#$%Junk craft WS#10:00-13:00#HSB 357#3#48#$%Geo-Genius Finals#16:00-17:30#HSB 357#3#19#$%Cleudo Prelims#10:00-13:00#HSB 333 & 334#3#36#$%WTGW Prelims#14:00-16:00#HSB 333 & 334#3#30#$%Power Chords#9:00-17:30#Bindas Park#3#5#$%Face Me#900-1130#FA Hut#3#34#$%Fine Arts WS#11:30-14:30#FA Hut#3#48#$%Klay Kraft#14:30-17:00#FA Hut#3#34#$%Dance Workshop 3#10:00-12:00#SAC#3#48#$%Culture Show#12:00-15:30#SAC#3#56#$%Five Point Someone(Mini Proshow)#15:30-17:30#SAC#3#57#$%The Great Hunts Begins#10:00-10:30#Informals Stage#3#43#$%The Great Hunt Ends#15:30-16:00#OAT#3#43#$%Shankar-Ehsan-Loy#17:30 onwards#OAT#3#57#$%Main Quiz Finals#22:00 onwards#OAT#3#17#$%^";
String day4="Dreams on Canvas - Exhibition#9:00-17:30#ICSR Exhibition Hall#3#49#$%Paintball#9:00-17:30#Paintball Arena#3#44#$%Sand Sculpture Workshop#9:00-17:30#Sangam#4#48#$%Acoustyx#9:00-14:30#CLT#4#8#$%LM solo Finals#14:30-17:00#CLT#4#1#$%India Quiz(Finals)#9:00-11:00#ICSR Main Auditorium#4#18#$%Biz Quiz(Finals)#11:00-14:00#ICSR Main Auditorium#4#15#$%Padma Subramaniam+ Neena Prasad LecDem#14:00-16:00#ICSR Main Auditorium#4#54#$%JAM Finals#16:00-17:30#ICSR Main Auditorium#4#26#$%SFM Finals Screening and Judging#11:00-14:00#ICSR Hall 1#4#21#$%Essence Finals#10:00-13:00#ICSR Hall 2#4#51#$%Chocolate Making Workshop#9:00-17:30#HSB 133#4#48#$%Crossie Finals#13:00-15:00#DoMS Seminar Hall#4#31#$%Elocution#13:00-16:00#HSB 356#4#28#$%Pot Pourri Finals#10:00-13:00#HSB 357#4#37#$%WTGW Finals#15:00-17:00#HSB 357#4#30#$%Creative Writing 2#11:00-15:00#HSB 333 & 334#4#32#$%Free Style Solo Dance#9:00-17:30#Bandass Park#4#25#$%Comic Strip#9:00-11:30#FA Hut#4#34#$%Fine Arts WS#11:30-14:30#FA HuT#4#48#$%Expressions#14:30-17:00#FA Hut#4#34#$%Dance Workshop 4#9:00-12:00#SAC#4#48#$%STEP#12:00-16:00#SAC#4#94#$%Mr and Ms Saarang finals#14:30-17:30#OAT#4#55#$%Hurricane Bells & HammerFall (Rockshow)#17:30 onwards#OAT#4#57#$%Street Play#10:00-17:30#Sanskriti#4#13#$%^";
Cursor c =mDbhelper.fetchAllEvents("1");
startManagingCursor(c);
if(c.getCount()<5)
{
set_data(day1,"add");
}
c =mDbhelper.fetchAllEvents("2");
startManagingCursor(c);
if(c.getCount()<5)
{
set_data(day2,"add");
}

c =mDbhelper.fetchAllEvents("3");
startManagingCursor(c);
if(c.getCount()<5)
{
set_data(day3,"add");
}

c =mDbhelper.fetchAllEvents("4");
startManagingCursor(c);
if(c.getCount()<5)
{
set_data(day4,"add");
}
c =mDbhelper.fetchAllEvents("0");
startManagingCursor(c);
if(c.getCount()<1)
{
set_data(day0,"add");
}
}




public void set_data(String day1,String opern)
{
	int flag=0;
 String event_name="";
	 String time="";
	String venue="";
	String day="";
	String event_number="";
for(int i=0;i<day1.length();i++)
{
	
	if(day1.charAt(i)=='#')
	{
		flag++;
	
	i++;
	
	}
	if (day1.charAt(i)=='$')
	{
	
			mDbhelper.createEvent(event_name, venue,Integer.parseInt(day), time, event_number,0);
		
		i=i+2;
		flag=0;
		event_name="";
		event_number="";
		day="";
		venue="";
		time="";
	}

	
	if(flag==0)
	{
		event_name+=day1.charAt(i);
	}
	else if (flag==1)
	{
		time+=day1.charAt(i);
	}
	else if(flag==2)
		venue+=day1.charAt(i);
	else if(flag==3)
		day+=day1.charAt(i);
	else if(flag==4)
		event_number+=day1.charAt(i);
	
	
	
}
	
}


public boolean onMenuItemSelected(int featureId, MenuItem item) {
//	Button t=(Button)findViewById(R.id.text5);
	switch(item.getItemId()) {
	case update:
		update();    
	}
	return super.onMenuItemSelected(featureId, item);
	
}

public void update()
{
int file = getFilename();	

for(int i=update_number;i<=file;i++)
{
	String filename="Update"+i+".txt";
	 String myString = null; 
     try { 
     
          URL myURL = new URL( 
                    "http://saarang.iitm.ac.in/mobile10/schedule/"+filename+".txt"); 
        
          URLConnection ucon = myURL.openConnection(); 

          InputStream is = ucon.getInputStream(); 
          BufferedInputStream bis = new BufferedInputStream(is); 
       
          ByteArrayBuffer baf = new ByteArrayBuffer(50); 
          int current = 0; 
          while((current = bis.read()) != -1){ 
               baf.append((byte)current); 
          } 

       
          myString = new String(baf.toByteArray()); 
     } catch (Exception e) { 
       
          myString = e.getMessage(); 
     } 

     Spanned html = Html.fromHtml(myString);
   get_update(html.toString());
}
update_number=file;
	
}

public void get_update(String data)
{
	String update_str="";
	int flag=0;
	for(int i=0;i<data.length();i++)
	{
		
		
		if (data.charAt(i)=='-')
		{
			if(flag==0)
			flag=1;
			else
			{
			mDbhelper.set_data_update(update_str);
			update_str="";
			}
		}
		else
			update_str+=data.charAt(i);
	}
	mDbhelper.set_data_update(update_str);
}



public int getFilename()
{
	
	String myString = null; 
try { 
    
    URL myURL = new URL( 
              "http://saarang.iitm.ac.in/mobile10/schedule/Update.txt"); 
  
    URLConnection ucon = myURL.openConnection(); 

    InputStream is = ucon.getInputStream(); 
    BufferedInputStream bis = new BufferedInputStream(is); 
 
    ByteArrayBuffer baf = new ByteArrayBuffer(50); 
    int current = 0; 
    while((current = bis.read()) != -1)
    {
    	baf.append((byte)current); 
    } 

 
    myString = new String(baf.toByteArray()); 
} catch (Exception e) { 
 
    myString = e.getMessage(); 
} 

Spanned html = Html.fromHtml(myString);
String count=html.toString();
String num=count.charAt(0)+"";
int cnt=Integer.parseInt(num);
//t.setText("gek");
//setContentView(R.layout.side);
//temp=myString;
//String[] DayList1={"Day0","Day1","Day2","Day3","Day4" ,num };
//setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem, DayList1));
return cnt;
	
	
	/*myString= DownloadText("http://saarang.iitm.ac.in/mobile10/schedule/Update.txt");
	t.setText(myString);
setContentView(R.layout.side);
setListAdapter(new ArrayAdapter(this, R.layout.simplelistitem, DayList));*/

}

private String DownloadText(String URL)
{
    int BUFFER_SIZE = 2000;
    InputStream in = null;
    try {
        in = OpenHttpConnection(URL);
    } catch (IOException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
        return "";
    }
    
    InputStreamReader isr = new InputStreamReader(in);
    int charRead;
      String str = "";
      char[] inputBuffer = new char[BUFFER_SIZE];          
    try {
        while ((charRead = isr.read(inputBuffer))>0)
        {                    
            //---convert the chars to a String---
            String readString = 
                String.copyValueOf(inputBuffer, 0, charRead);                    
            str += readString;
            inputBuffer = new char[BUFFER_SIZE];
        }
        in.close();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        return "";
    }    
    return str;        
}

private InputStream OpenHttpConnection(String urlString) 
throws IOException
{
    InputStream in = null;
    int response = -1;
           
    URL url = new URL(urlString); 
    URLConnection conn = url.openConnection();
             
    if (!(conn instanceof HttpURLConnection))                     
        throw new IOException("Not an HTTP connection");
    
    try{
        HttpURLConnection httpConn = (HttpURLConnection) conn;
        httpConn.setAllowUserInteraction(false);
        httpConn.setInstanceFollowRedirects(true);
        httpConn.setRequestMethod("GET");
        httpConn.connect(); 

        response = httpConn.getResponseCode();                 
        if (response == HttpURLConnection.HTTP_OK) {
            in = httpConn.getInputStream();                                 
        }                     
    }
    catch (Exception ex)
    {
        throw new IOException("Error connecting");            
    }
    return in;     
}









}
