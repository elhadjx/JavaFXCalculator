package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Controller {

    @FXML
    private Label result;
    @FXML
    private Label operation;
    private double number1 = 0, number2 = 0;
    private String op = " ";
    private double output = 0;
    private Modal modal = new Modal();

    public void number(ActionEvent event) {
        result.setText(result.getText() + ((Button) event.getSource()).getText());
        operation.setText(operation.getText() + ((Button) event.getSource()).getText());
    }

    public void operator(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        if (!value.equals("=")) {
            if (!result.getText().isEmpty()) {
                number1 = Double.parseDouble(result.getText());
            } else {
                number1 = 0.0;
            }
            System.out.println(number1);
            op = value;
            result.setText("");
            operation.setText(operation.getText() + " " + op + " ");
        } else {
            number2 = Double.parseDouble(result.getText());
            System.out.println(number2);

            output = modal.calculate(number1, number2, op);
            System.out.println(output);
            result.setText("" + output);
            operation.setText(operation.getText() + " = " + output + "\n");
        }
    }
    public void clear(){
        number1 = 0;
        number2 = 0;
        operation.setText("");
        result.setText("");
    }
    public void exit(){
        System.exit(0);
    }
}
