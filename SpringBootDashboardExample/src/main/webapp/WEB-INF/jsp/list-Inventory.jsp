<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<br>
<br>
	

	<div class="container">
		<table class="table table-striped table-dark">
			<caption>Inventory</caption>
			<thead>
				<tr>
					<th>Host Name</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${inventory}" var="item">
					<tr>
						<td>${item.hostName}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
<%@ include file="common/footer.jspf" %>
