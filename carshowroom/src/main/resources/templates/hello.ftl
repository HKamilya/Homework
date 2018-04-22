<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<ul>
<#list car as car>
    <li>${car}</li>
</#list>
</ul>
<form method="post" action="/updatecar">
    <div>Id:</div>
    <input type="text" name="id"><br>
    <div>Mark:</div>
    <input type="text" name="mark"><br>
    <div>Model:</div>
    <input type="text" name="model"><br>
    <div>Price:</div>
    <input type="number" name="price"><br>
    <div>Color:</div>
    <input type="text" name="color"><br>
    <input type="submit">
</form>
</body>
</html>