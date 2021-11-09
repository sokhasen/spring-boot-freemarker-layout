<#import "../layouts/master.ftl" as extends>

<@extends.head>
    <title>Extends Example</title>
</@extends.head>

<@extends.content>
    <h1>Extends Page</h1>
    <p>Simple Extends <b> ${ message } </b></p>
</@extends.content>

<@extends.foot/>


