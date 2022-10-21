<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
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
<form action="/loginCheck" method="post" autocomplete="off">
    <div class="field">
        <div class="cell"> <label for="username">用户名</label></div>
        <input type="text" name="username" id="username" required>
    </div>
    <div class="field">
        <div class="cell"> <label for="password">密　码</label></div>
        <input type="password" name="password" id="password" required>
    </div>
    <input type="submit" value="登录">
</form>
</body>
</html>