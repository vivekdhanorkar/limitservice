package com.learning.limitservice.bean;

public class LimitConfiguration {

  private int minimum;
  private int maximum;

  public LimitConfiguration() {
  }

  public LimitConfiguration(int minimum, int maximum) {
    this.maximum = maximum;
    this.minimum = minimum;
  }

  public int getMaximum() {
    return maximum;
  }

  public void setMaximum(int maximum) {
    this.maximum = maximum;
  }

  public int getMinimum() {
    return minimum;
  }

  public void setMinimum(int minimum) {
    this.minimum = minimum;
  }
}
