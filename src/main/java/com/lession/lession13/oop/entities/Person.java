package com.lession.lession13.oop.entities;

public class Person {

  protected String name;
  protected boolean gender;
  protected int age;

  public Person() {
  }

  public Person(String name, boolean gender, int age) {
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void sleep() {
    System.out.println("Person sleep 8hrs/day...");
  }
}