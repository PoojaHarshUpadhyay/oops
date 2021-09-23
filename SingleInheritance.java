
class Primary {
  void print() {
    System.out.println("I am primary");
  }
}

class Inherited extends Primary {
  void printTwo() {
    System.out.println("I am inherited");
  }
}

public class Main {
  public static void main(String[] args) {
    Inherited inherited = new Inherited();
    inherited.printTwo();
    inherited.print();
  }
}
