package DoOp;

public class DoOp {
    public static String operate(String[] args) {

        if (args.length == 0) {
            return "it depend on the input.";
        }
        int leftOperand = Integer.parseInt(args[0]);
        int rightOperand = Integer.parseInt(args[2]);

        return switch (args[1]) {
            case "+" -> String.valueOf(leftOperand + rightOperand);
            case "-" -> String.valueOf(leftOperand - rightOperand);
            case "*" -> String.valueOf(leftOperand * rightOperand);
            case "/" -> rightOperand == 0 ?
                    "Error" : String.valueOf(leftOperand / rightOperand);
            case "%" -> rightOperand == 0 ?
                    "Error" : String.valueOf(leftOperand % rightOperand);
            default -> "Error";
        };
    }
}
