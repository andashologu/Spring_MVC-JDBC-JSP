<!DOCTYPE html><!--  This site was created in Webflow. https://www.webflow.com  -->
<!--  Last Published: Sat Sep 24 2022 15:52:55 GMT+0000 (Coordinated Universal Time)  -->
<html data-wf-page="6314531ffac8ee7944bfdba8" data-wf-site="6314505830b53a85e1e51a9e">
<head>
  <meta charset="utf-8">
  <title>signup</title>
  <meta content="signup" property="og:title">
  <meta content="signup" property="twitter:title">
  <meta content="width=device-width, initial-scale=1" name="viewport">
  <meta content="Webflow" name="generator">
  <link href="css/normalize.css" rel="stylesheet" type="text/css">
  <link href="css/webflow.css" rel="stylesheet" type="text/css">
  <link href="css/log-reg.webflow.css" rel="stylesheet" type="text/css">
  <!-- [if lt IE 9]><script src="https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.3/html5shiv.min.js" type="text/javascript"></script><![endif] -->
  <script type="text/javascript">!function(o,c){var n=c.documentElement,t=" w-mod-";n.className+=t+"js",("ontouchstart"in o||o.DocumentTouch&&c instanceof DocumentTouch)&&(n.className+=t+"touch")}(window,document);</script>
  <link href="images/favicon.ico" rel="shortcut icon" type="image/x-icon">
  <link href="images/webclip.png" rel="apple-touch-icon">
</head>
<body class="body">
  <div class="container">
    <div class="w-form">
      <!--form id="wf-form-Login-Form" name="wf-form-Login-Form" data-name="Login Form" method="get" class="form"-->
        <form action="#" th:action="@{/register}" th:object="${user}" method="post" class="form">
        <div class="content lgn">
          <div class="form-wrap lgn extra-marg">
            <div class="form-wrap lgn extra-marg"><input type="text" class="text-field half-width lgn username sgn w-input" maxlength="256" name="username" data-name="username" placeholder="Username" id="username" required=""><input type="text" class="text-field half-width lgn email sgn w-input" autocomplete="off" maxlength="256" name="email" data-name="email" placeholder="Email" id="email" required=""><input type="password" class="text-field half-width lgn password sgn w-input" maxlength="256" name="password" data-name="password" placeholder="Password" id="password" required=""></div>
          </div>
          <div class="button-wrap">
            <input type="submit" id="sgn-bttn" href="#" class="slider-right sgn w-button" value="Sign up"/>
          </div>
        </div>
      </form>
      <div class="w-form-done">
        <div>Thank you! Your submission has been received!</div>
      </div>
      <div class="w-form-fail">
        <div>Oops! Something went wrong while submitting the form.</div>
      </div>
    </div>
  </div>
  <script src="https://d3e54v103j8qbb.cloudfront.net/js/jquery-3.5.1.min.dc5e7f18c8.js?site=6314505830b53a85e1e51a9e" type="text/javascript" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
  <script src="js/webflow.js" type="text/javascript"></script>
  <!-- [if lte IE 9]><script src="https://cdnjs.cloudflare.com/ajax/libs/placeholders/3.0.2/placeholders.min.js"></script><![endif] -->
</body>
</html>