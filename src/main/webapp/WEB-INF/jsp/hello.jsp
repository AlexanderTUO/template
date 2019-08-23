<%--
  Created by IntelliJ IDEA.
  User: TYK
  Date: 2019/5/17
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="x-ua-compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>模板</title>

    <%--引入bootstrapcss--%>
    <link rel="stylesheet" href="/static/lib/bootstrap-4.1.2-dist/css/bootstrap.css">
    <link rel="stylesheet" href="/static/lib/bootstrap-select-dist/css/bootstrap-select.css">
    <link rel="stylesheet" href="/static/lib/multiple-select-dist-1.2.1/multiple-select.css">
    <%--<link rel="stylesheet" href="/static/css/login_.css">--%>
    <%--引入jquery库--%>
    <script type="text/javascript" src="/static/lib/jquery-3.3.1.min.js"></script>

    <%--引入bootstrap库--%>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script type="text/javascript" src="/static/lib/bootstrap-4.1.2-dist/js/bootstrap.js"></script>
    <script type="text/javascript" src="/static/lib/bootstrap-select-dist/js/bootstrap-select.js"></script>
    <script type="text/javascript" src="/static/lib/bootstrap-select-dist/js/i18n/defaults-zh_CN.js"></script>
    <script type="text/javascript" src="/static/lib/multiple-select-dist-1.2.1/multiple-select.js"></script>
    <script type="text/javascript" src="/static/js/template.js"></script>
</head>
<body>
hi1，sdss，现在时间是${now}
<p>
    <button id="setSelectsBtn" class="btn btn-default">SetSelects</button>
    <button id="getSelectsBtn" class="btn btn-default">GetSelects</button>
</p>
<select class="selectEx" multiple data-selected-text-format="count > 3" style="width: 300px">
    <option value="1">January</option>
    <option value="2">February</option>
    <option value="3">March</option>
    <option value="4">April</option>
    <option value="5">May</option>
    <option value="6">June</option>
    <option value="7">July</option>
    <option value="8">August</option>
    <option value="9">September</option>
    <option value="10">October</option>
    <option value="11">November</option>
    <option value="12">December</option>
</select>


</body>
</html>
