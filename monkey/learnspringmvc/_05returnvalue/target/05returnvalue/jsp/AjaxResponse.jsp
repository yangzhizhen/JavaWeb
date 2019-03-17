<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/js/jquery-3.3.1.js"></script>
</head>
<body>
    <button id="ajaxResponse">提交</button>
</body>
<script>
    $(function () {
        $("#ajaxResponse").click(function () {
            // $.ajax({
            //     method:"post",
            //     url:"/ajaxResponse.do",
            //     data:{name:"monkey",age:23},
            //     dataType:"json",
            //     success:function (result) {
            //         alert(result.name + "," + result.age);
            //     }
            // });

            //
            // $.ajax({
            //     method:"post",
            //     url:"/returnString.do",
            //     success:function (result) {
            //         alert(result);
            //     }
            // });

            $.ajax({
                method:"post",
                url:"/returnMap.do",
                success:function (result) {
                    alert(result.hello + "," + result.world);
                }
            });
        });
    });

</script>
</html>
