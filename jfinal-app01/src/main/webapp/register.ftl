<#-- @ftlvariable name="hometown" type="java.util.List<String>"-->
<#-- @ftlvariable name="hobbies" type="java.util.List<String>"-->

<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>

    <title>注册界面</title>
    <style>
        form{
            display: table;
        }

        form .field{
            display: table-row;
        }
        form .cell{
            display: table-cell;
            padding-left: 1em;
        }
    </style>
</head>
<body>

    <form action="/doRegister" method="post" autocomplete="off">
        <div class="field">
            <div class="cell">
                <label for="username">用户名</label>
            </div>
            <div class="cell">
                <input id="username" type="text" name="username" required/>
            </div>
        </div>

        <div class="field">
            <div class="cell">
                <label for="password">密　码</label>
            </div>
            <div class="cell">
                <input id="password" type="password" name="password"/>
            </div>
        </div>

        <div class="field">
            <div class="cell">
                <label>性　别</label>
            </div>
            <div class="cell">
                <input id="gender-male" type="radio" name="gender"/><label for="gender-male">男</label>
                <input id="gender-female" type="radio" name="gender"/><label for="gender-female">女</label>
                <input id="gender-unkonwn" type="radio" name="gender" checked/><label for="gender-unkonwn">保密</label>
            </div>
        </div>

        <div class="field">
            <div class="cell">
                <label for="age">年　龄</label>
            </div>
            <div class="cell">
                <input id="age" type="text" name="age"/>
            </div>
        </div>

        <div class="field">
            <div class="cell">
                <label for="hometown">籍　贯</label>
            </div>
            <div class="cell">
                <select id="hometown" name="hometown" required>
                    <option value=""></option>
                    <#list hometown as hometown>
                        <option value="hometown${hometown_index}">${hometown!""}</option>
                    </#list>
                </select>
            </div>
        </div>

        <div class="field">
            <div class="cell">
                <label for="email">邮　箱</label>
            </div>
            <div class="cell">
                <input id="email" type="text" name="email"/>
            </div>
       </div>

        <div class="field">
            <div class="cell">
                <label>爱　好</label>
            </div>
            <div class="cell">
                <#list hobbies as hobby>
                  <input id="hobby-${hobby_index}" type="checkbox" name="hobby" value="${hobby_index}"/>
                    <label for="hobby-${hobby_index}">${hobby}</label>
                </#list>
            </div>
        </div>

        <div class="cell">
            <input type="submit" value="注册"/>
        </div>
    </form>

</body>
</html>
