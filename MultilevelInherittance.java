
class One {
  void print() {
    System.out.println("I am one");
  }
}

class Two extends One {
  void printTwo() {
    System.out.println("I am two");
  }
}

class Three extends Two {
  void printThree() {
    System.out.println("I am three");
  }
}

public class Main {
  public static void main(String[] args) {
    Three t = new Three();
    t.printThree();
    t.printTwo();
    t.print();
  }
}
