<%@ page import="java.util.List, commandesEnLigne.Restaurant_itf" %>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>Liste des Restaurants - Bougez Vos Papilles</title>

	<link rel="stylesheet" media="screen" href="C:/Users/sofia/Desktop/projet/menuPrincipal/listeRestaurantDeco.css">
	<link rel="alternate" type="application/rss+xml" title="RSS" href="http://www.csszengarden.com/zengarden.xml">

	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="author" content="Sofia Boutahar">
	<meta name="description" content="La liste des restaurants proposé">
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
			<p>Une sélection raffinée des meilleurs restaurants de France et pour tous les goûts.</p>
			
		</div>
		
<%! List<Restaurant_itf> listeRestaurants; %>
<% listeRestaurants = (List<Restaurant_itf>) request.getAttribute("listeRestaurants"); %>
<% for (Restaurant_itf r : listeRestaurants) { %>
		<div class="preamble" id="zen-preamble" role="article">
			<h3><%=r.getNom()%></h3>
			<p><%=r.getDescription()%> </p>
			<a href="GestionCommande?page=listedesRestaurants&redirection=menu&nomRestaurant =<%=r.getNom()%>"> Consulter le menu du restaurant <%=r.getNom()%> </a>
			<br/>
			<br/>
			<a href="GestionCommande?page=listedesRestaurants&redirection=commande&nomRestaurant =<%=r.getNom()%>"> Effectuer une commande au restaurant <%=r.getNom()%> </a>
		</div>
	</section>
	<% } %>



<div class="extra1" role="presentation"></div><div class="extra2" role="presentation"></div><div class="extra3" role="presentation"></div>
<div class="extra4" role="presentation"></div><div class="extra5" role="presentation"></div><div class="extra6" role="presentation"></div>

</body>
</html>