<html>
<head>
    <title>展示用户数据</title>
    <meta charset="UTF-8">
</head>
<body>
    <table border="1" align="center" width="50%">
        <tr>ID</tr>
        <tr>Name</tr>
        <tr>Age</tr>
        <#list users as user>
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.age}</td>
            </tr>
        </#list>
    </table>
</body>
</html>