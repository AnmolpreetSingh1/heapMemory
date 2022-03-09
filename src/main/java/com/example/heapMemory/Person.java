package com.example.heapMemory;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Person {
  public String name;

  public Person(String name) {
    this.name = name;
  }

//    @Override
//    public boolean equals(Object o) {
//      if (o == this) return true;
//      if (!(o instanceof Person)) {
//        return false;
//      }
//      Person person = (Person) o;
//      return person.name.equals(name);
//    }
//
//    @Override
//    public int hashCode() {
//      int result = 17;
//      result = 31 * result + name.hashCode();
//      return result;
//    }
}
