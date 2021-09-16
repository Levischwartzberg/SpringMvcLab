package mvc.models;

public class Form {

    private Integer formId;
    private String formText;
    private String formPassword;
    private String [] checkBoxChoices;
    private String formTextArea;
    private String radioOption;
    private String selectOption;
    private String multiSelectOption;

    public Form() {}

    public Integer getFormId() {
        return formId;
    }

    public void setFormId(Integer formId) {
        this.formId = formId;
    }

    public String getFormText() {
        return formText;
    }

    public void setFormText(String formText) {
        this.formText = formText;
    }

    public String getFormPassword() {
        return formPassword;
    }

    public void setFormPassword(String formPassword) {
        this.formPassword = formPassword;
    }

    public String[] getCheckBoxChoices() {
        return checkBoxChoices;
    }

    public void setCheckBoxChoices(String[] checkBoxChoices) {
        this.checkBoxChoices = checkBoxChoices;
    }

    public String getFormTextArea() {
        return formTextArea;
    }

    public void setFormTextArea(String formTextArea) {
        this.formTextArea = formTextArea;
    }

    public String getRadioOption() {
        return radioOption;
    }

    public void setRadioOption(String radioOption) {
        this.radioOption = radioOption;
    }

    public String getSelectOption() {
        return selectOption;
    }

    public void setSelectOption(String selectOption) {
        this.selectOption = selectOption;
    }

    public String getMultiSelectOption() {
        return multiSelectOption;
    }

    public void setMultiSelectOption(String multiSelectOption) {
        this.multiSelectOption = multiSelectOption;
    }

    public String printCheckBoxChoices() {
        String checkChoices = "";
//        System.out.println(checkBoxChoices.length);
        for(String check : this.checkBoxChoices) {
            checkChoices += " " + check;
        }
        return checkChoices;
    }

    public String toString() {
//        System.out.println(printCheckBoxChoices());
        return "Text: " + this.formText + "   Password: " + this.formPassword + "   Check Box Choices: " + printCheckBoxChoices()
                + "   Text Area: " + this.formTextArea + "   Radio Choice: " + this.radioOption + "   "
                + "Select: " + this.selectOption + "   MultiSelect: " + this.multiSelectOption;
    }

//    + " Check Box Choices: " + this.printCheckBoxChoices()
}
