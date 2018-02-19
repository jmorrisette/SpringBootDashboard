<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<br>
<br>

	<div class="container">
		<table id="sortableTable"class="table table-striped table-dark">
			<caption>Server Statistics</caption>
			<thead>
				<tr>
					<th>Host Name</th>
					<th>Host Status</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${stats}" var="stat">
					<tr>
						<td>${stat.hostName}</td>
            <td>${stat.hostStatus}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<script>
		$(document).ready(function() {
			$('#sortableTable').DataTable();
		});
	</script>

<%@ include file="common/footer.jspf" %>
