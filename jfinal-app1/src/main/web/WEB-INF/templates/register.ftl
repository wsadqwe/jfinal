<#-- @ftlvariable name="hometownList" type="java.util.List<String>" -->
<#-- @ftlvariable name="hobbies" type="java.util.List<String>" -->
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <title>用户注册</title>
    <style>
        form{
            display: table;
        }
        form .field{
            display: table-row;
        }
        form .cell{
            display: table-cell;
        }
    </style>
</head>
<body>
<form action="/doRegister" method="post" autocomplete="off">
    <div class="field">
        <div class="cell"> <label for="username">用户名</label></div>
        <input type="text" name="username" id="username" required>
    </div>
    <div class="field">
        <div class="cell"> <label for="password">密　码</label></div>
        <input type="password" name="password" id="password" required>
    </div>
    <div class="field">
        <div class="cell">  <label>性　别</label></div>
        <input type="radio" id="gender-male" name="gender" value="0"><label for="gender-male">男</label>
        <input type="radio" id="gender-female" name="gender" value="1"><label for="gender-female">女</label>
        <input type="radio" id="gender-unknown" name="gender" checked value="2"><label for="gender-unknown">保密</label>
    </div>
    <div class="field">
        <div class="cell">
            <label for="hometown">籍　贯</label>
        </div>
        <div class="cell">
            <select name="hometown" id="hometown" required>
                <option value="">----请选择一项</option>
                <#list  hometownList as hometown>
                    <option value="${hometown_index}">${hometown!""}</option>
                </#list>
            </select>
        </div>
    </div>
    <div class="field">
        <div class="cell">
            <label>爱　好</label>
        </div>
        <div class="cell">
            <#list hobbies as hobby>
                <#if hobby??>
                    <input type="checkbox" name="hobby" id="hobby-${hobby_index}" value="${hobby_index}">
                    <label for="hobby-${hobby_index}">${hobby}</label>
                </#if>
            </#list>
        </div>
    </div>
    <input type="submit" value="注册">
</form>
</body>
</html>