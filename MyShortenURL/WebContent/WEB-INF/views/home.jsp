<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <c:url value="/createTiny" var="recordsUrl"/>
    <html>
    <head>
    <link rel="stylesheet" type="text/css" media="screen" href='<c:url value="/resources/css/jquery-ui/pepper-grinder/jquery-ui-1.8.16.custom.css"/>'/>
	<link rel="stylesheet" type="text/css" media="screen" href='<c:url value="/resources/css/ui.jqgrid-4.3.1.css"/>'/>
	<link rel="stylesheet" type="text/css" media="screen" href='<c:url value="/resources/css/style.css"/>'/>
	
	<script type='text/javascript' src='<c:url value="/resources/js/jquery-1.6.4.min.js"/>'></script>
	<script type='text/javascript' src='<c:url value="/resources/js/jquery-ui-1.8.16.custom.min.js"/>'></script>
	<script type='text/javascript' src='<c:url value="/resources/js/grid.locale-en-4.3.1.js"/>'></script>
	<script type='text/javascript' src='<c:url value="/resources/js/jquery.jqGrid.min.4.3.1.js"/>'></script>
	<script type='text/javascript' src='<c:url value="/resources/js/custom.js"/>'></script>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Welcome</title>
        <script type="text/javascript">
        
        $(function() {
    		$("#grid").jqGrid({
    		   	url:'${recordsUrl}',
    			datatype: 'json',
    			mtype: 'GET',
    		   	colNames:['Id', 'Username', 'Password', 'First Name', 'Last Name', 'Role'],
    		   	colModel:[
    		   		{name:'originalURL',index:'originalURL', width:100, editable:true, editrules:{required:true}, editoptions:{size:10}},
    		   		{name:'shortURL',index:'shortURL', width:100, editable:true, editrules:{required:true}, editoptions:{size:10}},
    		   	],
    		   	postData: {},
    			rowNum:10,
    		   	rowList:[10,20,40,60],
    		   	height: 240,
    		   	autowidth: true,
    			rownumbers: true,
    		   	pager: '#pager',
    		   	sortname: 'id',
    		    viewrecords: true,
    		    sortorder: "asc",
    		    caption:"Records",
    		    emptyrecords: "Empty records",
    		    loadonce: false,
    		    loadComplete: function() {},
    		    jsonReader : {
    		        root: "rows",
    		        page: "page",
    		        total: "total",
    		        records: "records",
    		        repeatitems: false,
    		        cell: "cell",
    		        id: "id"
    		        
    		    }
    		});

    		
    		// Toolbar Search
    		//$("#grid").jqGrid('filterToolbar',{stringResult: true,searchOnEnter : true, defaultSearch:"cn"});
    	});

        
        </script>
    </head>
    <body>
       <form:form id="urlform" modelAttribute="url" action="createTiny" method="post">
                <table align="center">
                    <tr>
                        <td>
                            <form:label path="originalURL">Original URL:</form:label>
                        </td>
                        <td>
                            <form:input path="originalURL" name="originalURL" id="originalURL" />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td align="left">
                            <form:button id="tiny" name="tiny">Shorten URL</form:button>
                        </td>
                    </tr>
                </table>
            </form:form>
            <table align="center">
            <tr>
						<td>
                           Original URL
                        </td>
                        <td></td>
                        <td>
                            Tiny URL
                        </td>
					</tr>
             <c:forEach items="${tinyurlst}" var="suf">
				    <tr>
				    	<td><c:out value="${suf.originalURL}"/></td>
				    	<td></td>
				    	<td><a href="${pageContext.servletContext.contextPath}${suf.shortURL}"><c:out value="${suf.shortURL}"/></a></td>
				    </tr>
				</c:forEach>
				
				<!-- <div id='jqgrid'>
					<table id='grid'></table>
				</div> -->
            </table>
    </body>
    </html>