$.getJSON( "js/prodotti.json", function( data ) {
	
  var prodotti = [];
  
  $.each( data, function( key, value ) {
	  
	  prodotti.push("<li>");
		  prodotti.push("<ol>");
		  
		  $.each( value, function( i, valore ) {
			  prodotti.push( "<li id='" + i + "'>" + valore + "</li>" );
		  });
		  prodotti.push("</ol>");
	  prodotti.push("</li>");
	  
	 // prodotti.push( "<li id='" + key + "'>" + val.Autore + "</li>" );
  });
 
  $( "<ul/>", {
    "class": "my-new-list",
    html: prodotti.join( "" )
  }).appendTo( "body" );
  
});