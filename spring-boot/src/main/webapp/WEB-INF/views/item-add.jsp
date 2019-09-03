<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="itemAddForm" class="itemForm" method="get" action="/insert">
	    <table cellpadding="5">
	        
	        
	        <tr>
	            <td>FIELDTBL :</td>
	            <td><input class="easyui-textbox" type="text" name="FIELDTBL" data-options="required:true" style="width: 280px;"></input></td>	        </tr>
	        <tr>
	            <td>TBLTYPE :</td>
	            <td><input class="easyui-textbox" type="text" name="TBLTYPE" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>BZ :</td>
	            <td><input class="easyui-textbox" type="text" name="BZ" data-options="required:true" style="width: 280px;"></input></td>	        </tr>
	        <tr>
	            <td>TBLENNAME :</td>
	          	<td><input class="easyui-textbox" type="text" name="TBLENNAME" data-options="required:true" style="width: 280px;"></input></td>	        </tr>
	        <tr>
	            <td>TBLATTR :</td>
	            <td><input class="easyui-textbox" type="text" name="TBLATTR" data-options="required:true" style="width: 280px;"></input></td>	        </tr>
	        <tr>
	            <td>TBLCHNAME :</td>
	            <td><input class="easyui-textbox" type="text" name="TBLCHNAME" data-options="required:true" style="width: 280px;"></input></td>	        </tr>
	    </table>
	    <input type="submit" value="提交表单">
	</form>
</div>

