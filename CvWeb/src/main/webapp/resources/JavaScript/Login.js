/**
 * 
 */
function checkUserName() {
	var userName = document.getElementById("userName").value;
	var patt = /^[a-zA-Z0-9]+$/;
	var result = patt.test(userName);
	if (result) {
		document.getElementById("lblUserName").style.color = "green";
	} else {
		document.getElementById("lblUserName").style.color = "red";
	}
}

function checkPassword() {
	var password = document.getElementById("password").value;
	var patt = /^[a-zA-Z0-9]+$/;
	var result = patt.test(password);
	if (result) {
		document.getElementById("lblPassword").style.color = "green";
	} else {
		document.getElementById("lblPassword").style.color = "red";
	}
}



