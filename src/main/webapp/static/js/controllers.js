'use strict';

var rentControllers = angular.module('rentControllers', []);

rentControllers.controller("rentController", function($scope,$http,$routeParams) {

	$http.get('http://localhost:8080/voiture').
	  success(function(data, status, headers, config) {
	  	$scope.listeVoitures = data;
	  	$scope.selected = data[0];
	  }).
	  error(function(data, status, headers, config) {
		  alert("Erreur http get : " + status);
	  });
	
	$scope.choisirVoiture = function(selected) {
		
		$http({
		    method: 'POST',
		    url: 'http://localhost:8080/voitre',
		    data: selected,
		    headers: {'Content-Type': 'application/json'}
		}).
		error(function(data, status, headers, config) {
			alert("Erreur http get : " + status);
		});
	};


        
});
