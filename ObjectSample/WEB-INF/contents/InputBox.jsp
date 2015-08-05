<%@page contentType="text/html;charset=UTF-8"%>
<div id ="inputBox">
<form method="post" action="ObjectSampleServlet" autocomplete="off">
	<table border="1">
	<tr class="name">
		<td>名前</td>
		<td>
			<input type="text" name="name" size="30"onchange="showFukidasi(this.form, 'name', ['name',]);" onKeyUp="showFukidasi(this.form, 'name', ['name',]);">
			<span class="fukidasipop">ProfileObject.名前 = <span id="name"></span></span>  
		</td>
	</tr>
	<tr class="birthDay">
		<td>誕生日</td>
		<td>
			<input type="date" name="birthDay"onchange="showFukidasi(this.form, 'birthDay', ['birthDay',]);">
			<span class="fukidasipop">ProfileObject.誕生日 = <span id="birthDay"></span></span>
		</td>
	</tr>
	<tr class="old">
		<td>年齢</td>
		<td>
			<input type="number" name="old" max="99" min="0"onchange="showFukidasi(this.form, 'old', ['old',]);"onKeyUp="showFukidasi(this.form, 'old', ['old',]);">
			<span class="fukidasipop">ProfileObject.年齢 = <span id="old"></span></span>
		</td>
	</tr>
	</table>
	<input type="submit" value="送信" name="sendBtn">
</form>
</div>