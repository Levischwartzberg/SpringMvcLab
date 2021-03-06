<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<form:form modelAttribute="formObject" action="/form" method="post" cssStyle="padding: 50px">

    <form:hidden path="formId"></form:hidden>

    <div class="form-group row">
        <label class="col-3 col-md-2 col-lg-1" for="TextInput">Text: </label>
        <form:input path="formText" type="text" class="form-control col-4 col-md-5" id="TextInput" aria-describedby="text" placeholder="Text"/>
    </div>
    <div class="form-group row" style="padding-bottom: 50px">
        <label class="col-3 col-md-2 col-lg-1" for="exampleInputPassword1">Password:</label>
        <form:input path="formPassword" type="password" class="form-control col-4 col-md-5" id="exampleInputPassword1" placeholder="Password"/>
    </div>
    <div class="form-check">
        <div class="row" style="padding-bottom: 50px">
            <div class="col-1"></div>
            <div class="col-5"><form:checkboxes path="checkBoxChoices" items="${checkBoxOptions}" cssStyle="margin: 15px"/></div>
        </div>
    </div>
    <div class="form-group row">
        <label class="col-3 col-md-2 col-lg-1" for="exampleFormControlTextarea1">Textarea: </label>
        <form:textarea path="formTextArea" class="form-control col-4 col-md-5" id="exampleFormControlTextarea1" rows="3"></form:textarea>
    </div>
    <div class="form-group row">
        <label class="col-3 col-md-2 col-lg-1" for="radio"> Radios: </label>
        <form:radiobuttons path="radioOption" items="${radioOptions}" id="radio" cssStyle="margin: 15px"/>
    </div>
    <div class="form-group row">
        <label class="col-3 col-md-2 col-lg-1" for="inputState">Select</label>
        <form:select path="selectOption" id="inputState" class="form-control col-4 col-md-5">
            <option selected>Choose...</option>
            <option> Option 1</option>
            <option> Option 2</option>
            <option> Option 3</option>
        </form:select>
    </div>
    <div class="form-group row">
        <label class="col-3 col-md-2 col-lg-1" for="inputState">Select</label>
        <form:select path="multiSelectOption" class="form-select col-4 col-md-5" multiple="true" aria-label="multiple select example">
            <form:options items="${multiSelectOptions}"/>
        </form:select>
    </div>
    <div class="row">
        <div class="col-1"> </div>
        <div class="col-5">
            <form:button type="button" class="btn btn-light">Cancel</form:button>
            <form:button type="submit" class="btn btn-primary">Submit</form:button>
        </div>
    </div>
</form:form>