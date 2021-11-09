<#macro head>
    <#assign nested><#nested/></#assign>

    <#if nested?has_content>
        ${nested}
    <#else/>
       <title>Page title!</title>
        <link rel="stylesheet" href="/css/default.css">
    </#if>
</#macro>



