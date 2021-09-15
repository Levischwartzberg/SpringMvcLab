<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<form>
    <div class="form-group row">
        <label class="col-1" for="TextInput">Text: </label>
        <input type="text" class="form-control col-5" id="TextInput" aria-describedby="text" placeholder="Text">
    </div>
    <div class="form-group row">
        <label class="col-1" for="exampleInputPassword1">Password:</label>
        <input type="password" class="form-control col-5" id="exampleInputPassword1" placeholder="Password">
    </div>
    <div class="form-check col-6">
        <div class="row">
            <div>
                <input type="checkbox" class="form-check-input pr-20" id="exampleCheck1">
                <label class="form-check-label" for="exampleCheck1">Check Box 1</label>
            </div>
            <div>
                <input type="checkbox" class="form-check-input pr-20" id="exampleCheck2">
                <label class="form-check-label" for="exampleCheck1">Check Box 2</label>
            </div>
            <div>
                <input type="checkbox" class="form-check-input pr-20" id="exampleCheck3">
                <label class="form-check-label" for="exampleCheck1">Check Box 3</label>
            </div>
        </div>
    </div>
    <div class="form-group row">
        <label class="col-1" for="exampleFormControlTextarea1">Textarea: </label>
        <textarea class="form-control col-5" id="exampleFormControlTextarea1" rows="3"></textarea>
    </div>
    <div class="form-group row">
        <label class="col-1"> Radios: </label>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="option1" checked>
            <label class="form-check-label" for="exampleRadios1">
                Option 1
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios2" value="option2">
            <label class="form-check-label" for="exampleRadios2">
                Option 2
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios3" value="option3" disabled>
            <label class="form-check-label" for="exampleRadios3">
                Option 3
            </label>
        </div>
    </div>
    <div class="form-group row">
        <label class="col-1" for="inputState">Select</label>
        <select id="inputState" class="form-control col-5">
            <option selected>Choose...</option>
            <option> Option 1</option>
            <option> Option 2</option>
            <option> Option 3</option>
        </select>
    </div>
    <div class="form-group row">
        <label class="col-1" for="inputState">Select</label>
        <select class="form-select col-5" multiple aria-label="multiple select example">
            <option selected>Select (Multiple)</option>
            <option value="1">One</option>
            <option value="2">Two</option>
            <option value="3">Three</option>
        </select>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>