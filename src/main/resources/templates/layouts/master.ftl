<#include "structure/head.ftl">
<#include "structure/foot.ftl">
<#include "structure/content.ftl">

<#macro master>
    <!doctype html>
    <html>
    <head>
        <@head/>
    </head>
    <body>

    <@content/>

    <@foot/>
    </body>
    </html>
</#macro>