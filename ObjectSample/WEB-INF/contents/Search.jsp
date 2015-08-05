<%@page contentType="text/html;charset=UTF-8"%>
<form method="post" action="ObjectSampleServlet" autocomplete="off">
<div class="searchFukidasi">
	<table>
		<tr class="searchWord">
			<td>
				<select name="selectProperty"onchange="showFukidasi(this.form, 'searchFukidasi', ['searchWord','selectProperty']);">
					<option value="名前">名前</option>
					<option value="誕生日">誕生日</option>
					<option value="年齢">年齢</option>
				</select>
			</td>
			<td>
				<input type="text" name="searchWord" size="30"onchange="showFukidasi(this.form, 'searchFukidasi', ['searchWord','selectProperty ']);"onKeyUp="showFukidasi(this.form, 'searchFukidasi', ['searchWord','selectProperty']);"/>
			</td>
			<td>
				<input type="submit" value="検索" name="searchBtn">
			</td>
		</tr>
	</table>
	<span class="fukidasipop">検索(ProfileObject.<span id="selectProperty"></span> == <span id="searchWord"></span>)</span>
</div>
</form>