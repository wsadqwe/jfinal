<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>

    <title>登录界面</title>
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

    <form action="/loginCheck" method="post">
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
        <div class="cell"><input type="submit" value="登录"/></div>

    </form>



</body>
</html>
