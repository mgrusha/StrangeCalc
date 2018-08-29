package com.itcourses.summer.shared;
public class Main {

    public static void main(String[] args) {
        args = new String[]{"subtract","23","13"};
        calculate(args);
        calculate (new String[]{"add","13","33"});
    }

    private static void calculate(String[] args) {
        if (args.length!=3){
            System.out.println("Wrong number of paramters");
        }
        int firstNumber = Integer.parseInt(args[1]);
        int secondNumber = Integer.parseInt(args[2]);
        switch (args[0].toLowerCase()){
            case "add" :
                add (firstNumber, secondNumber);
                break;
            case "divide" : break;
            case "multiply" : break;
            case "subtract" :
                subtract(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Unknown command");
        }
    }

    public static void subtract(int firstNumber, int secondNumber) {
        System.out.println(""+firstNumber+"-"+secondNumber+"="+(firstNumber-secondNumber));
    }

    public static void add (int firstNumber, int secondNumber){
        System.out.println( ""+firstNumber+"+"+secondNumber+"="+(firstNumber+secondNumber));
    }

    public static void divide (int firstNumber, int secondNumber) {
        System.out.println("" + firstNumber + "/" + secondNumber + "=" + (firstNumber/secondNumber));
    }
}