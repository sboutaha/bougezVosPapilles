<%@ page import="java.util.List, java.util.Hashtable, java.util.Set, java.util.Collection, commandesEnLigne.Restaurant_itf" %>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>Liste des Restaurants - Bougez Vos Papilles</title>

	<link rel="stylesheet" media="screen" href="listeRestaurantDeco.css">
	<link rel="alternate" type="application/rss+xml" title="RSS" href="http://www.csszengarden.com/zengarden.xml">

	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="author" content="Sofia Boutahar">
	<meta name="description" content="La liste des restaurants propos�">
	<meta name="robots" content="all">


	<!--[if lt IE 9]>
	<script src="script/html5shiv.js"></script>
	<![endif]-->
</head>

<body id="css-zen-garden">
<div class="page-wrapper">

	<section class="intro" id="zen-intro">
		<header role="banner">
			<h1>Liste des restaurants</h1>
		</header>

		<div class="summary" id="zen-summary" role="article">
			<p>Une s�lection raffin�e des meilleurs restaurants de France et pour tous les go�ts.</p>
			
		</div>
<br></br>
<br></br>
<br></br>
<br></br>
<br></br>
														
<%! Collection<Restaurant_itf> listeRestaurants; %>
<% listeRestaurants = (Collection<Restaurant_itf>) request.getAttribute("tableRestaurants"); %>
<% for (Restaurant_itf r : listeRestaurants) { %>
		
			<h3><%=r.getNom()%></h3>
			<%if(r.getDescription()!=null) {%>
			<p><%=r.getDescription()%> </p>
			<%} %>
			<a href="GestionCommande?page=listedesRestaurants&redirection=menu&idRestaurant =<%=r.getId()%>"> Consulter le menu </a>
			<br/>
			<br/>
			<a href="GestionCommande?page=listedesRestaurants&redirection=commande&idRestaurant =<%=r.getId()%>"> Effectuer une commande </a>
		
	</section>
	<% } %>



<div class="extra1" role="presentation"></div><div class="extra2" role="presentation"></div><div class="extra3" role="presentation"></div>
<div class="extra4" role="presentation"></div><div class="extra5" role="presentation"></div><div class="extra6" role="presentation"></div>

</body>
</html>