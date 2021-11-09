<#macro content>
    <#assign nested><#nested/></#assign>
     <#if nested?has_content>
        ${nested}
    <#else/>
        <h1>Blank Page</h1>
        <p>This is the content of the page!</p>
    </#if>
</#macro>