//xrhstos mixahl AM 526
import java.util.Scanner;


class dept 
{
String name;
String adress;
int phone;
support sup;
admin adm;
building built;
dep de;

public dept(String name, String adress, int phone, support sup, String name2, String depart2, int employee2, int gain2, String name3, String depart3, int employee3, int gain3, String name4, String depart4, int employee4, int gain4 )
	{
		this.name = name;
		this.adress = adress;
		this.phone = phone;
		this.sup = sup;
		adm = new admin(name2,depart2,employee2,gain2);
		built = new building(name3,depart3,employee3,gain3);
		de = new dep(name4,depart4,employee4,gain4);
	}

public void set(String name, String adress, int phone, support sup, String name2, String depart2, int employee2, int gain2, String name3, String depart3, int employee3, int gain3, String name4, String depart4, int employee4, int gain4  )
	{
		this.name = name;
		this.adress = adress;
		this.phone = phone;
		this.sup = sup;
		adm = new admin(name2,depart2,employee2,gain2);
		built = new building(name3,depart3,employee3,gain3);
		de = new dep(name4,depart4,employee4,gain4);
	}
public String printdept()
	{
	return "to tmhma exei onoma"+ name + "dieu8unsh " + adress + " " +"thlefwno " + phone  ;
	}

}


class support
{
String name1;
String depart1;
int employee1;
int gain1;


public support(String name1, String depart1, int employee1, int gain1)
	{
		this.name1 = name1;
		this.depart1 = depart1;
		this.employee1 = employee1;
		this.gain1 = gain1;
	}

public void setsup(String name1, String depart1, int employee1, int gain1)
	{
		this.name1 = name1;
		this.depart1 = depart1;
		this.employee1 = employee1;
		this.gain1 = gain1;
	}
public void inputsupport()
	{
	this.employee1 += 1;
	
	}

public String printsup()
	{
	return "h uphresia exei onoma" + name1 + "entasete sto tmhma " + depart1 + " " +"exei " + employee1 + "upalhlous kai apodoxes" + gain1 ;
	}

}

class admin
{
String name2;
String depart2;
int employee2;
int gain2;

public admin(String name2, String depart2, int employee2, int gain2)
	{
		this.name2 = name2;
		this.depart2 = depart2;
		this.employee2 = employee2;
		this.gain2 = gain2;
	}

public void setadmin(String name2, String depart2, int employee2, int gain2)
	{
		this.name2 = name2;
		this.depart2 = depart2;
		this.employee2 = employee2;
		this.gain2 = gain2;
	}
public void inputadmin()
	{
	this.employee2 += 1;
	
	}

public String printadmin()
	{
	return "h uphresia exei onoma" + name2 + "entasete sto tmhma " + depart2 + " " +"exei " + employee2 + "upalhlous kai apodoxes" + gain2 ;
	}

}



class building
{
String name3;
String depart3;
int employee3;
int gain3;

public building(String name3, String depart3, int employee3, int gain3)
	{
		this.name3 = name3;
		this.depart3 = depart3;
		this.employee3 = employee3;
		this.gain3 = gain3;
	}

public void setbuilding(String name3, String depart3, int employee3, int gain3)
	{
		this.name3 = name3;
		this.depart3 = depart3;
		this.employee3 = employee3;
		this.gain3 = gain3;
	}

public void inputbuilding()
	{
	this.employee3 += 1;
	
	}

public String printbuilting()
	{
	return "h uphresia exei onoma" + name3 + "entasete sto tmhma " + depart3 + " " +"exei " + employee3 + "upalhlous kai apodoxes" + gain3 ;
	}
}






class dep
{
String name4;
String depart4;
int employee4;
int gain4;

public dep(String name4, String depart4, int employee4, int gain4)
	{
		this.name4 = name4;
		this.depart4 = depart4;
		this.employee4 = employee4;
		this.gain4 = gain4;
	}

public void setdep(String name4, String depart4, int employee4, int gain4)
	{
		this.name4 = name4;
		this.depart4 = depart4;
		this.employee4 = employee4;
		this.gain4 = gain4;
	}

public void inputdep()
	{
	this.employee4 += 1;
	
	}

public String printdep()
	{
	return "h uphresia exei onoma" + name4 + "entasete sto tmhma " + depart4 + " " +"exei " + employee4 + "upalhlous kai apodoxes" + gain4 ;
	}

}

	





