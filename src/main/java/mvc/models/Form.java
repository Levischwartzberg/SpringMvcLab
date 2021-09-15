package mvc.models;

public class Form {

    private Integer formId;
    private String formText;
    private String formPassword;
    private Boolean checkBox1;
    private Boolean checkBox2;
    private Boolean checkBox3;
    private String formTextArea;
    private String radioOption;
    private String selectOption;

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

    public Boolean getCheckBox1() {
        return checkBox1;
    }

    public void setCheckBox1(Boolean checkBox1) {
        this.checkBox1 = checkBox1;
    }

    public Boolean getCheckBox2() {
        return checkBox2;
    }

    public void setCheckBox2(Boolean checkBox2) {
        this.checkBox2 = checkBox2;
    }

    public Boolean getCheckBox3() {
        return checkBox3;
    }

    public void setCheckBox3(Boolean checkBox3) {
        this.checkBox3 = checkBox3;
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

    private String multiSelectOption;


}
