package mainpackage;

public class Main {

    public static void main(String[] args) {
        //args = new String[]{"subtract","23","13"};
        if (args.length!=3){
            System.out.println("Wrong number of paramters");
        }
        int firstNumber = Integer.parseInt(args[1]);
        int secondNumber = Integer.parseInt(args[2]);
        int result;
        switch (args[0].toLowerCase()){
            case "add" : break;
            case "divide" :
                result = division(firstNumber, secondNumber);
                System.out.println("" + firstNumber + "/" + secondNumber + "=" + result);
                break;
            case "multiply" :
                result = multiply(firstNumber, secondNumber);
                System.out.println(""+firstNumber+"-"+secondNumber+"="+result);
                break;
            case "subtract" :
                result = subtract(firstNumber, secondNumber);
                System.out.println(""+firstNumber+"-"+secondNumber+"="+result);
                break;
            default:
                System.out.println("Unknown command");
        }

    }

//new comment + smth
    public static int subtract(int firstNumber, int secondNumber) {
        return (firstNumber-secondNumber); }

    public static int multiply(int firstNumber, int secondNumber) {
        return (firstNumber*secondNumber); }

        public static int division(int firstNumber, int secondNumber){
        return (firstNumber/secondNumber);
        }

}
