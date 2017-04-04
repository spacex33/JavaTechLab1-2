import org.apache.log4j.Logger;

public class Calculation {

    private static final Logger log = Logger.getLogger(Calculation.class);

    public Boolean conj(Boolean firstOperand, Boolean secondOperand) {
        log.info("conj operation: "+ firstOperand+ ", " + secondOperand);
        try {
            if (firstOperand == true && secondOperand == true) {
                log.info("Result: true");
                return true;
            } else { log.info("Result: false");
                return false;}
        }
        catch (NullPointerException exp){
            log.info("Result: null");
            return null;
        }
    }


    public Boolean diz(Boolean firstOperand, Boolean secondOperand) {
        log.info("diz operation: "+ firstOperand+ ", " + secondOperand);
        try {
            if (firstOperand == false && secondOperand == false) {
                log.info("Result: false");
                return false;
            } else { log.info("Result: true");
                return true;}
        }
        catch (NullPointerException exp){
            log.info("Result: null");
            return null;
        }
    }


    public Boolean sheffer (Boolean firstOperand, Boolean secondOperand){
        log.info("sheffer operation: "+ firstOperand+ ", " + secondOperand);
        try {
            if (firstOperand == true && secondOperand == true) {
                log.info("Result: false");
                return false;
            } else {
                log.info("Result: true");
                return true;
            }
        }
        catch (NullPointerException exp){
            log.info("Result: null");
            return null;
        }
    }



    public Boolean peirce (Boolean firstOperand, Boolean secondOperand){
        log.info("peirce operation: "+ firstOperand+ ", " + secondOperand);
        try {
            if (firstOperand == false && secondOperand == false) {
                log.info("Result: true");
                return true;
            } else {
                log.info("Result: false");
                return false;
            }
        }
        catch (NullPointerException exp){
            log.info("Result: null");
            return null;
        }
    }

    public Boolean XNOR (Boolean firstOperand, Boolean secondOperand){
        log.info("XNOR operation: "+ firstOperand+ ", " + secondOperand);
        try {
            if (firstOperand == false && secondOperand == false) {
                log.info("Result: true");
                return true;
            } else if (firstOperand==true && secondOperand==true){
                log.info("Result: true");
                return true;
            }
            log.info("Result: false");
            return false;
        }
        catch (NullPointerException exp){
            log.info("Result: null");
            return null;
        }
    }

    public Boolean XOR (Boolean firstOperand, Boolean secondOperand){
        log.info("XOR operation: "+ firstOperand+ ", " + secondOperand);
        try {
            if (firstOperand == false && secondOperand == false) {
                log.info("Result: false");
                return false;
            } else if (firstOperand==true && secondOperand==true){
                log.info("Result: false");
                return false;
            }
            log.info("Result: true");
            return true;
        }
        catch (NullPointerException exp){
            log.info("Result: null");
            return null;
        }
    }

    public Boolean implFromAToB (Boolean firstOperand, Boolean secondOperand){
        log.info("implFromAToB operation: "+ firstOperand+ ", " + secondOperand);
        try {
            if (firstOperand == true && secondOperand == false) {
                log.info("Result: false");
                return false;
            } else {
                log.info("Result: true");
                return true;
            }
        }
        catch (NullPointerException exp){
            log.info("Result: null");
            return null;
        }
    }

    public Boolean implFromBToA (Boolean firstOperand, Boolean secondOperand){
        log.info("implFromBToA operation: "+ firstOperand+ ", " + secondOperand);
        try {
            if (firstOperand == false && secondOperand == true) {
                log.info("Result: false");
                return false;
            } else {
                log.info("Result: true");
                return true;
            }
        }
        catch (NullPointerException exp){
            log.info("Result: null");
            return null;
        }
    }

    public Boolean decrement (Boolean firstOperand, Boolean secondOperand){
        log.info("decrement operation: "+ firstOperand+ ", " + secondOperand);
        try {
            if (firstOperand == true && secondOperand == false) {
                log.info("Result: true");
                return true;
            } else {
                log.info("Result: false");
                return false;
            }
        }
        catch (NullPointerException exp){
            log.info("Result: null");
            return null;
        }
    }

    public Boolean increment (Boolean firstOperand, Boolean secondOperand){
        log.info("increment operation: "+ firstOperand+ ", " + secondOperand);
        try {
            if (firstOperand == false && secondOperand == false) {
                log.info("Result: true");
                return true;
            } else {
                log.info("Result: false");
                return false;
            }
        }
        catch (NullPointerException exp){
            log.info("Result: null");
            return null;
        }
    }



}
