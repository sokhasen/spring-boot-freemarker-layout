<#include "../layouts/master.ftl">
<#macro head>
    <title>Override Example</title>
</#macro>

<#macro content>
    <h1>Override Page</h1>
    <p>Simple Override <b> ${ message } </b></p>
</#macro>

<#macro foot>
    <footer> <small>&copy; Copyright 2021, Example default Corporation</small> </footer>
</#macro>

<@master/>

