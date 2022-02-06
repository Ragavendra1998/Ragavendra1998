import java.util.Scanner;
public class OrderMeal
{
public static void main(String[] args)
{
int c=0;
System.out.println("*****WELCOME TO FOOD WORLD****");
System.out.println("** Enjoy the breakfast you love anytime you wish. !");
Scanner obj = new Scanner(System.in);
System.out.println("Enter your name ");
String name=obj.nextLine();
System.out.println("========================================");
System.out.println("1.*** RV HOTEL ***");
System.out.println("2.$$$ KJ HOTEL $$$");
System.out.println();
System.out.println(" ENTER YOUR CHOICE :");     
int choice =obj.nextInt();
System.out.println("\f");//to clear the screen for next window
switch(choice)
{
case 1: System.out.println(" Welcome to RV Hotel ");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println();
String s= new String("");
char ch1;
do{
System.out.println("Select Category");
System.out.println("1.*** Veg ***");
System.out.println("2.*** Non Veg ***");
System.out.println("3.*** Dessert ***");
System.out.println(" ENTER YOUR CHOICE :");
int v=obj.nextInt();
System.out.println("\f");
switch(v)
{
case 1:
char ch;
do{
System.out.println("VEG MENUCARD");
System.out.println("1.Curd Rice Rs. 50");
System.out.println("2.Sambar Rice Rs. 60");
System.out.println("3.Veg Meal Rs. 150");
System.out.println();
System.out.println(" ENTER YOUR CHOICE :");
int o=obj.nextInt();
switch(o)
{
case 1:
s=s.concat("Curd Rice - Rs.50 \n");
System.out.println("Curd Rice - Rs.50");
c=c+50;
//System.out.println("Total amount: "+c);
break;
case 2:
s=s.concat("Sambar Rice- Rs. 120 \n");
System.out.println("Sambar Rice- Rs. 120" );
c=c+60;
break;
case 3:
s=s.concat("Veg Meal - Rs. 150 \n");
System.out.println("Veg Meal - Rs. 150" );
c=c+150;
break;
}
System.out.println("do you want to order one more dish?");
String more=obj.next();
ch=more.charAt(0);
}while(ch =='y' || ch=='Y');
break;
case 2:
char ch3;
do{
System.out.println("NON-VEG MENUCARD");
System.out.println("1.Chicken Grill Rs. 50");
System.out.println("2.Chicken Biryani Rs. 110");
System.out.println("3.Mutton Biryani Rs. 270");
System.out.println();
System.out.println(" ENTER YOUR CHOICE :");
int x=obj.nextInt();
switch(x)
{
case 1:
s=s.concat("Chicken Grill - Rs. 50 \n");
System.out.println("Chicken Grill - Rs. 50" );
c=c+150;
break;
case 2:
s=s.concat("Chicken Biryani  - Rs. 110 \n");
System.out.println("Chicken Biryani  - Rs. 110" );
c=c+110;
break;
case 3:
s=s.concat("Mutton Biryani - Rs. 270 \n");
System.out.println("Mutton Biryani - Rs. 270" );
c=c+270;
break;
}
System.out.println("do you want to order one more dish?");
String more1=obj.next();
ch3=more1.charAt(0);
}while(ch3=='y' || ch3=='Y');
break;
case 3:
char ch4;
do{
System.out.println("Dessert");
System.out.println("1.CokeFloat Rs. 40");
System.out.println("2.Softy Rs. 30");
System.out.println("3.McFlurry Rs. 60");
System.out.println();
System.out.println(" ENTER YOUR CHOICE :");
int y=obj.nextInt();
switch(y)
{
case 1:
System.out.println("CokeFloat - Rs. 40" );
s=s.concat("CokeFloat - Rs. 40 \n");
c=c+40;
break;
case 2:
System.out.println("Softy - Rs. 30" );
s=s.concat("Softy - Rs. 30 \n");
c=c+30;
break;
case 3:
System.out.println("McFlurry - Rs. 60" );
s=s.concat("McFlurry - Rs. 60 \n");
c=c+60;
break;
}
System.out.println("do you want to order one more dish?");
String more2=obj.next();
ch4=more2.charAt(0);
}while(ch4=='y' || ch4=='Y');
break;
}
System.out.println("Do you want to choose from another category?");
//System.out.println("test");
String category=obj.next();
//System.out.println("test");
ch1=category.charAt(0);
// System.out.println("test");
}while(ch1=='y' || ch1=='Y');
//System.out.println("\f");
System.out.println("Name of the Customer : " +name);
System.out.println();
System.out.println("Your Order :");
System.out.println(s);
System.out.println("----------------------------------------------");
System.out.println("Total amount to be paid : "+c);
System.out.println("\f");
break;
case 2:
System.out.println(" Welcome to KJ Hotel ");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println();
char ch2;
int c1=0;
String s1=new String("");
do{
System.out.println("Select Category");
System.out.println("1.*** Non Veg ***");
System.out.println("2.*** Dessert ***");
System.out.println(" ENTER YOUR CHOICE :");
int v1=obj.nextInt();
System.out.println("\f");
switch(v1)
{
case 1:
char ch5;
do{
System.out.println("NON-VEG MENUCARD");
System.out.println("1.Buckets (8pcs.) Rs. 300");
System.out.println("2.4 pc Fiery Grilled Rs. 600");
System.out.println("3.Rice Bowl Rs. 70");
System.out.println();
System.out.println(" ENTER YOUR CHOICE :");
int y1=obj.nextInt();
switch(y1)
{
case 1:
System.out.println("Buckets (8pcs.) - Rs. 300" );
s1=s1.concat("Buckets (8pcs.)- Rs. 300 \n");
c1=c1+300;
break;
case 2:
System.out.println("4 pc Fiery Grilled - Rs. 600" );
s1=s1.concat("4 pc Fiery Grilled - Rs. 600 \n");
c1=c1+600;
break;
case 3:
System.out.println("Rice Bowl - Rs. 70" );
s1=s1.concat("Rice Bowl - Rs. 70 \n");
c1=c1+70;
break;
}
System.out.println("do you want to order one more dish?");
String more3=obj.next();
ch5=more3.charAt(0);
}while(ch5=='y' || ch5=='Y');
break;
case 2:
char ch6;
do{
System.out.println("Dessert");
System.out.println("1.Hot Chocolate Brownie Rs. 60");
System.out.println("2.Softy Rs. 35");
System.out.println("3.Coke Rs. 40");
System.out.println();
System.out.println(" ENTER YOUR CHOICE :");
int y2=obj.nextInt();
switch(y2)
{
case 1:
System.out.println("Hot Chocolate Brownie - Rs. 60" );
s1=s1.concat("Hot Chocolate Brownie - Rs. 60 \n");
c1=c1+60;
break;
case 2:
System.out.println("Softy - Rs. 35" );
s1=s1.concat("Softy - Rs. 35 \n");
c1=c1+30;
break;
case 3:
System.out.println("Coke - Rs. 40" );
s1=s1.concat("Coke - Rs. 40 \n");
c1=c1+40;
break;
}
System.out.println("do you want to order one more dish?");
String more4=obj.next();
ch6=more4.charAt(0);
}while(ch6=='y' || ch6=='Y');
break;
}
System.out.println("Do you want to choose from another category?");
String category1=obj.next();
ch2=category1.charAt(0);
///System.out.println("\f");
System.out.println("Name of the Customer : " +name);
System.out.println();
System.out.println("Your Order :");
System.out.println(s1);
System.out.println("----------------------------------------------");
System.out.println("Total amount to be paid : "+c1);
System.out.println("\f");
}while(ch2=='y' || ch2=='Y');
break;
}
}
}