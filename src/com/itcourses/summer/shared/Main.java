package com.itcourses.summer.shared;

public class Main {

    public static void main(String[] args) {
      args = new String[]{"add","23","13"};
	  if (args.length!=3){
	      System.out.println("Wrong number of paramters");
      }
      int firstNumber = Integer.parseInt(args[1]);
      int secondNumber = Integer.parseInt(args[2]);
      switch (args[0].toLowerCase()){
          case "add" : break;
          case "divide" : break;
          case "multiply" : break;
          case "subtract" : break;
          default:
              System.out.println("Unknown command");
        }

    }
}