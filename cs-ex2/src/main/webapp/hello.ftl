<#-- @ftlvariable name="students" type="java.util.List<nxu.it.Student>" -->
<!doctype html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <style>
        .vip {
            font-size: 1.1em;
            color: teal;
        }
    </style>
</head>
<body>

    <h2>你好，<span class="vip">${username!'无名氏'}</span>！</h2>

<div>
    您今年${(age>=18)?string("已经成年","还未成年")}！
</div>

<table>
    <tr>
        <th>学号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>年龄</th>
    </tr>
    <#list students as student>
        <tr>
            <td>${student.sno!}</td>
            <td>${student.name}</td>
            <td>${student.gender}</td>
            <td>${student.age}</td>
        </tr>
    </#list>
</table>

<div>
    我是其他的内容
</div>
</body>
</html>