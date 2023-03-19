// a simple class in Java //

//define Main class//
class Main {  
  public static void main(String args[]) { 

    Person person_1 = new Person("Davide Di Caprio",1995,1.79);

    System.out.println(person_1.full_name);
    System.out.println(person_1.birth_year);
    System.out.println(person_1.height);

  } 
}


//define costructor //

public class Person {

  String full_name;
  int birth_year;
  double height;

  Person(String full_name,int birth_year,double height){

    this.full_name = full_name;
    this.birth_year = birth_year;
    this.height = height;
    
  }
  
}
