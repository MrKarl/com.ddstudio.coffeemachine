$(document).ready(function(){
	var getMenu = function() {
		var url = "/api/menu";
		var method = "get";
		
		$.ajax({
			url : url,
			method : method,
			success : function(result) {
				console.log(result);
				
				
				var $menu = $('#menu');
				var menu_info = {};
				var category = [];
				for(var i=0; i<result.length; i++) {
					if( category.indexOf(result[i].drinkCategory) < 0 ) {
						category.push(result[i].drinkCategory);
						menu_info[result[i].drinkCategory] = [];
					} 
					
					menu_info[result[i].drinkCategory].push(result[i]);
				}
				
				console.log(menu_info);
				
				var html_drink = "";
				var drinkCategory = "";
				var drinkName = "";
				var drinkNo = "";
				
				for(var j in menu_info) {
					drinkCategory = j.toString();
					html_drink = "<optgroup label='"+drinkCategory+"'>";
					for(var k=0; k < menu_info[j].length; k++) { 
						drinkNo = menu_info[j][k].drinkNo;
						drinkName = menu_info[j][k].drinkName;
						
						 html_drink += "<option value='"+drinkNo+"'>"+drinkName+"</option>";
					}
					html_drink += "</optgroup>";
					
					$menu.append(html_drink);
				}
				
				
				getOrdererInfo();
			}	
		});
	}

	var getOrdererInfo = function() {
		var roomId = $('#roomId').val();
		var url = "/api/room/"+roomId+"/orderer";
		var method = "get";
		
		$.ajax({
			url : url,
			method : method,
			success : function(result) {
				console.log(result);
			}
		});
	}
	
	
	getMenu();
});