class person
{
String name;
String surname;
String adress;
int age;


public person()
	{
		this.name ="x";
		this.surname = "m";
		this.adress = "m";
		this.age = 10;
	}

public person(String name, String surname, String adress, int age)
	{
		this.name = name;
		this.surname = surname;
		this.adress = adress;
		this.age = age;
	}

public void setperson(String name, String surname, String adress, int age)
	{
		this.name = name;
		this.surname = surname;
		this.adress = adress;
		this.age = age;
	}

public String printperson()
	{
	return "exei onoma" + name + "epitheto " + surname + " " +"dieu8unsh " + adress + " kai hlikia" + age ;
	}

}


class student extends person
{
int am;
String depart;
int eyear;
int numath;
float mo;
private person stud = new person();


public student()
	{
		this.stud.setperson("x","x","x",10);
		this.am = 12;
		this.depart = "x";
		this.eyear = 1;
		this.numath = 1;
		this.mo = 1;
}

public student(String name, String surname, String adress, int age, int am, String depart, int eyear, int numath, float mo)
	{
		this.stud.setperson(name,surname,adress,age);
		this.am = am;
		this.depart = depart;
		this.eyear = eyear;
		this.numath = numath;
		this.mo = mo;
	}
public void setstudent(String name, String surname, String adress, int age, int am, String depart, int eyear, int numath, float mo)
	{
		this.stud.setperson(name,surname,adress,age);
		this.am = am;
		this.depart = depart;
		this.eyear = eyear;
		this.numath = numath;
		this.mo = mo;
	}

public String printstudent()
	{
	return  "o mathhths" + this.stud.printperson() + "entasete sto tmhma"  + depart + " me am " + am + " " + " etos eisagwgns " + eyear + " perasmena ma8hmata " + numath + "kai mo" + mo ;
	}
}






class employee extends person
{
String depart;
int afm;
int salary;
int yjob;//proyphresia
person emp = new person();


public employee()
	{
		this.emp.setperson("x","x","x",10);
		this.depart = "depart";
		this.afm = 11;
		this.salary = 11;
		this.yjob = 11;
	}
public employee(String name, String surname, String adress, int age,String depart, int afm, int salary, int yjob)
	{
		this.emp.setperson(name,surname,adress,age);
		this.depart = depart;
		this.afm = afm;
		this.salary = salary;
		this.yjob = yjob;
	}
public void setemployee(String name, String surname, String adress, int age,String depart, int afm, int salary, int yjob)
	{
		this.emp.setperson(name,surname,adress,age);
		this.depart = depart;
		this.afm = afm;
		this.salary = salary;
		this.yjob = yjob;
	}

public String printemployee()
	{
	return  "o upalhlos" + this.emp.printperson() + "entasete sto tmhma"  + depart + " me afm " + afm + " " +"mistho " + salary + " kai prouphresia " + yjob + "xronia" ;
	}
}


class graduate extends student
{
private String title;
private float grade;
private String titlexam;
private student grad = new student();

public graduate(String name, String surname, String adress, int age, int am, String depart, int eyear, int numath, float mo, String title, float grade, String titlexam)
	{
		this.grad.setstudent(name,surname,adress,age,am,depart,eyear,numath,mo);
		this.title = title;
		this.grade = grade;
		this.titlexam = titlexam;
	}
public void setegrad(String name, String surname, String adress, int age, int am, String depart, int eyear, int numath, float mo, String title, float grade, String titlexam)
	{
		this.grad.setstudent(name,surname,adress,age,am,depart,eyear,numath,mo);
		this.title = title;
		this.grade = grade;
		this.titlexam = titlexam;
	}

public String printprof()
	{
	return "apofoitos" + this.grad.printstudent() + "me titlo ptuxiou"  + title + " bathmo ptuxiou " + grade + " " + " titlo ptuxiakhs " + titlexam ;
	}
}






