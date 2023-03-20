// a simple class in Java //

class Main {  
  public static void main(String args[]) {
    
    Person person  = new Person("Davide Di Caprio",1995,1.79);
    
    System.out.println(person.getName());
    System.out.println(person.getBirthYear());
    System.out.println(person.getHeight());
    
    person.setName("Bill Gates");
    person.setBirthYear(1955);
    person.setHeigth(1.77);
    
    System.out.println(person.getName());
    System.out.println(person.getBirthYear());
    System.out.println(person.getHeight());
  } 
}


public class Person {
  
  private String name;
  private int birthYear;
  private double height;

  public Person(String name,int birthYear,double height){

    this.name = name;
    this.birthYear = birthYear;
    this.height = height;
  }
  public String getName(){
    return this.name; 
  }
  public void setName(String name){
    this.name = name;
  }
  public int getBirthYear(){
    return this.birthYear;
  }
  public void setBirthYear(int birthYear){
    this.birthYear = birthYear;
  }
  public double getHeight(){
    return this.height;
  }
  public void setHeigth(double height){
    this.height = height;
  }
}
