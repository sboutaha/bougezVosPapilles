<%@ page import="java.util.List, commandesEnLigne.PlatPerso_itf" %>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>Menu - Bougez Vos Papilles</title>

	<link rel="stylesheet" media="screen" href="listeRestaurantDeco.css">
	<link rel="alternate" type="application/rss+xml" title="RSS" href="http://www.csszengarden.com/zengarden.xml">

	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="author" content="Sofia Boutahar">
	<meta name="description" content="La liste des plats proposé">
	<meta name="robots" content="all">


	<!--[if lt IE 9]>
	<script src="script/html5shiv.js"></script>
	<![endif]-->
</head>

<body id="css-zen-garden">
<div class="page-wrapper">

	<section class="intro" id="zen-intro">
		<header role="banner">
			<h1></h1>
		</header>

		<div class="summary" id="zen-summary" role="article">
			<p>Une sélection raffinée des meilleurs restaurants de France et pour tous les goûts.</p>
			
		</div>
		
<%! List<PlatPerso_itf> listePlats; %>
<% listePlats = (List<PlatPerso_itf>) request.getAttribute("listePlats"); %>
<% for (PlatPerso_itf r : listePlats) { %>
		<div class="preamble" id="zen-preamble" role="article">
			<h3><%=r.getPlat()%><%=r.getPrix()%></h3>
			<%if(r.getDescription()!=null) {%>
			<p><%=r.getDescription()%> </p>
			<%} %>
		</div>
	</section>
	<% } %>
<a href=""> Commander <%=r.getNom()%> </a> %>
<br/>
<a href=""> Retour <%=r.getNom()%> </a> %>


<div class="extra1" role="presentation"></div><div class="extra2" role="presentation"></div><div class="extra3" role="presentation"></div>
<div class="extra4" role="presentation"></div><div class="extra5" role="presentation"></div><div class="extra6" role="presentation"></div>

</body>
</html>