class professor extends employee
{
private int didtime;//xronos didaktorikou
private int publish;
private employee prof = new employee();

public professor(String name, String surname, String adress, int age,String depart, int afm, int salary, int yjob, int didtime, int publish)
	{
		this.prof.setemployee(name,surname,adress,age,depart,afm,salary,yjob);
		this.didtime = didtime;
		this.publish = publish;
	}
public void setprof(String name, String surname, String adress, int age,String depart, int afm, int salary, int yjob, int didtime, int publish)
	{
		this.prof.setemployee(name,surname,adress,age,depart,afm,salary,yjob);
		this.didtime = didtime;
		this.publish = publish;
	}

public String printprof()
	{
	return "o kathhghths" + this.prof.printemployee() + "me xrono didaktorikou"  + didtime + " kai me " + publish + " " + "dhmosieuseis " ;
	}
}







class lab6
{
public static void main(String args[])
	{
	Scanner input = new Scanner(System.in);
	
	System.out.println("uphresia support tou tmhmatos:");
	String depart = input.next();
	System.out.println("uphresia support eisodhma:");
	int gain = input.nextInt();

	support sup1 = new support("support",depart,0,gain);
	

	System.out.println("neo tmhma me onoma:");
	String name = input.next();	
	System.out.println("neo tmhma me dieu8unsh:");
	String adress = input.next();
	System.out.println("neo tmhma me thlefwno:");
	int phone = input.nextInt();
	
	System.out.println("uphresia admin eisodhma:");
	int gain1 = input.nextInt();	

	System.out.println("uphresia building eisodhma:");
	int gain2 = input.nextInt();	

	System.out.println("uphresia dep eisodhma:");
	int gain3 = input.nextInt();	
	
	dept dep1 = new dept(name,adress,phone,sup1,"admin",depart,0,gain1,"building",depart,0,gain2,"dep",depart,0,gain3);
	
	System.out.println("1.employee sthn uphresia supporting:");	
	sup1.inputsupport();
	System.out.println("employee me onoma:");
	String name1 = input.next();
	System.out.println("employee me epi8eto:");
	String surname1 = input.next();
	System.out.println("employee me dieu8unsh:");
	String adress1 = input.next();
	System.out.println("employee me hlikia:");
	int age1 = input.nextInt();
	System.out.println("employee me afm:");
	int afm1 = input.nextInt();	
	System.out.println("employee me mis8o:");
	int salary1 = input.nextInt();
	System.out.println("employee me proyphresia:");
	int yjob1 = input.nextInt();
	employee empl1 = new employee(name1,surname1,adress1,age1,name,afm1,salary1,yjob1);
	

	
	System.out.println("2.employee sthn uphresia supporting:");	
	sup1.inputsupport();
	System.out.println("employee me onoma:");
	String name2 = input.next();
	System.out.println("employee me epi8eto:");
	String surname2 = input.next();
	System.out.println("employee me dieu8unsh:");
	String adress2 = input.next();
	System.out.println("employee me hlikia:");
	int age2 = input.nextInt();
	System.out.println("employee me afm:");
	int afm2 = input.nextInt();	
	System.out.println("employee me mis8o:");
	int salary2 = input.nextInt();
	System.out.println("employee me proyphresia:");
	int yjob2 = input.nextInt();
	employee empl2 = new employee(name2,surname2,adress2,age2,name,afm2,salary2,yjob2);
	

	System.out.println("ta stoixeia tou tmhmatos:" + dep1.printdept());
	System.out.println("ta stoixeia ths uphresias:" + sup1.printsup());
	System.out.println("ta stoixeia tou upalhlou1:" + empl1.printemployee());
	System.out.println("ta stoixeia tou upalhlou2:" + empl2.printemployee());
	


	}

}