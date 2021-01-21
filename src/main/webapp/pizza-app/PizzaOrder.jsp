<%--
  Created by IntelliJ IDEA.
  User: kaitlinmuse
  Date: 1/21/21
  Time: 11:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order Your Pizza</title>
</head>
<body>
    <h2>Order your pizza here!</h2>
    <form action="PizzaOrder.jsp" method="POST">
        <label for="crust-type">Select Your Crust</label>
        <select name="crust-type" id="crust-type">
            <option value="regular">Regular</option>
            <option value="thin-crust">Thin Crust</option>
            <option value="deep-dish">Deep Dish</option>
        </select>
        <label for="sauce-type">Select Your Sauce</label>
        <select name="sauce-type" id="sauce-type">
            <option value="marinara">Marinara</option>
            <option value="pesto">Pesto</option>
            <option value="alfredo">Alfredo</option>
        </select>
        <label for="size">Select Your Size</label>
        <select name="size" id="size">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
            <option value="x-large">Extra Large</option>
        </select>
        <h4>Pick your toppings:</h4>
        <label for="topping1">Pepperoni</label>
        <input type="checkbox" id="topping1" name="topping1" value="Pepperoni">
        <label for="topping2">Sausage</label>
        <input type="checkbox" id="topping2" name="topping2" value="Sausage">
        <label for="topping3">Mushrooms</label>
        <input type="checkbox" id="topping3" name="topping3" value="Mushrooms">
        <label for="topping4">Onions</label>
        <input type="checkbox" id="topping4" name="topping4" value="Onions">
        <label for="address">Enter your deliver address:</label>
        <input type="text" id="address">



    </form>

</body>
</html>
