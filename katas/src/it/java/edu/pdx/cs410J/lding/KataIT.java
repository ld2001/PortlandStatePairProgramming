package edu.pdx.cs410J.lding;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.Test;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class KataIT extends InvokeMainTestCase {

  private MainMethodResult invokeMain(String... args) {
    return invokeMain( Kata.class, args );
  }

//
//  @Test
//  public void invokingMainWithNoArgumentsHasExitCodeOf1() {
//    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class);
//    assertThat(result.getExitCode(), equalTo(1));
//  }
//
//  @Test
//  public void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
//    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class);
//    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
//  }

  @Test
  public void test_1 () {

    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "1");
    assertThat(result.getTextWrittenToStandardOut(),containsString("I"));

  }

  @Test
  public void test_4 () {

    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "2");
    assertThat(result.getTextWrittenToStandardOut(),containsString("II"));

  }

  @Test
  public void test_5 () {

    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "4");
    assertThat(result.getTextWrittenToStandardOut(),containsString("IV"));

  }

  @Test
  public void test_9 () {

    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "9");
    assertThat(result.getTextWrittenToStandardOut(),containsString("IX"));

  }

  @Test
  public void test_10 () {

    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "10");
    assertThat(result.getTextWrittenToStandardOut(),containsString("X"));

  }

  @Test
  public void test_40 () {

    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "40");
    assertThat(result.getTextWrittenToStandardOut(),containsString("XL"));

  }

  @Test
  public void test_50 () {

    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "50");
    assertThat(result.getTextWrittenToStandardOut(),containsString("L"));

  }

  @Test
  public void test_90 () {

    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "90");
    assertThat(result.getTextWrittenToStandardOut(),containsString("XC"));

  }

  @Test
  public void test_100 () {

    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "100");
    assertThat(result.getTextWrittenToStandardOut(),containsString("C"));

  }

  @Test
  public void test_400 () {

    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "400");
    assertThat(result.getTextWrittenToStandardOut(),containsString("CD"));

  }

  @Test
  public void test_500 () {

    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "500");
    assertThat(result.getTextWrittenToStandardOut(),containsString("D"));

  }

  @Test
  public void test_900 () {

    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "900");
    assertThat(result.getTextWrittenToStandardOut(),containsString("CM"));

  }

  @Test
  public void test_1000 () {

    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "1000");
    assertThat(result.getTextWrittenToStandardOut(),containsString("M"));

  }


}
