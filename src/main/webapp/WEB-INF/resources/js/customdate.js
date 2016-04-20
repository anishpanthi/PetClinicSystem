$(document).ready(function() {
	$("#paymentDate").pickadate();
})

function confirmDelete(delForm, delUrl) {
	if (confirm("Are you sure you want to delete this car ?")) {
		delForm.action = delUrl;
		return true;
	}
	return false;
}

function searchCat(){
	var cat = $('#carCat').val();
	
	$.ajax({
		url:'http://localhost:8080/carrentalsystem/carList/'+cat,
		method:'GET',
		data:{category:cat},
		dataType:'json',
		success:function(data){
			console.log(data);
		},
		
		error: function(err){
			console.log(err);
		}
		
	})
	
}