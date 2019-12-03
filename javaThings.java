public static void main (args[]){
  System.out.println("hello world");

  int x = 4;
  String stringy = "hi there!";

  for(int i = 1; i < 5; i++){
    System.out.println("gretting " + i);
  }
  String scream = ""
  while scream.length() < 4{
    scream = scream+"A";
  }
  System.out.println(scream);


  add2(3);

  //this gives an error
  //add2("hi")
}

public int add2(int k){
  return(k+2);
}

public Class Dog extends Barkable{
  private String name;
  private int age

  public Dog(String name, String age){
    this.name = name;
    this.age = age;
  }
  public Dog(){
    this.name = "Doggo";
    this.age = "1"
  }

  public void bark(){
    System.out.println("bark!")
  }

  public int getAge(){
    reutrn this.age
  }

  public void setAge(int newAge){
    this.age = newAge;
  }

}



public Interface Barkable{
  public void bark();
}
