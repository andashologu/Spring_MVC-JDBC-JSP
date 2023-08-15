<div>
    <h2>Reset Your Password</h2>
</div>
         
<form th:action="@{/reset_password}" method="post" style="max-width: 350px; margin: 0 auto;">
    <input type="hidden" name="token" th:value="${token}" />
<div class="border border-secondary rounded p-3">
    <div>
        <p>
            <input type="password" name="password" id="password" class="form-control"
                placeholder="Enter your new password" required autofocus />
        </p>         
        <p>
            <input type="password" class="form-control" placeholder="Confirm your new password"
                required oninput="checkPasswordMatch(this);" />
        </p>         
        <p class="text-center">
            <input type="submit" value="Change Password" class="btn btn-primary" />
        </p>
    </div>
</div>
<script src="https://d3e54v103j8qbb.cloudfront.net/js/jquery-3.5.1.min.dc5e7f18c8.js?site=6314505830b53a85e1e51a9e" type="text/javascript" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
<script>
    function checkPasswordMatch(fieldConfirmPassword) {
    if (fieldConfirmPassword.value != $("#password").val()) {
        fieldConfirmPassword.setCustomValidity("Passwords do not match!");
    } else {
        fieldConfirmPassword.setCustomValidity("");
    }
}
</script>
</form>