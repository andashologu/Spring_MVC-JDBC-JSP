<html lang="en" xmlns="http://www.w3.org/1999/xhtml"
  xmlns:th="http://www.thymeleaf.org">
    <head>
        <title>Register</title>
    </head>
    <body>
        <form action="#" th:action="@{/register}" th:object="${user}" method="post">
            <table>
                <tr>
                    <td><label for="firstName">Username</label></td>
                    <td><input th:field="*{username}" type="text" name="username"></input></td>
                </tr>
                <tr>
                    <td><label for="emailId">Email</label></td>
                    <td><input th:field="*{email}" type="text" name="email"></input></td>
                </tr>
                <tr>
                    <td><label for="password">Password</label></td>
                    <td><input th:field="*{password}" type="password" name="password"></input></td>
                </tr>
                <tr>
                    <td><input type="reset" value="Clear"/></td>
                    <td><input type="submit" value="Submit"></input></td>
                </tr>
            </table>
        </form>
    </body>
</html>