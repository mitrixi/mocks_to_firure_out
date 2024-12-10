package my.sandbox;

import lombok.Data;

public class Main {
  public static void main(String[] args) {}
}


@Data
class Parent {
  Child child;
  int money = 5000;
}


@Data
class Child {
  int money;
}


class Processor {
  void processData(Parent parent, Child child) {
    child.setMoney(parent.getMoney());
//  здесь сохраняем в репозиторий Child'а
  }
}
