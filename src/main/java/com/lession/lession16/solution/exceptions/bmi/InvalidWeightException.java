package com.lession.lession16.solution.exceptions.bmi;

public class InvalidWeightException extends Exception {
  public InvalidWeightException() {
    super("Weight must be a value between 2 and 200.");
  }
}
