import javax.swing.JOptionPane;
public class calc {
    public static void main(String[] args) {
        do {
            String num1 = JOptionPane.showInputDialog(null, "enter first number", "calculator", JOptionPane.OK_CANCEL_OPTION);
            if(num1 == null){
                JOptionPane.showMessageDialog(null,"exting....","calculator",JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            String num2 = JOptionPane.showInputDialog(null, "enter second number", "calculator", JOptionPane.OK_CANCEL_OPTION);
            if(num2 == null){
                JOptionPane.showMessageDialog(null,"exting....","calculator",JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            String op = JOptionPane.showInputDialog(null, "enter operator(+,-,*,/)", "calculator", JOptionPane.OK_CANCEL_OPTION);
            if(op == null){
                JOptionPane.showMessageDialog(null,"exting....","calculator",JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            double n1 = Double.parseDouble(num1);
            double n2 = Double.parseDouble(num2);
            double result;

            switch (op) {
                case "+":
                    result = n1 + n2;
                    break;
                case "-":
                    result = n1 - n2;
                    break;
                case "*":
                    result = n1 * n2;
                    break;
                case "/":
                    result = n1 / n2;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "invalid operator", "calculator", JOptionPane.ERROR_MESSAGE);
                    return;
            }
            JOptionPane.showMessageDialog(null, "Result: " + result);
        }while(true);
    }
}
