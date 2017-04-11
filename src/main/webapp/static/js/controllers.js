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
		    url: 'http://localhost:8080/voiture',
		    data: selected,
		    headers: {'Content-Type': 'application/json'}
		}).
		error(function(data, status, headers, config) {
			alert("Erreur http get : " + status);
		});
	};     
});

rentControllers.controller("modifierController", function($scope,$http,$routeParams) {

	$http.get('http://localhost:8080/voiture/11AA22').
	  success(function(data, status, headers, config) {
	  	$scope.voiture = data;
	  }).
	  error(function(data, status, headers, config) {
		  alert("Erreur http get : " + status);
	  });
	
	$scope.modifierVoiture = function(voiture) {
		$http({
		    method: 'PUT',
		    url: 'http://localhost:8080/voiture',
		    data: voiture,
		    headers: {'Content-Type': 'application/json'}
		}).
		error(function(data, status, headers, config) {
			alert("Erreur http get : " + status);
		});
	};


        
});
