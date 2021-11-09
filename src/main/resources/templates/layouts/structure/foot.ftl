<#macro foot>
    <#assign nested><#nested/></#assign>
     <#if nested?has_content>
        ${nested}
    <#else/>
        <footer> <small>&copy; Copyright 2021, Example Corporation</small> </footer>
    </#if>
</#macro>