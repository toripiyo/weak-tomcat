<div>
<section>
<form action="/app/xss" method="post">
<h3>OWASP Top10 A3-Cross-Site Scripting(XSS)</h3>
<p>Input</p>
<p><b>&lt;script&gt;alert("good security")&lt;/script&gt;</b></p>
<p>You can experience XSS vulnerability.</p>
<input type="text" name="message">
<br>
<input type="submit" value="Submit">
</form>
</section>
</div>
