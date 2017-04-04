import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;



public class Controller extends Main {

    @FXML ToggleGroup firstValue;
    @FXML ToggleGroup secondValue;
    @FXML Label label;
    @FXML Button btn01;
    @FXML Button btn02;
    @FXML Button btn03;
    @FXML Button btn04;
    @FXML Button btn05;
    @FXML Button btn06;
    @FXML Button btn07;
    @FXML Button btn08;
    @FXML Button btn09;
    @FXML Button btn10;
    @FXML RadioButton radioButton11;
    @FXML RadioButton radioButton12;
    @FXML RadioButton radioButton13;
    @FXML RadioButton radioButton21;
    @FXML RadioButton radioButton22;
    @FXML RadioButton radioButton23;
    @FXML ImageView image;

    @FXML
    Calculation calc = new Calculation();


    // Конъюнкция (И)
    @FXML
    public void onClickMethod1(){
        try {
            label.setText(String.valueOf(calc.conj((Boolean)firstValue.getSelectedToggle().getUserData(),(Boolean)secondValue.getSelectedToggle().getUserData())));
        } catch (RuntimeException e) {
            label.setText("null");
        }
    }

    // Дизьюнкция (ИЛИ)
    @FXML
    public void onClickMethod2(){
        try {
            label.setText(String.valueOf(calc.diz( (Boolean) firstValue.getSelectedToggle().getUserData(), (Boolean) secondValue.getSelectedToggle().getUserData())));
        } catch (RuntimeException e) {
            label.setText("null");
        }
    }

    @FXML
    public void onClickMethod3(){
        try {
            label.setText(String.valueOf(calc.sheffer((Boolean) firstValue.getSelectedToggle().getUserData(), (Boolean) secondValue.getSelectedToggle().getUserData())));
        } catch (RuntimeException e) {
            label.setText("null");
        }
    }
    @FXML
    public void onClickMethod4(){
        try {
            label.setText(String.valueOf(calc.peirce((Boolean) firstValue.getSelectedToggle().getUserData(), (Boolean) secondValue.getSelectedToggle().getUserData())));
        } catch (RuntimeException e) {
            label.setText("null");
        }
    }
    @FXML
    public void onClickMethod5(){
        try {
            label.setText(String.valueOf(calc.XNOR((Boolean) firstValue.getSelectedToggle().getUserData(), (Boolean) secondValue.getSelectedToggle().getUserData())));
        } catch (RuntimeException e) {
            label.setText("null");
        }
    }
    @FXML
    public void onClickMethod6(){
        try {
            label.setText(String.valueOf(calc.XOR((Boolean) firstValue.getSelectedToggle().getUserData(), (Boolean) secondValue.getSelectedToggle().getUserData())));
        } catch (RuntimeException e) {
            label.setText("null");
        }
    }
    @FXML
    public void onClickMethod7(){
        try {
            label.setText(String.valueOf(calc.implFromAToB((Boolean) firstValue.getSelectedToggle().getUserData(), (Boolean) secondValue.getSelectedToggle().getUserData())));
        } catch (RuntimeException e) {
            label.setText("null");
        }
    }
    @FXML
    public void onClickMethod8(){
        try {
            label.setText(String.valueOf(calc.implFromBToA((Boolean) firstValue.getSelectedToggle().getUserData(), (Boolean) secondValue.getSelectedToggle().getUserData())));
        } catch (RuntimeException e) {
            label.setText("null");
        }
    }
    @FXML
    public void onClickMethod9(){
        try {
            label.setText(String.valueOf(calc.decrement((Boolean) firstValue.getSelectedToggle().getUserData(), (Boolean) secondValue.getSelectedToggle().getUserData())));
        } catch (RuntimeException e) {
            label.setText("null");
        }
    }
    @FXML
    public void onClickMethod10(){
        try {
            label.setText(String.valueOf(calc.increment((Boolean) firstValue.getSelectedToggle().getUserData(), (Boolean) secondValue.getSelectedToggle().getUserData())));
        } catch (RuntimeException e) {
            label.setText("null");
        }
    }

    public void initialize(){
        radioButton11.setUserData(null);
        radioButton12.setUserData(true);
        radioButton13.setUserData(false);
        radioButton21.setUserData(null);
        radioButton22.setUserData(true);
        radioButton23.setUserData(false);

    }

}
